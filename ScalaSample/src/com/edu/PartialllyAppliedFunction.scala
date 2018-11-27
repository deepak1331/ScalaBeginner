import java.util.Date

object PartialllyAppliedFunction {

  def log(date: Date, message: String) = println(s"$message occurred at $date")
  def main(a: Array[String]) {
    var sum = (x: Int, y: Int, z: Int) => x + y + z
    var partialSum = sum(10, 15, _: Int)

    var date = new Date();
    var tLog = log(date, _: String)
    println(partialSum(5))

    for (j <- 1 to 3) {
      tLog(s"Log message no. $j")
    }
  }

}