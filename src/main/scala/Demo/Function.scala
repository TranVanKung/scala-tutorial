package Demo

object Function {

  object Math {
    def addFunction(x: Int, y: Int): Int = {
      return x + y;
    }

    def subtractFunction(x: Int, y: Int): Int = {
      x - y;
    }

    def multiplyFunction(x: Int, y: Int): Int = x * y;

    def divideFunction(x: Int, y: Int) = x / y;
  }

  def main(args: Array[String]): Unit = {
    println(Math.addFunction(30, 20));
    println(Math.subtractFunction(10, 5));
    println(Math.multiplyFunction(2, 3));
    println(Math.divideFunction(10, 5));
  }
}
