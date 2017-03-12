package ch2

/**
  * Created by liuyang on 2016/9/18.
  */
object Test {
  val a = (x : Int) => 1+1+x

  val b = (x:Int , y:String) => x+y

  val c = b(1,_:String)

  def multiply(m: Int)(n: Int): Int = m * n
  val timesTwo = multiply(2) _

  def capitalizeAll(args: String*) = {
    args.map { arg =>
      arg.capitalize
    }
  }

  def main(args: Array[String]): Unit = {
    println(a(1))
    println(b(1,"123"))
    println(c("123"))

    println(multiply(2)(3))
    println(timesTwo(4))
  }
}
