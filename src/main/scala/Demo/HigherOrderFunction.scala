package Demo

object HigherOrderFunction {
  def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y);

  def main(args: Array[String]): Unit = {
    val result = math(50, 20, (x, y) => x + y);
    println(result);
  }
}
