object eighteen_average {
  def main(args: Array[String]) : Unit = {
    var a = 24;
    var sum = 0;
    var count = 0;
    while(a<=100){
      if (a%4 == 0){
        sum += a;
        count += 1;
      }
      a = a+4
    }
    println("average = "+  sum/count)
  }

}
