package com.edu

/* Scala Class demo
 * Variable    Getter ?    Setter?
 * --------------------------------
 * var					yes					yes
 * val					yes					no
 * default			no					no
 *
 */

class User(private var name: String, var age: Int) {
  //User(var name: String, var age: Int)  also known as primary constructor

  /*Auxilary constructor, there can be more than one
   * auxilary constructor having different signatures
   *
   */
  def this() {
    this("Tom", 23);
    println("Auxilary constructor called with no arguments");
  }

  def this(name: String) {
    this(name, 23);
    println("Auxilary constructor called with one arguments");
  }

  //show method prints the class content in desirable format
  def show() { println(s"$name is $age yrs old.") }
}
object ClassDemo {
  def main(a: Array[String]) {
    //creating class objects
    
    //Primary constructor called
    var user1 = new User("Allen", 28);
    user1.show();
    //Auxilary constructor without any argument
    var user2 = new User();
    user2.show();
    //Auxilary constructor with one argument
    var user3 = new User("Deepak");
    user3.show();
    //private members can't be accessed outside the class
    //println(user1.name);
    println(user1.age); //this is allowed
    
    val userArr = Array(user1,user2,user3);
    
    for( i <- 0 to (userArr.size -1)){
      userArr(i).show()      
    }
  }
}