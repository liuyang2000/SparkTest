/**
  * Created by liuyang on 2016/9/12.
  */
object Test {

  def _pp(): Unit ={
    var line = ""
    do{
      line = readLine()
      println("reader:" + line)
    } while(line != "")
  }

  def excptionCatc():Unit = {
    val num = 9

    try {
      println(if (num / 0 == 0) "haode" else "buhao")
    } catch {
      case e: Exception => println("wokao" + e.getLocalizedMessage)
    } finally {
      println("woshi finally")
    }
  }



  def main(args: Array[String]): Unit = {
    excptionCatc
  }
}
