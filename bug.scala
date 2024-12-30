```scala
class MyClass(val name: String) {
  private var _age: Int = 0 // private mutable field

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge >= 0) _age = newAge
    else throw new IllegalArgumentException("Age must be non-negative")
  }
}

object Main extends App {
  val person = new MyClass("Alice")
  person.age = 30 // works fine
  person.age = -10 // throws IllegalArgumentException
  println(person.age)
}
```