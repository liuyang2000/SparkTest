package TestScala

/**
  * Created by liuyang on 2016/12/27.
  */
class Outer(val name : String) {
  outer =>
  class Inner(val name : String){
    def print(b : Inner) = {
      println(b.name)
    }
  }
}

object InnerClass{
  def main(args: Array[String]): Unit = {
    val outer1 = new Outer("ni")
    val outer2 = new Outer("wo")

    val inner1 = new outer1.Inner("hao")
    val innner2 = new outer2.Inner("shi")

    inner1.print(inner1)
    innner2.print(innner2)
  }
}
