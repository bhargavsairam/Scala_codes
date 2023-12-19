object thirteen_alternate_even {
  def main(args: Array[String]) : Unit = {
    var a = 20;
    while(a<=140){
      if (a%2 == 0){
        println(a)
        a = a+4
      }
    }
  }
}
