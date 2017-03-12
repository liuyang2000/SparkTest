package ch5

/**
  * Created by liuyang on 2016/9/17.
  */
class Counter extends App{
  var value = 0

  def increment(): Unit = {
    value += 1
  }

  def current() = value

  def isLess(other : Counter) = {
    value < other.value
  }

}

object Counter{
  //val a = (x:Int) => x+1+1

  def main(args: Array[String]): Unit = {
    print(1)
  }
}
