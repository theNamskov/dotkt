import lab1.*
import lab2.*
import shared.ageing.actor.*
import shared.ageing.environment.*
import utility.Helper

fun main(args: Array<String>) {

//    for(i in -5..5) println(calculateY(3, i, 1))

//    intersection(3, 5, 4, 2)
//    intersection(2, 1, 3, 3)
//    intersection(-2, 3, 3, -2)

//    runDigiTeller()

//        val env = FoodEnvironment(SimpleAgent("Charlie"))
//        env.step()
//        println(env.scores)

//    val env = FoodEnvironment(RandomAgent("Charlie",0.8), RandomAgent("Bob", 0.2), RandomAgent("Alice", 0.6))
//    for (i in 1..100)
//        env.step()
//    println(env.scores)


//    ========================================================================================================
//    ========================================================================================================
//    ========================================================================================================


//    val env = FoodEnvironment(CleverAgent("Charlie"), RandomAgent("Bob", 0.2), SimpleAgent("Alice"))
//    for (i in 1..10) {
//        env.step()
//    }
//    println(env.scores)

//    var f = 1
//    val endNum = 5
//    (1..endNum).forEach { f *= it }
//    println("factorial using forEach: $f")
//    (1..endNum).fold(1) { item, sum -> item * sum}.also { println("factorial using fold: $it") }



//    val clrm = Classroom(
//        Student("Charlie", listOf(40.0, 80.0, 90.0, 55.0)),
//        Student("Bob", listOf(40.0,10.0,20.0,25.0)),
//        Student("Alice", listOf(20.0, 70.0, 60.0, 30.0))
//    )
//
//    for (s : Student in clrm) {
//        println("Student ${s.name} with grade ${s.averageGrade()}")
//    }
}

fun addAny(num: Int) : (Int) -> Int = fun(num2: Int): Int = num + num2

//fun addAny(num: Int) : (Int) -> Int ={ (num2) -> num + num2 }

//fun addAny(num : Int) : (Int) -> Int  {
//    return  {num2 ->  num + num2}
//}

val add3 : (Int) -> Int = addAny(3)

val add7 : (Int) -> Int = addAny(7)




