package labSheet1

object Q1 {

  def main(args:Array[String]): Unit={
    println("01. Area of disk : "+area(5))
    println("02. Fahrenheit temperature : "+cTof(35))
    println("03. Volume of sphere : "+volumeOfSphere(5))
    println("04. Whole cost for 60 copies : "+wholeCost(60))
    println("05. Total running time : "+totalRunningTime(4,3))

  }
  def area(r:Int):Double=22.0/7 * r * r

  def cTof(t:Int):Double=t*1.8000+32.00

  def volumeOfSphere(r:Int):Double=4.0/3*22.0/7*r*r*r

  def wholeCost(books:Int):Double=(24.95 * books)+ shipping(books)-discount(books)
  def discount(books:Int):Double = 24.95 * books *40.0/100
  def shipping(books:Int):Double={
    if(books<=50){
      return 3*books
    }
    else{
      return (3+(0.75*(books-50)))
    }
  }

  def totalRunningTime(p:Int,t:Int):Int=p*8+t*7
}
