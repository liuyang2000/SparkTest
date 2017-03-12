package ch10

/**
  * Created by liuyang on 2016/9/30.
  */
trait Logger {
  def log(msg : String)

  def info(msg : String) {log("Info : " + msg)}
  def error(msg : String) {log("Error : " + msg)}
  def debug(msg : String) {log("Debug : " + msg)}

  def logSth(msg : String) : Unit = {println(msg)}
}
