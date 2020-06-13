package Demo

object MapFilerMethod {
  val list = List(1, 2, 3, 4, 5, 6);
  val myMap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");

  def main(args: Array[String]): Unit = {
    println(list.map(_ * 2)); // List(2, 4, 6, 8, 10, 12)
    println(list.map(x => x * 3)); // List(2, 4, 6, 8, 10, 12)
    println(myMap.map(x => "hi " + x)); // List(hi (1,Tom), hi (2,Max), hi (3,John))

    //    flatten
    println(List(List(1, 2, 3), List(4, 5, 6)).flatten); // List(1, 2, 3, 4, 5, 6)

    //    flatmap = map + flatten
    println(list.flatMap(x => List(x, x + 1))); // List(1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7)
    println(list.map(x => List(x, x + 1))); // List(List(1, 2), List(2, 3), List(3, 4), List(4, 5), List(5, 6), List(6, 7))

    //    filter
    println(list.filter(x => x % 2 == 0)); // List(2, 4, 6)
  }
}
