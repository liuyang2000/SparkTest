package ch5

/**
  * Created by liuyang on 2016/9/17.
  */
object CounterTest {
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter()
    myCounter.increment()
    print(myCounter.value)
  }
}
