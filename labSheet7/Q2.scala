package labSheet7

import scala.io.StdIn.readLine

object Q2 {

  def main(args: Array[String]): Unit = {
    print("Enter number list : ")
    val numberList: List[Int] = ((readLine().split(",").map(_.toInt)).toList)

    println(CalculateSquare(numberList))

  }

  def CalculateSquare(numberList: List[Int]): List[Int] = {

    //Lamda funtion
    val Squarefuntion = (x: Int) => x*x

    val SquareList = numberList.map(Squarefuntion)
    return SquareList

  }
}
