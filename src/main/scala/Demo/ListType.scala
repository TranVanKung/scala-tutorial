package Demo

// list is immutable and can contain difference datatype
object ListType {
  val myList: List[Int] = List(1, 2, 3, 4);
  val names: List[String] = List("Max", "Tom", "John");

  def main(args: Array[String]): Unit = {
    println(myList(0));
    //    prepend 0 to myList
    println(0 :: myList);
    println(myList);
    println(names);
    println(Nil);
    println(1 :: Nil);
    println(myList.head);
    println(myList.tail);
    println(myList.isEmpty);
  }
}
