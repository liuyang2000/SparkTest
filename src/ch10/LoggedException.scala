package ch10

/**
  * Created by liuyang on 2016/9/30.
  */
trait LoggedException extends Exception with Logged{
  def log(): Unit ={
    log(getMessage())
  }
}
