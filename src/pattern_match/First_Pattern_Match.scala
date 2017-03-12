package pattern_match

/**
  * Created by liuyang on 2016/12/29.
  */
object First_Pattern_Match {
  def main(args: Array[String]): Unit = {
    val data = 1
    val matchResult = data match {
      case 1 => println("one")
      case 2 => println("two")
      case _ => println("error")
    }
    // matchResult 是一个函数
    println(matchResult)

    val result = data match {
      case a if a == 1 => {
        "First: " + a
      }
      case b if b == 2 => {
        "Second: " + b
      }
      case _ => "Errir: " + _
    }

    println(result)

    "Liu yang" foreach {
      c =>
        println(
          c match {
            case ' ' => "SPACE"
            case ch => "Char : " + ch
          }
        )
    }


  }
}
