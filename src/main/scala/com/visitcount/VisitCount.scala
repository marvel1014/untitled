package com.visitcount

import org.apache.spark.{SparkConf, SparkContext}

object VisitCount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("count").setMaster("local")
    conf.set("spark.testing.memory", "471859200")
    val sc = new SparkContext(conf)
  }


}