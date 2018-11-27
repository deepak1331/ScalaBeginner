

package com.edu

object App {
  def main(a:Array[String]){
    println("Hello World from Scala !")
    
    println("Using for loop")
    for(i<- 1 to 10){
      println(i);
    }
    
    println("Using .to")
     for(i<- 1.to(10)){
      println(i);
    }
     
     println("Using until")
     for( i<- 1.until(5)){println(i)}
  }
}