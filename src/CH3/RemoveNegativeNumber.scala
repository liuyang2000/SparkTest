package CH3

import scala.collection.mutable.ArrayBuffer

/**
  * Created by liuyang on 2016/9/17.
  */
object RemoveNegativeNumber {
  def main(args: Array[String]): Unit = {
    val a = ArrayBuffer(1,2,3,4,-1,0,3,4,2+1,2,-1,3,4,-2,-3,2)

    println(a.max)

    var first = true
    var n = a.length
    var i = 0

    for(value <- a){
      print(" " + value)
    }
    while(i < n){
      if(a(i) >= 0){ i += 1}
      else {
        if(first) { first = false ; i += 1}
        else {a.remove(i); n -= 1}
      }
    }

    println()


    for(value <- a){
      print(" " + value)
    }
  }


}
