/**
  * Created by liuyang on 2016/9/10.
  */
object NiHao{
  def main(args : Array[String]) : Unit ={
    println("df");

    var msg = "liuyang"
    msg = "df";
    val final_msg= "df"
    println(max(1,2))
    myPrintln();

    var greetStrings = new Array[String](3);
    greetStrings.update(0,"0");
    greetStrings.update(1,"1");
    greetStrings.update(2,"2");

    for(i <- 0 to 2){
      println(greetStrings(i));
    }

    greetStrings = Array.apply("1","2");

    var oneTwo = List(1,2)
    var twoThree = List(3,4)
    var ottf = oneTwo ::: twoThree
    println(oneTwo)
    println(ottf)

    var oneTwoThree = 1 :: 2 :: Nil;

    oneTwo = Nil.::(1)
    print(oneTwo)

    var pair = (1,"2",'2');
    println(pair._1)
    println(pair._2)
    println(pair._3)

    var jetSet = Set(1,'2');



    var aa = 1L

    var mutilLineStr =
      """dfdf
        dfdfd
        dfdf
        df
      """

    println(mutilLineStr)


    var myVar : String = "df"
    var myStr : String = ""


  }

  def myWhile(args : Array[String]) : Unit = {

    args.foreach(arg => println(arg));
    args.foreach(print)

    for (arg <- args){
      println(arg)
    }

    var i=0
    while (i < args.length) {
      println (args(i))
      i+=1
    }

    while(i < args.length){
      print(args(i))
      i += 1
    }
  }

  def max(x : Int, y:Int) : Int = {
    if(x > y){
      return x;
    }
    return y;
  }

  def myPrintln() = println("liuyang");
}