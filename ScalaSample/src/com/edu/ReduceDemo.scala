package com.edu

object ReduceDemo {

  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val letters = List("A", "B", "C", "D", "E")

  //  val animals="Cat Dog Tiger Lion Cat Dog Tiger Lion Deer Elephant Horse Deer Elephant Horse Deer Elephant Horse Dog Tiger Lion Deer Dog Tiger Lion Deer";

  def main(args: Array[String]) {
    //    val arr = animals.split(" ").map(word=> (word,1))
    //    arr.foreach(println)
    println(list)
     println("Addition with reduceLeft and reduceRight")
     println(list.reduceLeft((x,y) => {println(s"$x + $y"); x+y;}))
     println(letters.reduceLeft(_+_))
          println(list.reduceLeft(_+_))
     println(list.reduceRight(_+_))
     println("Substraction with reduceLeft and reduceRight")
     println(list.reduceLeft(_-_))
     println(list.reduceRight(_-_))
     
     //here 10 will be added to the whole sum
     println(list.foldLeft(10)(_+_))
     //here 'hi ' will be prefixed to the elements
     println(letters.foldLeft("hi ")(_+_))
     
     //Scan gives the List of intermediate results as well
     println(list.scanLeft(100)(_+_))
     //here 'hi ' will be prefixed to the elements
     println(letters.scanLeft("hi ")(_+_))
     
  }
}