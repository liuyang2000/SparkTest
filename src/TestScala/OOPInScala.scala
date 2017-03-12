package TestScala

/**
  * Created by liuyang on 2016/12/27.
  */
/*class Teacher() {
  var name: String = _
  private var age = 17
  private[this] val gender = "male"

  def this(name : String){
    this
    this.name = name
  }

  def sayHello = {
    println( " " + this.name + "  " + this.age + " " + this.gender)
  }
}*/

class Teacher(val name : String, val age : Int){

  println("--")
  var gender : String = _
  println(gender)

  def this(name : String, age : Int, gender : String){
    this(name,age)
    this.gender = gender
  }

}



object OOPInScala{
  def main(args: Array[String]): Unit = {
  /*  val t = new Teacher("liuyang")
    t.name = ""
    t.sayHello*/

    val a = new Teacher("name" , 12)
    println(a.toString)
  }
}
