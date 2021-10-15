package lab1

/**
 * Returns the corresponding y-value of a line, given a particular x-value.
 * @param m The gradient of the line.
 * @param x The x value of the line at any point.
 * @param c The y-intercept of the line.
 * @return The corresponding y value of the line, given x.
 */
val calculateY : (m: Int, x: Int, c: Int) -> Int = fun(m: Int, x: Int, c: Int) = (m * x) + c

/**
 * Accepts as arguments the gradients and y-intercepts of two lines and detects whether they intersect at any point.
 * It prints out the x value if they do, and prints out a `"Don't intersect"` string if they don't.
 * @param mOne The gradient of the first line.
 * @param cOne The y-intercept of the first line.
 * @param mTwo The gradient of the second line.
 * @param cTwo As you guessed correctly, the y-intercept of the second line.
 * */
val intersection: (mOne: Int, cOne: Int, mTwo: Int, cTwo: Int) -> Unit = fun(mOne: Int, cOne: Int, mTwo: Int, cTwo: Int) : Unit {
    val xIntersect : Int = (cTwo - cOne) / (mOne - mTwo)
    if(xIntersect in 1..100) println("Lines intersect at the x coordinate ${xIntersect}.")
    else println("Don't intersect")
}

/* =========================================== Implements the second lab exercise. =========================================== */

var funds : Double = 100.00
val pswd = "password"

fun balance() :  Unit = println(funds)

fun deposit(amount: Double) : Unit {
    if(amount <= 0) {
        println("Invalid amount to deposit")
        return
    }
    funds += amount
    println("Amount of $${amount} deposited successfully.")
}

fun withdraw(amount: Double) : Unit {
    if(amount <= 0 || amount > funds) {
        println("Invalid amount to withdraw")
        return
    }
    print("\tPassword: ")
    if(readLine()!! == pswd) {
        funds -= amount
        println("Amount of $${amount} withdrawn successfully.")
        return
    }
    println("Passwords do not match. Operation unsuccessful. Try again.")
}

val runDigiTeller : () -> Unit = fun() : Unit {
    var input : String
    var cmd : List<String>

    while(true) {
        print("\nCommand: ")
        input = readLine()!!
        cmd = input.split(" ")
        when(cmd[0]) {
            "balance" -> balance()
            "deposit" -> if(cmd.size > 1 && cmd[1].toDoubleOrNull() != null)
                deposit(cmd[1].toDouble())
                else println("No amount specified")
            "withdraw" -> if(cmd.size > 1 && cmd[1].toDoubleOrNull() != null)
                withdraw(cmd[1].toDouble())
                else println("No amount specified")
            else -> println("Invalid command")
        }
    }
}