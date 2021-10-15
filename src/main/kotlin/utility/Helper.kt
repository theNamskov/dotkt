package utility

import java.util.*
import kotlin.collections.*
import kotlin.random.Random

class Helper {


    companion object {

        @JvmStatic
        fun generateRandomInt(start: Int, end: Int): Int {
            require(start < end) { "Illegal Argument" }
            val rand = Random(System.nanoTime())
            return (start..(end-1)).random(rand)
        }

        @JvmStatic
        fun generateRandomDouble(start: Int, end: Int) : Double {
            require(start < end) { "Illegal Argument" }
            return Random.nextDouble() + generateRandomInt(start, end)
        }
    }
}