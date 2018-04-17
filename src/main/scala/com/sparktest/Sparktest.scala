package com.sparktest
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql._

object Sparktest {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("Hello")
    val sc = new SparkContext(conf)
    val l = List("a b c","d e")
    val rdd = sc.parallelize(l)
    rdd.flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_).foreach(println)


//    sc.textFile("").map(s =>s.split("//t"))
//    val sc1 = new Stream
  }

}
