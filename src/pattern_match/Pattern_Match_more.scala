package pattern_match

/**
  * Created by liuyang on 2016/12/29.
  */
object Pattern_Match_more {
  def main(args: Array[String]): Unit = {
    def match_type(t: Any) = t match {
      case p: Int => println("int")
      case p: String => println("String")
      case p: Map[_, _] => {
        print("map : ")
        println(p)
      }
    }

    match_type(1)
    match_type("lj")
    match_type(Map(1 -> "nihao"))

    def match_Array(arr: Any) = arr match {
      case Array(0) => println("Array(0)")
      case Array(a, b) if a != 0 => println(Array(a, b))

      case Array(0, _) => println("Array0_")
      case Array(0, _*) => println("Array0*")
    }

    match_Array(Array(0))
    match_Array(Array(1, 3))
    match_Array(Array(0, 1, 1))
    match_Array(Array(0, 1))

    def match_list(lst: Any) = lst match {
      // 只有一个0
      case 0 :: Nil => println("List : 0")
      // 两个元素 x y
      case x :: y :: Nil => println("List : " + x + " " + y)
      // 第一个元素是 0 (至少一个元素)
      case 0 :: tail => println("List : " + "0 ...")
      // 其他情况
      case _ => println("something else")
    }

    match_list(List(0))
    match_list(List(1, 2))
    match_list(List(0, 1, 2, 3, 4))

    def match_tuple(tuple: Any) = tuple match {
      case (0, _) => println("tuple : 0")
      case (x, 0) => println("tuple : " + x)
      case _ => println("sth else")
    }

    match_tuple((0,""))
    match_tuple((1, 0))
    match_tuple((1, "1", Array(1, 2), List(1, 2)))


  }
}

