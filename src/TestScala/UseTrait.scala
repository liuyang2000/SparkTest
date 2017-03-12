package TestScala

/**
  * Created by liuyang on 2016/12/28.
  */
class UseTrait {

}

trait Logger{
  def log(msg : String)

  def loger(msg : String): Unit ={
    println("logger : " + msg)
  }
}

class ConcreateLogger extends Logger with Serializable{
  override def log(msg: String): Unit = {
    println("concreatelogger ： " + msg)
  }

  override def loger(msg: String): Unit = {
   /* super.loger(msg)
    println("concreatelogger override loger : " + msg)*/
  }
}

trait OtherLogger extends Logger with Serializable{
  override def log(msg: String): Unit = {
    println("concreatelogger ： " + msg)
  }

  override def loger(msg: String): Unit = {
    super.loger(msg)
    println("OtherLogger override loger : " + msg)
  }
}

object UseTrait{
  def main(args: Array[String]): Unit = {
     val ll =  new ConcreateLogger with OtherLogger
     ll.loger("dfdf")
  }
}
