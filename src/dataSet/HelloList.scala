package dataSet

/**
  * Created by liuyang on 2016/12/29.
  */
object HelloList {


  def main(args: Array[String]): Unit = {
    /*val data = List(1,1,2)

    val data1 = 1 :: 1 :: 2 :: Nil

    println(data)
    println(data1)

    val List(a,b,c) = data
    println(a + " + " + b + " + " + c)
*/

    val sdata = List(1, 23, 0, 2, 4, 1)
    sdata.map(_.toString)
    println(sortList(sdata))

    def sortList(list: List[Int]): List[Int] = list match {
      case List() => {
        println("list()")
        List()
      }
      case head :: tail => {
        println(" head : " + head + " tail : " + tail)
        compute(head, sortList(tail))
      }
    }

    def compute(data: Int, dataSet: List[Int]): List[Int] = dataSet match {
      case List() => {
        println("data : " + data)
        List(data)
      }
      case head :: tail => {
        if (data <= head) {

          print("dataSet : " + dataSet + "   ")
          println("data <= head : " + data + " <= " + head + " DATASET : " + dataSet)
          data :: dataSet
        }
        else {
          print("dataSet : " + dataSet + "   ")
          println("data > head : " + data + " <= " + head)
          head :: compute(data, tail)
        }

      }
    }
  }

}
