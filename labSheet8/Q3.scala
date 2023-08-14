package labSheet8

object Q3 {
  def main(args: Array[String]): Unit = {
    val names = Array("Benny", "Niroshan", "Saman", "Kumara")

    println(formatName(names(0), toUpper))
    println((formatName(names(1).substring(0, 2), toUpper)) + (formatName(names(1).substring(2), toLower)))
    println(formatName(names(2), toLower))
    println(formatName(names(3).substring(0, 1), toUpper) + formatName(names(3).substring(1, names(3).length - 1), toLower) + formatName(names(3).substring(names(3).length - 1), toUpper))

  }


  val toUpper=(x:String) => x.toUpperCase
  val toLower=(x:String)=>x.toLowerCase
  val formatName:(String, String => String) => String = (name, formatFun) => formatFun(name)
}
