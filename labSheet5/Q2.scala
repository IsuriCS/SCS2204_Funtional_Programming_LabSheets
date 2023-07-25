package labSheet5

object Q2 {

  def main(args:Array[String]):Unit={
    primeSeq(10)
  }

  def prime(n: Int, x: Int = 2): Boolean = x match {
    case x if (x == n) => true
    case x if n % x == 0 => false
    case _ => prime(n, x + 1)
  }

  def primeSeq(n:Int):Unit={
    for ( i <- 0 until  n){
      if (prime(i)){
        println(i)
      }
    }
  }

}
