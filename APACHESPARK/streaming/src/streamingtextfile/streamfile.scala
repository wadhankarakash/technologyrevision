package streamingtextfile
import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds,StreamingContext}
import java.sql.Time
import java.util.Calendar

object streamfile {
  
  def main(args:Array[String])
  {
    val conf = new SparkConf().setAppName("streamfile").setMaster("local")
    val ssc = new StreamingContext(conf,Seconds(15))
    val dstream = ssc.textFileStream("/home/vaibhav/Desktop/streamtext")
    val count = 1
    val d = dstream.flatMap(q => (q.split(" "))).map(q => (q.toUpperCase(),1)).groupByKey().map(q=>(q._1,q._2.sum))
    d.saveAsTextFiles(Calendar.getInstance().get(Calendar.MINUTE) + "file",".txt")
    
    
    ssc.start()
    ssc.awaitTermination()
  }
    
  
}