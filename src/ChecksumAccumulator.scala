/**
  * Created by liuyang on 2016/9/11.
  */
class ChecksumAccumulator {
  private var sum = 0;
  def add(b:Byte) : Unit = sum += b
  def checkSum() : Int = ~ (sum & 0xFF) + 1

}

object ChecksumAccumulator{
 /* var ss = 1
  var mm = (1).+(2)
  private var cache = Map[String ,Int]()
  def calculate(s : String) : Int = {
    if(cache.contains(s)){
      cache(s)
    } else {
      var acc = new ChecksumAccumulator
      for(c <- s){
        acc.add(c.toByte)
        var cs = acc.checkSum()
        cache += (s -> cs)
        cs
      }
    }
  }*/
}