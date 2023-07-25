package labSheet2

object Q3 {
  def main (args:Array[String]): Unit = {
    println("Take Home Salary = "+ TakeHomeSalary())
  }

  def CalculateTax(salary:Double):Double=salary*0.12

  def CalculateOt(otHours:Int):Double=otHours*85.0

  def CalculateNormal(normalHours:Int):Double=normalHours*250.0
  def TakeHomeSalary():Double= {
    var salary:Double=CalculateNormal(40)+CalculateOt(30)
    salary=salary-CalculateTax(salary)
    return salary
  }
}
