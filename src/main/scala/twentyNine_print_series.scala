object twentyNine_print_series {
  def main(args: Array[String]) : Unit = {
    for(i <- 5 to 51){
      if(i%2 != 0){
        println("%.1f^2".format((i*0.1)))
      }
    }
  }

}
