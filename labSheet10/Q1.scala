package labSheet10

object Q1 {

  def calculateAvarage(temp:List[Int]):Int ={
    val faran= temp.map(x => (x*9/5) +32)
    val totalTemp= faran.reduce((x,y) => x+y)
    return totalTemp/faran.length
  }

  def main (args:Array[String]):Unit={
    val celList=List(0,10,20,30)
    println("Celsius Temperature list : "+ celList)
    print("Average Fahrenheit temperature : "+calculateAvarage(celList))
  }
}
