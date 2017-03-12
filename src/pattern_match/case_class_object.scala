package pattern_match

/**
  * Created by liuyang on 2016/12/29.
  */

package test
abstract class Person

case class Student(age: Int) extends Person

case class Worker(age: Int, salary: Double) extends Person

case object Shared extends Person

object case_class_object {
  def main(args: Array[String]): Unit = {
    def caseOps(person: Person) = person match {
      case Student(age) => println("Student : " + age)
      case Worker(_, salary) => println("worker,salary : " + salary)
      case Shared => println("Shared")
    }

    caseOps(Student(12))
    caseOps(Worker(12,100000))
    caseOps(Shared)

    val worker = Worker(100,200)
    val work2 = worker.copy(age = 12,salary = worker.salary + 100)
    println(work2.age + " : " + work2.salary)
  }
}
