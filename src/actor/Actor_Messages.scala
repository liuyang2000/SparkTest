package actor

import scala.actors.Actor

/**
  * Created by liuyang on 2017/1/11.
  */
object myActorMsg extends Actor{
  override def act(): Unit = {
    while(true){
      receive{
        case msg : String => println("myActorMsg : " + msg)
        case _ => println("myActorMsg nothing else")
      }
    }
  }
}

object Actor_Messages {
  def main(args: Array[String]): Unit = {
    import scala.actors.Actor._
    val actor_Messages = actor{
        while(true){
          receive {
            case msg => println("actor_Message : " + msg)
          }
        }
    }

    val second_Messages = actor{
      while(true){
        receive{
          case msg : Double => println("second_messages double : " + msg)
          case msg : String => println("second_messages String : " + msg)
          case _ => println("second_messages : sthelse")
        }
      }
    }

    actor_Messages ! "nihao"
    second_Messages ! Math.PI
    second_Messages ! "nihao"

    myActorMsg.start()
    myActorMsg ! "liuyang"
    myActorMsg ! 123

  self.receiveWithin(1000)({
    case msg : String => println(msg)
  })


  }
}
