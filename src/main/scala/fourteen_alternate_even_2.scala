object fourteen_alternate_even_2 {
  def main(args: Array[String]) : Unit = {

    var a = 20
    while (a <= 140) {
      if (a % 2 == 0) {
        if ((a/2)%2 != 0) {
          println(a)
        }
        a = a+ 2
      }
    }
  }
}
