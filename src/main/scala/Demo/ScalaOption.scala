package Demo

// Scala Option give Some or None
object ScalaOption {
  val list = List(1, 2, 3);
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "Tom");
  val opt: Option[Int] = Some(3);
  val opt2: Option[Int] = None;

  def main(args: Array[String]): Unit = {
    println(list.find(_ > 6)); // None
    println(list.find(_ > 1)); // Some(2)
    println(list.find(_ > 1).get); // 2
    println(map.get(10)); // None
    println(map.get(1)); // Some(Tom)
    println(map.get(1).getOrElse("No name found")); // Tom
    println(opt.isEmpty); // false
    println(opt2.isEmpty); // true
  }
}
