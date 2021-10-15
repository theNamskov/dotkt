package shared.ageing.actor

import shared.ageing.percept.Percept
import shared.ageing.action.*;

class SimpleAgent(override val name: String): Actor {


    override fun perceive(vararg facts: Percept) : Unit {

    }


    override fun act() : Action {
        return ForageAction();
    }

    override fun toString() : String = "SimpleAgent(name=$name)"

}