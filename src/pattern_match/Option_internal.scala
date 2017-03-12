package pattern_match

/**
  * Created by liuyang on 2016/12/29.
  */
object Option_internal {
  def main(args: Array[String]): Unit = {
    val man = Map("you" -> 123, "me" -> 567)

    println(man.get("he"))
    println(man.get("me"))


    man.get("me") match {
      case Some(age) => println("age : " + age)
      case _ => println("NothingElse")
    }

    println(man.get("you").get)

  }
}
