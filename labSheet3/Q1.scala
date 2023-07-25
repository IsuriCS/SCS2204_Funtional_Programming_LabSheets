package labSheet3
import scala.io.StdIn.readLine

object Q1 {
  def main(args:Array[String]): Unit = {
    println("Enter String : ")
    var word=readLine()
    println(reverse(word))
  }

  def reverse(word:String): String = {
    if (word.length==0) {
      return ("")
    }
    else{
       return (reverse(word.tail)+word.head)
    }

  }
}

