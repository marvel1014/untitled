import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.math._
import scala.util.Random
import scala.util.matching.Regex
BigInt.probablePrime(100,Random)
"hello"(4)
var list1 = new ListBuffer[Int]()
list1 += (1,2,3)
list1.head
list1.last
list1.length
list1.map(x=>x+1)
list1.filter(x=>x%2==0)
var list2 = List(3)
list1 -- list2
val list3 = List("hello wordk","word ddd","ddd")
val rest = list3.flatMap(a => a.split(" ")).map(a =>(a,1)).groupBy(_._1).map(t => (t._1,t._2.size))
var hashmap = new mutable.HashMap[String,String]
hashmap.put("id","value")
"Hello"(0)
"Hello"(4)
"Hello".take(1)
"Hello".reverse(0)
"Hello".takeRight(1)
val w = "World" ; println("Hello $w")
val a = Array[Int](1, 1)
val a1 = Array[Int](0, 0)
val t1 = Array(1, 3)
val t2 = Array(2, 4)
t1.zip(t2)
Array.ofDim[Int](2,3)
val tokens = "one two three four two two three four".split(" ")













