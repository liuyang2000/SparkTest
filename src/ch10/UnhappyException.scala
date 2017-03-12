package ch10

/**
  * Created by liuyang on 2016/9/30.
  */
class UnhappyException extends IndexOutOfBoundsException with LoggedException {
  override def getMessage(): String = "unhappyException message"
}

object UnhappyException{
  def main(args: Array[String]): Unit = {
    val a = new UnhappyException
    a.log("df")
  }


}
