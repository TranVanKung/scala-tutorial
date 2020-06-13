package Demo

import java.util.Date

object PartiallyApplyFunction {
  def log(date: Date, message: String) = {
    println(date + " " + message);
  }

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c;
    val f = sum(10, _: Int, _: Int);
    println(f(10, 20));

    val date = new Date;
    val newLog = log(date, _: String);
    newLog("The message");
  }
}
