

package com.edu

object WhileLoop {
  
  def main(a:Array[String]){
    var x =0;
    
    //While loop
    println("While Loop")
    while(x<10){  
      println("x = " + x)
           x += 1;   // x++, ++x, x--, --x aren't valid in Scala unlike Java lang
    }
    
    //Do - WHile
    println("\nDO-While Loop")
    do{
      println(s"x = $x")
      x -= 1;
    }while(x>0)
  }
}