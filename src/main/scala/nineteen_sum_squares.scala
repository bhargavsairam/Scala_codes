object nineteen_sum_squares {
  def main(args: Array[String]) : Unit = {
    var sum = 0;
    for (i<-5 to 102){
      sum += i*i
    }
    println(sum)
  }

  }
