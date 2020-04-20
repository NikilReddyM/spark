package part_1

import org.apache.spark.sql.SparkSession


object read_csv_file
{
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("projec-1")
      //.config("spark.master","local")
      .getOrCreate()

    //val dataDF = spark.read.json("src/main/resources/data/movies.json")
    //dataDF.show(10)

    spark.conf.getAll.foreach(println)

  }

}
