// Flow control

// If / else:
if (1 > 3) println("Impossible") else println("The world makes sense")

if (1 > 3) {
  println("Impossible")
  println("Really")
} else {
  println("The world makes sense")
  println("Definitely")
}

// Matching
val number = 3
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Unknown")
}

for (x <- 1 to 4)
  val squared = x * x
  println(squared)


var x = 10
while (x > 0) {
  println(x)
  x -= 1
}

{
  val x = 10; x + 20
}
println({val x = 10; x + 20})