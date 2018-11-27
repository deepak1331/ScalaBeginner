

object HigherOrderFunctionDemo {

  //Math function takes, two Double argument and one function argument
  def Math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y);

  def Math2(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z);

  def main(args: Array[String]) {

    println(Math(10, 20, (x, y) => x + y))
    //Same as above sum method
    println(Math(10, 20, _ + _))
    println(Math(10, 20, (x, y) => x * y))
    //It will pass the result of first two arguments, and use the recursion
    //to get the results by comparing the third arg with first two arg output
    println(Math2(100, 20, 50, _ min _))
    println(Math2(10, 2, 5, _ max _))
    println(Math2(10, 2, 5, _ * _))

  }
}