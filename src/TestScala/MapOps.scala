package TestScala

/**
  * Created by liuyang on 2016/12/26.
  */
object MapOps {
  def main(args: Array[String]): Unit = {
    val amap = Map("key1"-> 12,"key2"->56)

    for((k,v) <- amap){
      println("key is " + k + " ,value is " + v)
    }

    for((k,_) <- amap){
      println("key is " + k )
    }
  }
}
