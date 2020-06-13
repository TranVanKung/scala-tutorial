package Inheritance

// trait is same like interfaces in Java, in trait, there is art least 1 abstract method
trait Shape {
  def color: String;
}

// abstract class cannot be initiate
abstract class Polygon {
  def area: Double;
}

object Polygon {
  def main(args: Array[String]): Unit = {
    var triangle = new Triangle(50.5, 20.2);
    var rectangle = new Rectangle(50.5, 20.2);
    this.printArea(triangle); // 510.04999999999995
    this.printArea(rectangle); // 1020.0999999999999
    println(triangle.color); // green
    println(rectangle.color); // red
  }

  def printArea(p: Polygon): Unit = {
    println(p.area);
  }
}
