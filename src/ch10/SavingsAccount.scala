package ch10

/**
  * Created by liuyang on 2016/9/30.
  */
class SavingsAccount extends Account with Logger{
  override def log(msg: String): Unit = {
    println("nihao")
  }

  def withDraw(amount : Int): Unit ={
    if(amount > balance){
      logSth("amount > balance")
    } else {
      logSth("amount <= balance")
    }
  }
}
