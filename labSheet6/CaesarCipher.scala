package labSheet6

import scala.io.StdIn

object CaesarCipher {
  def main(args: Array[String]): Unit = {
    caesarCipher()
  }

  def encriptCalculation(i:Char , k: Int ):Int={
    val pnum=i.toInt-65
    return ((pnum+k)%26)+65
  }

  def encription(p:String,k:Int):String={
    val pArray=p.toUpperCase.toArray
    val cArry=pArray.map(encriptCalculation(_,k).toChar)
    return cArry.mkString
  }

  def decryptCalculation(i: Char, k: Int): Int = {
    val pnum = i.toInt - 65
    return ((pnum - k) % 26) + 65
  }

  def decryption(p: String, k: Int): String = {
    val pArray = p.toUpperCase.toArray
    val cArry = pArray.map(decryptCalculation(_, k).toChar)
    return cArry.mkString

  }

  def caesarCipher(): Unit={
    println("Enter process number \n1. Encription \n2. Decription ")
    val choice=StdIn.readInt()

    println("Enter Text : ")
    val text= StdIn.readLine()

    println("Enter key : ")
    val key=StdIn.readInt()

    choice match {
      case x if choice==1 => println("Encripted text :"+encription(text,key))
      case x if choice==2 => println("Decripted text :"+decryption(text,key))
      case _ => println("Invalied Input")
    }

  }

}