package dataSet

/**
  * Created by liuyang on 2017/1/6.
  */


object Map {
  def main(args: Array[String]): Unit = {
    val map = (1->2)

    val aa = List.range(9,1,3)
    println(aa)

    println(List.apply(1,2,3,"df"))

    val str = "1" concat "1212"
    println(str)

    val bb = List.apply(1,2,3,"23")
    println("bb : " + bb)
    println("reverse bb : " + bb.reverse)

    println(List.range(1,5))

    val zipped = "asdf".toList zip List(1, 2, 3, 4, 5)
    println(zipped)

    println(zipped.unzip)

    println(List(List(),List(1,2),List("a","vb")).flatten)



  }
}
