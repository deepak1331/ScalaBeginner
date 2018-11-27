

package com.edu

object MapDemo {
  val myMap: Map[Int, String] = Map(1 -> "Deepak", 2 -> "Nisha", 3 -> "Shipra")

  def main(args: Array[String]) {
    println(myMap);

    println(myMap(2));
    println(myMap.values)
    println(myMap.keys)
    println(myMap.isEmpty)
    println(myMap.contains(5))
    
    myMap.keys.foreach( key =>
      println(s"Key : $key has value "+myMap(key))
      )
  }
}
