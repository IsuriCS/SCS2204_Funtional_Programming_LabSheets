package labSheet5

object Q4 {

  def main (args:Array[String]):Unit={
    println("5 is a "+CheckEven(5))
    println("4556 is a "+CheckEven(4556))

  }

  def CheckEven(n:Int):String= n match {
    case x if x==0 => "Even number"
    case x if x==1 => "Odd number"
    case _ => CheckEven(n-2)
  }
}
