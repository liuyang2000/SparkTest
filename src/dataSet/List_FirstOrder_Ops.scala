package dataSet

/**
  * Created by liuyang on 2017/1/4.
  */
object List_FirstOrder_Ops {

  def add(n: Int, i: Int) = {
    println("n : " + n + ", i : " + i)
    n + i
  }

  def smaller[T](a:T,b:T)(implicit order : T => Ordered[T]) = {
    if(a > b) b else a
  }

  def main(args: Array[String]): Unit = {
    val data = List(1,2,3,4,5)
    val dataStr = List("a","b","c","d","e")

    println(data.zip(dataStr))
    println(data.zipWithIndex)
    println(data.mkString("[",",","]"))

    val buffer = new StringBuilder
    data.addString(buffer,";")

    val array = new Array[Int](100)
    println(data.copyToArray(array,3))
   // array foreach(print)

    implicit def int2Function(n : Int) = add(n,1)

    val result = 4 + add(1,1)
    println(result)

    println(smaller(1,2))
  }

}
