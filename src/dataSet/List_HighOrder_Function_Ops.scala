package dataSet

/**
  * Created by liuyang on 2017/1/4.
  */
object List_HighOrder_Function_Ops {
  def main(args: Array[String]): Unit = {
    val data = List("liu", "yang")
    println(data.flatten.formatted(","))

    println(data.map(_.length))
    println(data.flatMap(_.toList))



  }
}
