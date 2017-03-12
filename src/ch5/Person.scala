package ch5

/**
  * Created by liuyang on 2016/9/17.
  */
class Person {
  private var privateAge = 0

  def age = privateAge

  def age_=(newAge : Int){
    if(newAge > privateAge){
      privateAge = newAge
    }
  }
}

object Person{
  def main(args: Array[String]): Unit = {
    val jom = new Person
    jom.age = 30
    jom.age = 22
    print(jom.age)
  }
}
