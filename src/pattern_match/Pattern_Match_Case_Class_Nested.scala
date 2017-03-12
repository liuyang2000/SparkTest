package pattern_match

/**
  * Created by liuyang on 2016/12/29.
  */

abstract class Person

case class Student(age: Int) extends Person

case class Worker(age: Int, salary: Double) extends Person

case class company(age: Int, salary: Double, student : Student*) extends Person


object Pattern_Match_Case_Class_Nested {
  def main(args: Array[String]): Unit = {
    def matchNestedOps(person: Person) = person match {
      case company(_,_,Student(age)) => println("student1 : age : "+ age)
      case company(_,_,a @ Student(age), b @ Student(age1)) => println("student_1" + a.age + " student_2 age :" + b.age)
      case company(_,_,a @ Student(age),b @ _*)=>println("student _ " + b.seq(1).age)
      case _ => println("nothing else")
    }

    matchNestedOps(company(1,2,Student(123)))
    matchNestedOps(company(1,2,Student(123),Student(234)))
    matchNestedOps(company(1,2,Student(123),Student(234),Student(2345)))

  }
}
