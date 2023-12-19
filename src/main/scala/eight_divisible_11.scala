object eight_divisible_11 {
  def main(args: Array[String]) : Unit = {
    for(i<-250 to 550){
      if (i%11 == 0){
        println("number "+ i +" is divisible by 11")
      }
    }
  }
}
