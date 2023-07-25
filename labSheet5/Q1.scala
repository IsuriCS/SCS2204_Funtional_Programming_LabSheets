package labSheet5

object Q1 {

  def main(args: Array[String]): Unit = {
    print(prime(8))
  }

  def prime(n: Int, x: Int = 2): Boolean = x match {
    case x if (x == n) => true
    case x if n % x == 0 => false
    case _ => prime(n, x + 1)
  }
}
