import scala.collection.mutable.ArrayBuffer

/**
  * Created by liuyang on 2016/12/26.
  */
object ArrayOps {
  val nums = new Array[Int](10)
  val strs = new Array[String](5)
  val a = Array("12","23")

  for (i <- 0 until a.length){
    println(a(i))
  }

  a.toList

  val b = new ArrayBuffer[Int]()
  b += 1

  b += (1,2,3,4)
  b ++= Array(12,12)

  b.trimEnd(3)

}
