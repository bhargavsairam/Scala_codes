object Twenty_six_print_format {
  def main(args: Array[String]) : Unit = {
    for (i <- 1 to 36){
    if (i%2 != 0) {
      println(i)
    }
      else{
        println("even")
      }
    }

  }

}
