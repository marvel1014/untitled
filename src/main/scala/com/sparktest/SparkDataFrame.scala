package com.sparktest

import org.apache.spark.sql.SparkSession

object SparkDataFrame {
  def main(args: Array[String]): Unit = {
    val ss = SparkSession.builder()
      .appName("SparkDataFrame")
      .config("spark.some.config.option", "some-value")
      .getOrCreate()
    import ss.implicits._
//    val df = ss.read.load("D:\\devFiles\\大数据\\大数据中级课件\\电商流量数据文件\\data\\2015082818")
    val sc = ss.sparkContext()
//    sc.read.load()
//
//    df.show(1)
//    df.createGlobalTempView("data")
//    val sqlDF = ss.sql("select *  from data limit 1")
//    sqlDF.show()


  }

}
