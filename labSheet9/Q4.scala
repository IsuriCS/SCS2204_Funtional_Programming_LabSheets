package labSheet9

object Q4 {


  class Account(b:Double,ID:Int){
    var balance=b

    def addinterest(): Unit = {
      if (balance<=0){
        balance += balance*0.1
      }
      else{
        balance += balance *0.5
      }
    }

    def getbalance(): Double =  balance;
  }

  class Bank(accounts: List[Account]) {
    def getAccounts: List[Account] = accounts

    def negativeBalances: List[Account] = accounts.filter(_.getbalance < 0)

    def totalBalance: Double = accounts.map(_.getbalance).sum

    def applyInterestToAll(): Unit = {
      accounts.foreach(_.addinterest())
    }
  }

  def main(args: Array[String]): Unit = {
    val account1 = new Account(4000,100)
    val account2 = new Account(-30,101)
    val account3 = new Account(20000,102)
    val account4 = new Account(-100,103)

    val bank = new Bank(List(account1, account2, account3, account4))

    println("List of accounts with negative balances:")
    bank.negativeBalances.foreach(account => println(account.getbalance))

    println(s"\nThe sum of all account balances: ${bank.totalBalance}")

    bank.applyInterestToAll()

    println("\nFinal balances of all accounts after applying interest:")
    bank.getAccounts.foreach(account => println(account.getbalance))
  }

}
