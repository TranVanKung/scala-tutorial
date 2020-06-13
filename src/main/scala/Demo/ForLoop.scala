package Demo

object ForLoop {
  def main(args: Array[String]) {
    for (i <- 1 to 5) {
      print(i);
    }

    for (i <- 1.to(6)) {
      print(i);
    }

    for (i <- 1.until(7)) {
      print(i);
    }

    for (i <- 1 to 9; j <- 1 to 3) {
      println(i + " " + j);
    }

    val list = List(1, 3, 4, 8, 6, 5);
    for (i <- list) {
      print(i);
    }

    for (i <- list; if i < 6) {
      print(i);
    }

    val result = for (i <- list; if i < 6) yield {
      i * i
    }
    println(result);
  }
}
