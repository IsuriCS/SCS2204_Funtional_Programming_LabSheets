package labSheet7

import scala.io.StdIn.readLine

object Q1 {

  def main(args:Array[String]):Unit={
    print("Enter number list : ")
    val numberList:List[Int]=((readLine().split(",").map(_.toInt)).toList)

    println(filterEvenNumbers(numberList))

  }

  def filterEvenNumbers(numberList: List[Int]):List[Int]={

    var EvenList: List[Int]=List()

    //Lamda funtion
    val modulefuntion=(x:Int)=>x%2

    val moduleList=numberList.map(modulefuntion)
    return createEvenList(moduleList, numberList)

  }

  def createEvenList(moduleList:List[Int],numberList: List[Int]):List[Int]={
    val len= moduleList.length
    var EvenList: List[Int]=List()

    for (i <- 0 to (len-1)){
      if (moduleList(i) ==0){
        EvenList=EvenList:+ numberList(i)
      }
    }

    return EvenList
  }
}



//5,4,8,9,32,41,56,23