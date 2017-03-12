package ch11

/**
  * Created by liuyang on 2016/9/30.
  */
object Name {
  def unapply(input : String) = {
    val pos = input.indexOf(" ")
    if(pos == -1) None
    else Some((input.substring(0, pos),input.substring(pos + 1)))

  }

  def main(args: Array[String]): Unit = {
    val author = "jim hent"
    val Name(one,two) = author
    println(Name.unapply(one))
    print(Name.unapply(two))
  }
}
