package Demo

// set can not have duplicate value
object SetType {
  val mySet: Set[Int] = Set(12, 2, 3, 4, 4);

  def main(args: Array[String]): Unit = {
    println(mySet); // Set(12, 2, 3, 4)
    println(mySet + 10); // set is not order:
  }
}
