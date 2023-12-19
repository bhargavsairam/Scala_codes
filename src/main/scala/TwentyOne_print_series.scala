object TwentyOne_print_series {
  def main(args: Array[String]) : Unit = {
    var i = 10
    while(i >= -5){
      println("%d@%d".format(i,i-1))
      i = i-1
    }
  }
}
