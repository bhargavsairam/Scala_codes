object five_check_numbers_1_100 {
  def main(args: Array[String]) : Unit = {
    var a = 20
    if (a >=0 && a <=100){
      if (a>90 && a <=100){println("Super Smart")}
      else if (a>80 && a <=90){println("Smart")}
      else if (a>70 && a <=80){println("smart enough")}
      else if (a>60 && a <=70){println("just smart")}
      else if (a>35 && a <=60){println("no smart")}
      else if (a>=0 && a <=35){println("dump")}
    }else(println("invalid input"))

  }

}
