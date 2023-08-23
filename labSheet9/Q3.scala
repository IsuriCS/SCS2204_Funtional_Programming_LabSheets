package labSheet9

object Q3 {

  class BankAc(b: Double,id:Int){

    var balance=b

    def deposit(amount:Double): Unit = {
      balance=balance+amount
      println(s"Account : ${id} => ${amount} diposited. Current balance ${balance}")
    }

    def withdraw (amount: Double): Unit = {
      if (balance>= amount){
        balance = balance -amount
        println(s"Account : ${id} => ${amount} withdrawed. Current balance ${balance}")
      }
      else{
        println(s"Account : ${id} => Insufficient balance to withdraw")
      }
    }

    def tranceferd(amount: Double, x:BankAc): Unit = {
      if (balance >= amount) {
        balance = balance - amount
        x.deposit(amount)
        println(s"Account : ${id} => ${amount} transferd . Current balance ${balance}")
      }
      else {
        println(s"Account : ${id} => Insufficient balance to trancefer")
      }
    }
  }

  def main(args : Array[String]):Unit={
    val ac1 = new BankAc(5000,1000)
    val ac2 = new BankAc(7000,1001)

    ac1.deposit(6000)
    ac1.withdraw(3000)
    ac1.tranceferd(4000,ac2)
  }
}
