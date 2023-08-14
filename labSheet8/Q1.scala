package labSheet8

import scala.io.StdIn.readLine

object Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter diposit amount : ")
    var amount = readLine().toDouble
    println("Interest is " + calculateInterest(amount))
  }

  val calculateInterest: Double => Double = {
    case x if x < 20000 => x * 0.02
    case x if x <= 200000 => x * 0.04
    case x if x <= 2000000 => x * 0.35
    case x if x > 2000000 => x * 0.65

  }
}
