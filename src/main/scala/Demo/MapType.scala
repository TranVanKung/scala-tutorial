package Demo

// map is collection of key value pair, key is not duplicated
object MapType {
  val myMap: Map[Int, String] = Map(801 -> "Max", 804
    -> "Tom"
  );

  def main(args: Array[String]): Unit = {
    println(myMap); // Map(801 -> Max, 804 -> Tom)
    println(myMap(801));
    println(myMap.keys); // Set(801, 804)
  }
}
