
//Match is like Switch cases in Java
package com.edu

object MatchDemo {
  
  def main(a:Array[String]){
  val ageGroup="Old"
  
  var range= ageGroup match{    
    case "Teenage" => "Age is between 13-19";
    case "Kid" => "Age is between 0-12";
    case "Young" => "Age is between 20-35"
    case "Adult" => "Age is between 36-60"
    case "Old" =>"Age is greater than 60 "
      
    case _ => "Default"     
  }
  
  println(range)
}
}