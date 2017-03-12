package implicits

import java.io.File

import scala.io.Source

/**
  * Created by liuyang on 2017/1/10.
  */

class RichFile(val file : File){
  def read = Source.fromFile(file.getPath).mkString
}

object Context{
   implicit def file2RichFile(file : File) =
    new RichFile(file)



}

object Hello_Implicit_Conversions {

  def main(args: Array[String]): Unit = {
    import Context.file2RichFile
    //println(new File("D:\\uddi-address.xml").read)

    println("smaller: " + smaller(1,2))
  }

  def smaller[T](a : T,b: T)(implicit order : T => Ordered[T]) = if(a > b) b else a

}
