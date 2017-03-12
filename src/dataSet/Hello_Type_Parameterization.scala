package dataSet

/**
  * Created by liuyang on 2017/1/9.
  */

case class Triple[F,S,T](val first : F, val second : S, val third : T)

object Hello_Type_Parameterization {
  def main(args: Array[String]): Unit = {
    val triple = new Triple("df",1,'d')

  }
}
