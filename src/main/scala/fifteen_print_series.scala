object fifteen_print_series {
  def main(args: Array[String]) : Unit = {
  for (i <- 2 to 16){
    println(("%d*%d").format(i,i+1)+ " = "+ i*(i+1))
  }
  }

}
