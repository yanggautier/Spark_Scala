// VALUES are immutable constants

val hello:String = "Hola !"

// VARIABLE are mutable
var helloThere: String = hello
helloThere = hello + " There !"
println(helloThere)

val immutableHelloThere:String = hello + " There"
println(immutableHelloThere)