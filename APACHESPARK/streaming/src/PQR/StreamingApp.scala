package PQR
import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds,StreamingContext}
import org.apache.spark.storage.StorageLevel

object StreamingApp extends App {
  
  val conf = new SparkConf().setAppName("StreamingApp").setMaster("local")
  val ssc = new StreamingContext(conf,Seconds(5))
  val a = ssc.socketTextStream("localhost",12345)
  
  val b = a.flatMap(q=> q.split(" ")).map(q => (q.toUpperCase(),1)).groupByKey().map(q=> (q._1,q._2.sum)).print()
  
  ssc.start()
  ssc.awaitTermination()
  
  
}