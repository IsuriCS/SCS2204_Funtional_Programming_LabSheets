package labSheet2


object Q4 {
  def main(args: Array[String]): Unit = {

    var (price, max_price) = (5, 5)
    var (attend, max_attend) = (160, 160)
    var max = 0

    while (attend >= 20) {
      var Profit = profit(price, attend)
      if (Profit > max) {
        max = Profit
        max_price = price
        max_attend = attend
      }
      price += 5
      attend -= 20
    }

    println("Ticket price = " + max_price)
    println("Attendence = " + max_attend)

  }

  def totalCost(attendee: Int) = 500 + (attendee * 3)

  def totalIncome(price: Int, attendee: Int) = price * attendee

  def profit(price: Int, attendee: Int): Int = {
    val income = totalIncome(price, attendee)
    var cost = totalCost(attendee)
    return (income-cost)

  }

}
