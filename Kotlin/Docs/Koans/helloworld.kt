// Basics
fun main() {
    println("Hello world!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(3,4);

// Val vs Var:
// Val = Readonly

val a: Int = 1  // immediate assignment
val b = 2   // `Int` type is inferred
val c: Int  // Type required when no initializer is provided
c = 3       // deferred assignment

// Var can be reassigned
var x = 5 // `Int` type is inferred
x += 1

// Conditionals

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// For Loops:

val items = listOf("apple", "banana", "kiwifruit")
for (item in items) {
    println(item)
}

// While Loops:

val items = listOf("apple", "banana", "kiwifruit")
var index = 0
while (index < items.size) {
    println("item at $index is ${items[index]}")
    index++
}

// When Loops: 

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }


// Solution ONE:

fun start(): String {
  return  "OK"
}

