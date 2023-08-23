package labSheet9

object Q1_Q2 {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator must not be zero")

    val numerator= n
    val denominator =d

    def printr(): Unit = {
      print(s"Rational number :- ${numerator} / ${denominator}\n")
    }

    def neg(): Unit = {
      val z = new Rational(-numerator, denominator)
      print(s"Negative :- ${z.numerator} / ${z.denominator}\n")


    }

    def -(i: Rational): Rational = {
      val w=new Rational(numerator * i.denominator - i.numerator * denominator, denominator * i.denominator)
      return w
    }

    def sub (i:Rational):Rational={
      this -i
    }

  }

  def main(args : Array[String]):Unit={
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2,7)

    println("Question 1")
    x.printr()
    x.neg()

    println("\nQuestion 2")
    val result =(x.sub(y)).sub(z)
    println("Substraction")
    result.printr()
  }
}
