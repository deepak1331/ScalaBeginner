

object TupleDemo {
  //hetrogeneous collection, can contain any type of data
  //max size of tuple is 22
  val myTuple = (1,2.0,"Hi",true,'c')
  val myTuple2 = new Tuple5(1,2.0,"Hi",true,'c')
  //tuple inside tuple 
  val myTuple3= new Tuple3(1,"deepak", ("yamaha","lamborghini"))
  
  def main(a:Array[String]){
    
    println(myTuple)
    println(myTuple._3)
    
    println("MyTuple2 values are as follows: (using productIterator.foreach")
    myTuple2.productIterator.foreach{
      i=>println(i)
    }
    
    println(myTuple3._3._2)
  }
}