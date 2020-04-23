package part_1

import org.apache.spark.sql.SparkSession

object print_sparkconfig
{
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("project-1")
      .config("spark.master","local")
      .getOrCreate()

    val dataDF = spark.read.json(args(0))
    dataDF.show(10)
    //spark.conf.getAll.foreach(println)//prints all spark configuration parameters
  }
}
