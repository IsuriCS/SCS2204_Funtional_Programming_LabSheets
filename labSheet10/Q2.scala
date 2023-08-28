package labSheet10

object Q2 {

  def countLetterOccurrences(words: List[String]): Int = {
    val wordlen = words.map(x => x.length)
    val len=wordlen.reduce((x,y) => x+y)
    return len
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    println("Word list : "+ words)
    print("Total count of letter occurrences : "+countLetterOccurrences(words))
  }

}
