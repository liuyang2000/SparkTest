package Type_Parameterization

/**
  * Created by liuyang on 2017/1/9.
  */

/*class pair_NotPerfact[T <: Comparable[T]](val first: T, val second: T) {
  def bigger = if (first.compareTo(second) > 0) first else second
}*/
class pair_NotPerfact[T <% Comparable[T]](val first: T, val second: T) {
  def bigger = if (first.compareTo(second) > 0) first else second
}
class pair_better[T <% Ordered[T]](val first: T, val second: T) {
  def bigger = if (first > second) first else second
}

object View_Bounds {
  def main(args: Array[String]): Unit = {
    val pair = new pair_NotPerfact(1,2)
    println(pair.bigger)
  }
}
