package Demo

object DemoObject {
  def main(args: Array[String]) {
    //  var is used to declare mutable variable
    var a: Int = 12;
    println("Hello World", a);
    a = 30;
    println(a);

    val b: Int = 50;
    println(b);

    println(this);

    var c = true;
    println(c);

    val x = {
      val a: Int = 200;
      val b: Int = 300;
      a + b
    }
    println(x);

    //    lazy initialization
    lazy val y = 500;
    println(y)

  }
}
