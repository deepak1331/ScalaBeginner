

object ListDemo {

  val myList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9);
  val myList2 = List("Virat", "Ashwin", "Dhawan", "Pandya");

  def main(a: Array[String]) {

    println(myList2);
    println("Sachin" :: myList2); //cons - add an element at the beginning of the list
    println(Nil) //creates an empty list
    myList.foreach(println);
    
    for(playerName <- myList2) {
      printf("%s, ",playerName)
    }

    println(s"\nFirst element of the list : " + myList2.head)
    println("List after removing first element of the list  : " + myList2.tail)
    println("isEmpty : " + myList.isEmpty)
    println("Reverse : " + myList.reverse)
    println("max : " + myList.max)
    println("min : " + myList.min)
    var sum = 0;
    myList.foreach(sum += _)
    println("Sum of list : "+ sum)
  }
}