package ch10

/**
  * Created by liuyang on 2016/9/30.
  */
class ConsoleLogger extends Logger with Cloneable with Serializable{
  override def log(msg: String): Unit = {
    println(msg)
  }
}
