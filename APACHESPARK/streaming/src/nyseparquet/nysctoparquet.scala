package nyseparquet
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.{SQLContext}
import org.apache.spark.sql.types._


object nysctoparquet {
  
  def main(args:Array[String]){
  
    val conf = new SparkConf().setAppName(s"nyscparquet").
    setMaster("local");
    
   val sc = new SparkContext(conf)
   val sqlsc = new SQLContext(sc)   
   

   val songSchema = StructType( /* Used for schema, works but lots of typing and what if we only need a sub-set of data? */

StructField("vala",StringType,true) ::
StructField("valb", StringType,true):: 
StructField("valc", StringType,true):: 
StructField("vald", StringType,true):: 
StructField("vale", StringType,true):: 
StructField("valf", StringType,true):: 
StructField("valg",StringType,true) :: 
StructField("valh", StringType,true):: 
StructField("vali", StringType,true):: 
Nil)

val df = sqlsc.read.option("delimiter", "|").
         schema(songSchema).
         csv("hdfs://localhost:9000/ltr/data/nyse/companylist_noheader.csv")
   print("******************************************")
df.show();
  df.write.format("parquet").save("hdfs://localhost:9000/ltr/data/nyse/companylist.parquet")
  
   
   
   print("the final coun is ******************" + df.show())
  }
    
   
   
}