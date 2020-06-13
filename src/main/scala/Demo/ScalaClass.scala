package Demo

// can not create instance of a Object
// but can create a instance from Class
/*
          Getter    Setter
var       yes       yes
val       yes       no
default   no        no
 */

//primary constructor
class Member(private var name: String, var age: Int) {
  //  first auxillary constructor
  def this() {
    this("Tom", 32);
  }

  //  second auxillary constructor
  def this(name: String) {
    this(name, 32);
  }

  def printName {
    println(name);
  }
};


class User(var name: String, var age: Int);

object ScalaClass {
  def main(args: Array[String]) {
    var user = new User("max", 28);
    println(user.name); // max
    println(user.age); // 28
    user.age = 30;
    println(user.age); // 30

    var member = new Member("Cong", 30);
    var member1 = new Member();
    var member2 = new Member("Max");
    member.printName; // Cong
  }
}
