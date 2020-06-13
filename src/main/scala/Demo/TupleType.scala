package Demo

// tuple is same like array but can contain many datatype, tuple is immutable, tuple is fixed size
object TupleType {
  val myTuple = (1, 2, "Hello", true);
  val myTuple2 = Tuple3(1, 2, "hello"); // Tuple3 mean Tuple contain 3 elements

  def main(args: Array[String]): Unit = {
    println(myTuple);
    println(myTuple2);
    println(myTuple._2); // 2
  }
}
