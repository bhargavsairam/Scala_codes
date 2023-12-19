object eleven_odd_numbers {
  def main(args: Array[String]) : Unit = {
    var a = 251;
    while(a>=51){
      if (a%2 !=0){
        println(a);
      }
      a = a-1
    }
  }
}
