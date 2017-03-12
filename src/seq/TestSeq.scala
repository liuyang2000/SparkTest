package seq

/**
  * Created by liuyang on 2017/2/23.
  */

case class demoBean(val name : String ,val age : Int)
object TestSeq {
  def main(args: Array[String]): Unit = {
    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)

    val itc = Iterator(demoBean("liuyang",1),demoBean("tom",3))

    println("ita.size 的值: " + ita.size )
    println("itb.length 的值: " + itb.length )

    val itaSum = ita.toSeq.sum
    println("ita sum : " + itaSum)

    implicit val dd : demoBean = null
    println((1 to 100).map(i=> i*3+7))

    (1 to 100).map(i=> i*3+7).filter(i=> (i%10)==0).sum

  }
}
