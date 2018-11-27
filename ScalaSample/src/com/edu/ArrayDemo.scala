

object ArrayDemo {

  val arr1: Array[Int] = new Array[Int](4);
  val arr2 = new Array[Double](4);
  val arr3 = Array("Virat", "Ashwin", "Dhawan", "Pandya");

  def main(a: Array[String]) {

    for (i <- 0 to (arr1.length - 1)) {
      println(arr1(i))
    }

    for (x <- arr2) { println(x) }
    
    arr3.foreach(println)
  }
}