package part_1

import org.apache.spark.sql.SparkSession

object read_n_write_file {
  def main(args:Array[String]):Unit={
    val spark = SparkSession.builder()
      .appName("read_n_write_file")
      //.config("spark.master","local")
      .getOrCreate()

    val dataDF = spark.read.json(args(0))

    dataDF.show(10)
    dataDF.write
        .format("csv")
     .save(args(1))

  }
}
