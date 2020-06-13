package Demo

object IfElse {
  def main(args: Array[String]) {
    val x = 20;
    val y = 30
    var res = "";

    if (x == 20 && y == 30) {
      res = "true";
    } else {
      res = "false";
    }

    println(res);

    val res2 = if (x != 20) "true value" else "false value";
    println(res2);

    var a = 0;
    while (a < 10) {
      print(a);
      a += 1;
    }
  }
}
