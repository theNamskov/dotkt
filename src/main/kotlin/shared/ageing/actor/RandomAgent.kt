package shared.ageing.actor

import shared.ageing.action.*
import shared.ageing.percept.Percept
import utility.Helper

class RandomAgent(override val name: String, private val chance: Double) : Actor {

    override fun act(): Action {
        val bound: Int = 100
        val occurrence: Int = Helper.generateRandomInt(0, bound)
        return if(occurrence < (chance * bound).toInt()) ForageAction() else NoAction()
    }

    override fun perceive(vararg facts: Percept) : Unit {

    }

    override fun toString() : String = "RandomAgent(name=$name)"
}