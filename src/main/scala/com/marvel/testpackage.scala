package com.marvel
import math.sqrt
import scala.collection.mutable
import scala.util.matching.Regex
object testImp{
  implicit  def add(x:String,y:String):String ={
    x+y
  }
}
class  tem{
  val add = (x:Int,y:Int) => x+y
  def sum(args:Int*) = {
    var r = 0
    for(arg <- args)
      r += arg
    r
  }
  def foo1(num:Int) = {println(num * 2)}
  def foo2() {println("Hello World")}
  def foo3(num:Int) = {num * 2}
  def foo4():Unit = {println("Hello World")}
}
object testpackage{

  def main(args: Array[String]): Unit = {
    var i = 2
//    val add =(x:Int,y:Int)=>x+y
    val t = new tem()
    println(t.add(1,2))
    import com.marvel.testImp._
    println(add("a","b"))
    val fruit=List.apply("Apple","Banana","Orange")
    fruit.foreach(println)
    var test = new TestClass()
    test.print
    println(test.getA())
    var arr = new Array[String](10)
    var arr2 = (1,2,3,4)
    val l = List("hello qoute","hellworld","hi all","hi")
    var out = l.flatMap(a => a.split(" ")).map(x =>(x,1)).groupBy(_._1).map(t =>(t._1,t._2.size))
    out.foreach(println)
    val pattern:Regex ="[0-9]+".r
    for(i <-pattern.findAllIn("12 xx3 ")){
      println(i)

    }
    val w = "World"
    println("Hello $w")
    printf("Hello %s", "World\n")
    println(t.sum(1, 1, 1, 2))
    val a = Array(1,2,3)
//    val b = for(elem <- a if elem % 2 == 0) yield 2 * elem
//    val b = for(elem <- a) yield 2 * elem
//    val b = a.map(_*2)
//    val b = 2 * a
//    b.foreach(println)
    val list = List[String]()
//    val list = List[String]('a','b','c')
    val key = Array(1, 2)
    val value = Array("one","two")
    val m =key.zip(value).toMap
    println(m(1))
    val tokens = "one two three four two two three four".split(" ")
    val map = new mutable.HashMap[String,Int]
    for(key <- tokens){
      map(key) = map.getOrElse(key,0) + 1
    }
    map.foreach(println)




  }

}
