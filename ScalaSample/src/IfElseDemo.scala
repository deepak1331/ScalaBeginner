

object IfElseDemo {
  def main(a:Array[String]){
    val x = 10;
    
    if(x==10){
      println("x value is 10")
    }else{      
      println("x value is not 10")
    }
    
    var result="";
    if(x%2 == 0){
      result="x is an even number";
    }else{
      result="x is an odd number";
    }
    println(result);
    
    val res =  if(x>20) "x is greater than 20" else "x is less than 20"
      println(res)
  }
}