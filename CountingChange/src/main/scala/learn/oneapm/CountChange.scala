package learn.oneapm

/**
 * Created by liudawei on 15/10/19.
 */
object CountChange {

  def countChange(money: Int, coins: List[Int]): Int = {
    if (coins == null) return 0
    money match {
      case 0 => 1
      case x if x < 0 => 0
      case x if coins.isEmpty => 0
      case _ => {
        countChange(money, coins.tail) + countChange(money - coins.head, coins)
      }
    }
  }

  def main(args: Array[String]) {
    countChange(300, List(1, 2, 5));
  }
}
