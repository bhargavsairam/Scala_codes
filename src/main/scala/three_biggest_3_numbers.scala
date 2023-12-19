object three_biggest_3_numbers {
  def main(args: Array[String]) : Unit = {
    var a = 10
    var b = 20
    var c = 30
    if (a>b && a >c){
      println("a is greater");
    } else if(b>a && b>c){
      println("b is greater");
    }else{
      println("c is greater")
    }

  }

}
