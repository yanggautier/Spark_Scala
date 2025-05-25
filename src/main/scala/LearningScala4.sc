// Data structures

// Tuples
// Immutable lists

val captainStuff = ("Picard", "Enterprise-D", "NCC-1701-D")
println(captainStuff)


// Refer to the individual fields with a ONE-BASED index
println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

val picardsShip = "Picard" -> "Enterprise"
println(picardsShip._2)

val eBunchOfStuff = ("Kirk", 1964, true)

// Lists
// Like a tuple, but more functionality
// Must be of same type

val shipList:List[String] = List("Enterprise", "Defiant", "Voyager")

println(shipList(1))

// Zero-based

println(shipList.head)
println(shipList.tail)

for (ship <- shipList) { println(ship) }

val backwardShips = shipList.map((ship:String) => {ship.reverse})