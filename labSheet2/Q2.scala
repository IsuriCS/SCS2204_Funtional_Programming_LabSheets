package labSheet2

object Q2 {
  def main (args: Array[String]): Unit = {
    var (a, b, c, d) = (2, 3, 4, 5)
    var k: Float = 4.3f

    println("Scala doesn't has \"++\" or \"--\" operators.")
//    c++
    println("- -b * a + c *d - - =" + ((b - 1) * a + c * d))
    d -= 1
    println("a++ = " + a)
    a += 1
    println("–2 * ( g – k ) +c = There isn't declare a variable as \"g\"")
    println("We can't exicute these both lines in scala; it will make an exicution error.")
    println("c = c ++");
    println("c =++ c * a ++");


  }

}
