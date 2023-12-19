object seventeen_print_alphabets {
  def main(args: Array[String]) : Unit = {
   var a = "a"
   for (i<-0 to 25){
     println((a.head+i).toChar)
   }
  }
}
