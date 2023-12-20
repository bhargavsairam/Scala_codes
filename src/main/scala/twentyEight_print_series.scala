object twentyEight_print_series {
  def main(args: Array[String]) : Unit = {
    for (i <- 1 to 25){
      if(i%2 !=0){
        if(i%5 == 0){
          println("divisible by 5")
        }
        else{
          println(i)
        }
      }
    }
  }

}
