package Demo

object StringType {
  def main(args: Array[String]) {
    val name = "mark";
    val age = 18;

    //    normal way to print
    println(name + " is " + age + " years old");

    //    string interpolation
    println(s"$name is $age years old");
    //    string interpolation with type safe
    println(f"$name%s is $age%d years old");

    println(raw"Hello \n World");
    printf("%d, %s", age, name);
    println("%d, %s".format(age, name));
  }
}
