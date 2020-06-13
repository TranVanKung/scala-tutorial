package Demo

// in those method, the result of current step is passed to next step
object ReducerScanFoldMethod {
  val list = List(1, 2, 3, 4, 6, 7);
  val list2 = List("A", "B", "C");

  def main(args: Array[String]): Unit = {
    //    reduce method
    println(list.reduceLeft(_ + _)); // 23
    println(list2.reduceLeft(_ + _)); // ABC
    println(list.reduceLeft((x, y) => {
      print(x + " , " + y + " | ");
      x + y
    })); // 1 , 2 | 3 , 3 | 6 , 4 | 10 , 6 | 16 , 7 | 23

    println(list.reduceRight((x, y) => {
      print(x + " , " + y + " | ");
      x - y
    })); // 6 , 7 | 4 , -1 | 3 , 5 | 2 , -2 | 1 , 4 | -3

    //    fold method - same as reduce, but it can set initial value
    println(list.foldLeft(100)(_ + _)); // 123
    println(list.foldLeft("start string")(_ + _)); // start string123467

    //    scan method - same like fold method, but it can return immediate result
    println(list.scanLeft(100)(_ + _)); // List(100, 101, 103, 106, 110, 116, 123)
    println(list.scanLeft("Z")(_ + _)); // List(Z, Z1, Z12, Z123, Z1234, Z12346, Z123467)
  }
}
