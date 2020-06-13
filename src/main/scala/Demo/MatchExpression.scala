package Demo

object MatchExpression {
  def main(args: Array[String]) {
    //    match as statement
    val age = 18;
    age match {
      case 20 => println(age);
      case 30 => println(age);
      case 40 => println(age);
      case _ => println("default case")
    }

    //match as expression
    val result = age match {
      case 18 => age;
      case 20 => age;
      case 20 => age;
    }
    println(result);

    val i = 7;
    i match {
      case 1 | 3 | 5 | 7 => println("odd");
      case 2 | 4 | 6 | 8 => println("even");
    }
  }
}
