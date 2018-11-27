

object SetDemo {

  val set1: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 9, 7, 8, 9);
  val set2 = Set(11, 12, 13, 14, 15, 8, 9, 10);
  val set3 = Set("Virat", "Ashwin", "Dhawan", "Ashwin", "Dhawan", "Pandya");
  var mutableSet = scala.collection.mutable.Set("bmw", "audi", "ferrai")

  def main(a: Array[String]) {

    println(set1)
    println(set3)
    println("set1.head : " + set1.head)
    println("set1.tail : " + set1.tail)
    println("set1.isEmpty : " + set1.isEmpty)
    println("set1.max : " + set1.max)
    println("set2.min : " + set2.min)
    println(set1 + 10)
    println(mutableSet)

    //Adding two set
    println(set1 ++ set2)
    println(set1.++(set2))

    //Intersect 
    println(set1 & set2)
    println(set1.intersect(set2))
    
    //foreach
    set3.foreach(println)
  }
}