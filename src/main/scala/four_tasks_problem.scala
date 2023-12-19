object four_tasks_problem {
  def main(args: Array[String]) : Unit = {
    var a = 102
    if (a >=100 && a <=1000){
      if (a%2 == 0){
        println("number is even");
        println("remainder is " + a%3);
      }else{
        println("number is odd");
        println("remainder is " + a%2)
      }
    }else{
      println("number is not in range")
    }


  }

}
