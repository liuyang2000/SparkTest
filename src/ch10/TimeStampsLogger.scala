package ch10

/**
  * Created by liuyang on 2016/9/30.
  */
trait TimeStampsLogger extends Logged with Logger{
  override def log(msg : String){
    super.log(new java.util.Date() + "  " + msg);
  }
}
