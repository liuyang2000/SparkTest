package actor

import scala.actors.Actor

/**
  * Created by liuyang on 2017/1/11.
  */

/*object actor_a extends Actor{
  override def act(): Unit = {
    for(i <- 1 to 3){
        println("actor_a : " + i)
        Thread.sleep(1000)
    }
  }
}*/


object actor_b extends Actor{
  override def act(): Unit = {
    for(i <- 1 to 3){
      println("      actor_b : " + i)
      Thread.sleep(1000)
    }
  }
}

object Hello_Actor {
  def main(args: Array[String]): Unit = {
    //actor_a.start
    actor_b.start()
  }
}
