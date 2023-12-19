object twelve_count_even {
  def main(args: Array[String]) : Unit = {
    var a = 0;
    var b = 2;
    var count = 0;
    for(i <-a to b){
      if (i % 2 == 0){
        count += 1
      }
    }
    println(count)
  }
}
