package actor

import scala.actors.Actor

/**
  * Created by liuyang on 2017/1/11.
  */

case class msg(val id: String, val name: String, val age: Int)

/*object actor_a extends Actor {
  override def act(): Unit = {
    while (true) {
      receive({
        case String => {
          println("actor_a : " + msg)
          sender ! "shoudao : " + String
        }
        case msg(id, name, age) => {
          println("actor_a : " + "id : " + id + " name : " + name + " age : " + age)
          sender ! "nihao ,shoudao " + name
        }
        case _ => {
          println("actor_a something else")
          sender ! "shoudao : something else"
        }
      })
    }
  }
}*/

object Actor_with_caseClass {
  def main(args: Array[String]): Unit = {

  }
}
