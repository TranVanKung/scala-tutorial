package Demo

object AnonymousFunction {

  object Math {
    //    default value for function
    def add(x: Int = 45, y: Int = 15): Int = {
      return x + y;
    }

    def square(x: Int) = x * x;
  }

  def main(args: Array[String]): Unit = {
    println(Math.add());
    println(Math square 3);

    //    first class function or anonymous function
    val add = (x: Int, y: Int) => x + y;
    println(add(300, 500));
  }
}
