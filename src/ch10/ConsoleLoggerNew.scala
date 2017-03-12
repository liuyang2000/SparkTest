package ch10

/**
  * Created by liuyang on 2016/9/30.
  */
trait ConsoleLoggerNew extends Logged{
  override def log(msg : String): Unit ={
    print(msg)
  }
}
