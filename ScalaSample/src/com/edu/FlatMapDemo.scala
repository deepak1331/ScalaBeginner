

package com.edu

object FlatMapDemo {

  val list = List(1, 2, 3, 4, 5, 6)
  var csvString = "Deepak,Shipra,Nisha,Shikha,Shubham,Shiva";
  val list2 = List( 5, 6,7,8,9,10)
  val myMap = Map(1 -> "Deepak", 2 -> "Nisha", 3 -> "Shipra")
  
  def main(a: Array[String]) {

    
    println(list)
    println(myMap)
    
    println(list.map(_*2))
    println(list.map(x=>x+2))
    println(list.filter(x=> x>4))
    println("india".map(x=> x.toUpper))
    
    println(list ++ list2)
    println(list.intersect(list2))
    
    println(myMap.mapValues(x=> "Hello ! "+x.toUpperCase()))
    
    println(List(list, list2).flatten)
    println(list.map(x=> List("Hi"+x,x/0.1)))
    println(list.flatMap(x=> List(x,x*10)))
    
    println(list.filter(x=>x%2!=0))
    

  }

}