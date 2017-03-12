package ch12

import scala.math._
/**
  * Created by liuyang on 2016/9/30.
  */
class Test {

}

object Test{

  def valAtOne(f : (Double) => Double) = f(22)

  def mulBy(factor : Double) = (x : Double) => x* 3 * factor

  def main(args: Array[String]): Unit = {
    val fun_ceil = ceil _
    val fun_sqrt = sqrt _



    val fun_mulBy = mulBy(3)

    println(fun_mulBy(10))

    Array(1,2,3,4).map((x : Int) => 3+x)

    println(valAtOne(fun_ceil))
    println(valAtOne((fun_sqrt)))

  }
}
