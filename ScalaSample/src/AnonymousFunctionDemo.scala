

object AnonymousFunctionDemo {

  object Math {
    //Function with default values
    def add(x: Int = 30, y: Int = 15) = x + y;
    def square(x: Int) = x * x;
    //equivalent to add method
    def +(x: Int, y: Int) = x + y;

  }
  //UNIT is equilavent to void, this method doesn't return anything
  def add2(x: Int, y: Int): Unit = { 
    println(x + y);
  }

  //equivalent to square method
  def **(x: Int) = x * x;

  def main(args: Array[String]) {
    //Anonymous Function
    var sum = (y: Int, z: Int) => y + z;
    println(sum(100, 50))
    println("Sum with default value : " + Math.add())
    println("Sum with default value : " + Math.add(10)) //This param will go to the first param
    println("Sum with users value : " + Math.add(10, 20))
    println("Square  : " + Math.square(3))

    println(Math.+(12, 2))
    println("Square  : " + **(7))
    add2(10, 10)
  }
}
