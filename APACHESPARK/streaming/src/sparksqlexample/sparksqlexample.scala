package sparksqlexample
import org.apache.spark.sql.{SQLContext}
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext


object sparksqlexample {
  def main(args:Array[String])
  {
    val warehouseLocation = "hdfs://localhost:9000/home/vaibhav/spark-warehouse"
    val conf = new SparkConf().setAppName(s"sqlcontext").
    setMaster("local").
    set("spark.sql.warehouse.dir", warehouseLocation);
    
    val sc = new SparkContext(conf)
    val sqlsc = new SQLContext(sc)
    
    //akashwad_retail_db_txt.db/customers
    
    val dbdf = sqlsc.sql("show databases")
    dbdf.show()
    print("*******************************" + dbdf.count())
 
    
      
      //print("????????????????????????? " + df.count())
      
  }
}