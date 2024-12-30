```scala
case class MyClass(name: String, age: Int) {
  require(age >= 0, "Age must be non-negative")
}

object Main extends App {
  val person = MyClass("Alice", 30)
  println(person.age)
  //  val person2 = person.copy(age = -10) // compile-time error: Age must be non-negative
}
```