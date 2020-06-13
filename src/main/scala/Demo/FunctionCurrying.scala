package Demo

object FunctionCurrying {
  def add2(x: Int) = (y: Int) => x + y;

  def add3(x: Int)(y: Int) = x + y;

  def main(args: Array[String]): Unit = {
    println(add2(10)(20));

    val sum40 = add2(40);
    println(sum40(100));

    println(add3(100)(200));
    val sum50 = add3(50) _;
    println(sum50(400));
  }
}
