package ch2

/**
  * Created by liuyang on 2016/9/16.
  */
object MyFor {
  def main(args: Array[String]): Unit = {
    scalaFor()
  }

  def scalaFor() : Unit = {
    for(i <- 10 to 0){
      print(" " + i)
    }


    println("-------")

    val a = Array(1,2,3,4)
    val result = for(elem <- a) yield 2 * elem
    for(c <- result){
      print(c + "  ")
    }

    println("-----------")

    val result_2 = for(elem <- a if elem % 2 == 0) yield 2 * elem
    for(c <- result_2){
      print(c + "  ")
    }

    println("-----------")

  }
}
