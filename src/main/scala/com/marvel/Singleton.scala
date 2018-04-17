package com.marvel

class Singleton {

}
object  Singleton{
  private  var s:Singleton =null
  def getInstance():Singleton ={
    if(s == null){
      new Singleton()
    }else{
      s
    }

  }

  def main(args: Array[String]): Unit = {
    var s = Singleton.getInstance()
    println(s)
  }
}

