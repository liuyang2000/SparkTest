package CH3

/**
  * Created by liuyang on 2016/9/17.
  */
object Random {
  def main(args: Array[String]): Unit = {
    val a = for (i <- 1 to 10) yield {
      var b = util.Random.nextInt(10);
      if (b != 0 && b != 10) {
        b
      }
    }


    for (value <- a) {
      print(" " + value)
    }
    println()
    val scores = Map(1 -> 2, 2 -> 4, 5 -> 10)
    print(scores.getOrElse(3, 0))

    for((k,v) <- scores){
      println(k  + " -> " + v)
    }

    for(k <- scores.keys; v <- scores.values){
      println(k  + " -> " + v)
    }

    println("nihao".zip("java"))
  }

  def minmax(values : Array[Int]) : Unit = {

  }
}
