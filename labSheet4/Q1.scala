package labSheet4

import scala.io.StdIn.readLine

object Q1 {
  def main(args:Array[String]): Unit = {
    print("Enter diposit amount : ")
    var amount = readLine().toDouble
    println("Interest is "+ calculateInterest(amount))
  }

  def calculateInterest(amount:Double):Double=amount match{
    case x if x<20000 => amount * 0.02
    case x if x <=200000 => amount * 0.04
    case x if x <= 2000000 => amount * 0.35
    case x if x > 2000000 => amount * 0.65

  }
}
