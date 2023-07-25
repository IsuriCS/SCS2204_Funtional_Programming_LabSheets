package labSheet4

object Q2 {
  def main(args:Array[String]):Unit={
    var x= args(0).toInt
    println(PatternMatching(x))
  }

  def PatternMatching(num :Int): String= num match {
    case num if num<=0 => "Nagative or Zero"
    case num if num%2==0 => "Even number"
    case num if num%2==1 => "Odd number"

  }
}
