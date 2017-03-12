package implicits

/**
  * Created by liuyang on 2017/2/17.
  */

case class Delimiters(val left: String, val right: String)

class pair[T: Ordering](val first: T, val sec: T) {
  def smaller(implicit ord: Ordering[T]): T = {
    if (ord.compare(first, sec) > 0) sec else first
  }

  def bigger = {
    Predef
    if (implicitly[Ordering[T]].compare(first, sec) > 0) first else sec
  }
}

object Test {

  def quote(what: String)(implicit delims: Delimiters) = delims.left + what + delims.right

  def quote(what: Int)(implicit delims: String) = what

  //implicit val myDelimiters = Delimiters("<",">")

  def main(args: Array[String]): Unit = {
    println(quote("nihao")(Delimiters("( ", " )")))

    implicit val myDelimiters = Delimiters("<", ">")
    println(quote("implicit"))

  }


}
