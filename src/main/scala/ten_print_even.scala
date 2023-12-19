object ten_print_even {
  def main(args: Array[String]) : Unit = {
    for (i<-700 to 900){
      if (i%2 == 0){
        println(i)
      }
    }
  }
}
