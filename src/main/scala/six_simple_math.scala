object six_simple_math {
  def main(args: Array[String]) : Unit = {
    var a = 10
    var b = 20
    var c = '/'
    val calculation: Float = c match {
      case '+' => a+b
      case '-' =>a -b
      case '*' => a*b
      case '/' => (a.toFloat/b)
    }
    println(calculation)

  }
}
