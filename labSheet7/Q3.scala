package labSheet7


import scala.io.StdIn.readLine

object Q3 {

  def main(args: Array[String]): Unit = {
    print("Enter number list : ")
    val numberList: List[Int] = ((readLine().split(",").map(_.toInt)).toList)

    println(filterPrime(numberList))
  }

  def filterPrime(arr: List[Int]): List[Int] = {

    arr.filter(num => isPrime(num))
  }

  def isPrime(i: Int): Boolean = {
    if (i <= 1)
      return false
    else if (i == 2)
      return true
    else
      !(2 to (i - 1)).exists(x => i % x == 0)
  }
}
