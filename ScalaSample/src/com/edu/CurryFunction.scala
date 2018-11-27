/*
 * Currying is the technique to transform a method
 *  that take multiple arguments into a method 
 *  which takes only one argument.
 */

package com.edu

object CurryFunction {

  def sum(x: Int, y: Int) = x + y;
  def currySum(x: Int) = (y: Int) => x + y;
  def sum2(x: Int)(y: Int) = x + y

  def main(args: Array[String]) {
    println(sum(10, 20))
    println(currySum(10)(20))

    val partialSum = currySum(10)

    println(partialSum(30))
    val partialSum2 = sum2(20)_
    println(partialSum2(30))
  }
}