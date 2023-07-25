package labSheet3
import scala.io.StdIn.readLine

object Q2 {

  def main(args : Array [String]): Unit = {
    println("Enter list of stings seperated by a comma : ")
    val words=readLine()
    val lastList=words.split(",")
    filterString(lastList.toList)
  }

  def filterString(words: List[String]):Unit= {
    while (words.length != 0) {

      if (words.head.length >= 5) {
        println(words.head)
      }

    filterString(words.tail)
  }
  }


}




//Isuri,String,Scala,Today,Practical,Programming,Cat,Dog