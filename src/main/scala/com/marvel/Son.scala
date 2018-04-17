package com.marvel
class Son(name:String,id:Int,addr:String) extends Father(name,id){
  override def eat(name: String): Unit = {
    println("hello");
  }
}

object Son {

}
