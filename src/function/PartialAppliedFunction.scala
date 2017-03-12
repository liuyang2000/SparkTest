package function

/**
  * Created by liuyang on 2016/12/29.
  */
object PartialAppliedFunction {

  def main(args: Array[String]): Unit = {
    val data = List(1, 2, 3, 4, 5)
    data.foreach(x => x + " ")
    data.foreach(print)

    println

    data.foreach((x: Int) => {
      print(x)
    })
    println

    def sum(a: Int, b: Int, c: Int) = a + b + c

    print(sum(1, 2, 3))
    println

    val fp_a = sum _
    println(fp_a(2, 3, 4))
    println(fp_a.tupled.apply(1, 1, 1))

    val fp_b = fp_a(1,_ : Int,2)
    println(fp_b(10))

    data.foreach(print _)
    println
    println(data.formatted(",").toString)
    data.foreach(print)

  }
}
