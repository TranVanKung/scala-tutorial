package Demo

object Closure {
  //  closure is a function that use same variable declare outside of function
  var number = 10;
  val add = (x: Int) => {
    number = x + number;
    number;
  };


  def main(args: Array[String]): Unit = {
    number = 100;
    println(add(20));
    println(number);
  }
}
