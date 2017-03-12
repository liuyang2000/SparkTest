package ch10

/**
  * Created by liuyang on 2016/9/30.
  */
class CheckedAccount extends Account with Logged{
  def withDraw(amount : Double): Unit ={
    log("amount : " + amount)
  }

}

object CheckedAccount{
  def main(args: Array[String]): Unit = {
    val acc_1 = new CheckedAccount
    acc_1.withDraw(12)

    val acc_2 = new CheckedAccount with ConsoleLoggerNew
    acc_2.withDraw(123)
  }

}
