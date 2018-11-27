

package com.edu

object FunctionDemo {

  //Option 1: You need to define the Return Type , '=' sign and add return statement
  def add(x: Int, y: Int): Int = {
    return x + y;
  }

  //Option 2: same as option 1 minus return keyword
  def subtract(x: Int, y: Int): Int = {
    x - y;
  }

  //Option 3: removed return keyword and curly braces
  def multiply(x: Int, y: Int): Int = x * y

  //Option 4: removed return keyword , return type and curly braces ad
  def divide(x: Int, y: Int) = x / y

  def main(args: Array[String]) {
    val x = 20
    val y = 10
    println(s"Operations on x = $x and y = $y");
    println("Addition       : " + add(x, y))
    println("Subtraction    : " + subtract(x, y))
    println("Multiplication : " + multiply(x, y))
    println("Division       : " + divide(x, y))
  }
} 
