package com.marvel
import scala.beans.BeanProperty

class TestClass {
  var print ={
    println("hello")
  }
  @BeanProperty var a = 10
  def main(args: Array[String]): Unit = {
    println("hello")
  }

}
