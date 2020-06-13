package Demo

import Array._;

object ArrayType {
  val myArray: Array[Int] = new Array[Int](4);
  val myArray2 = new Array[Int](10);
  val myArray3 = Array(1, 2, 3, 4, 5);

  def main(args: Array[String]): Unit = {
    myArray(0) = 10;
    println(myArray);
    val myArray4 = concat(myArray, myArray3);

    for (i <- myArray) {
      println(i);
    }

    for (i <- 0 to (myArray4.length - 1)) {
      println(myArray4(i));
    }
  }
}
