

object OptionTypeDemo {
  
  val list = List(1,5,6,9,7,4)
  val map = Map( 1->"Deep", 2->"Shipra",3->"Geeta",4->"Shashi")
  val opt:Option[Int] = Some(10)
  
  def main(a:Array[String]){
    
    println(list.find(_ > 7).get)
    println(list.find(_ > 9).getOrElse("such value not exist in list"))
    println(map.get(2).getOrElse("No name found with given ID"))
    println(map.get(5).getOrElse("No name found with given ID"))
    println(opt.isEmpty)
    println(opt.get)
    
  }
}