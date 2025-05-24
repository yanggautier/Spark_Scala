// VALUES are immutable constants

val hello:String = "Hola !"

// VARIABLE are mutable
var helloThere: String = hello
helloThere = hello + " There !"
println(helloThere)

val immutableHelloThere:String = hello + " There"
println(immutableHelloThere)

// Data Types

val numberOne: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.14159265
val piSinglePrecision = 3.14159265f
val bigNumber:Long = 123456789
val smallNumber: Byte = 127

println("Here is a mess " + numberOne + truth + letterA)

println(f"Pi is about $piSinglePrecision%.3f")
println(f"Zero padding on the left: $numberOne%05d")
println(s"I can use the s prefix to use variable like $numberOne $pi $truth")
println(s"I can use the expression like that ${ 1 + 2}")

val theUltimateAnswer: String = s"To life, the universe, and everything 333"
val pattern = """.*(\d+).*""".r
val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)

// Booleans
val isGreater = 1 > 2
val isLesser = 1 < 2
val impossible = isGreater & isLesser
val anotherWay = isGreater || isLesser

val picard: String = "Picard"
val bestCaptain: String = "Picard"
val isBest: Boolean = picard == bestCaptain