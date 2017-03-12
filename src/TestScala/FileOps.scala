package TestScala

import scala.io.Source

/**
  * Created by liuyang on 2016/12/26.
  */
object FileOps {
  def main(args: Array[String]): Unit = {
    /*val files = Source.fromFile("E://Test.txt")*/
    val files = Source.fromURL("http://www.baidu.com/")
    for(file <- files.getLines()){
      println(file)
    }
  }
}
