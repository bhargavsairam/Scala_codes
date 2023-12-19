object sixteen_sum_even_numbers {
  def main(args: Array[String]) : Unit = {
    var sum = 0
    for (i<-384 until 582){
      if (i%2 == 0){
        sum += i
      }
    }
    println(sum)
  }
  }
