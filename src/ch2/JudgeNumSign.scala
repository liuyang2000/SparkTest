package ch2

/**
  * Created by liuyang on 2016/9/16.
  */
object JudgeNumSign {

  def main(args: Array[String]): Unit = {
      println(diffNumDiffSign(0))
  }

  def diffNumDiffSign(num : Int) : Int = {
    var signum = 0
    if(num > 0){
      signum = 1
    } else if(num == 0){
      signum =0
    } else if(num < 0){
      signum = -1
    }
    return signum
  }
}
