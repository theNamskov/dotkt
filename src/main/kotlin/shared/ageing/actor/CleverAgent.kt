package shared.ageing.actor

import shared.ageing.action.*
import shared.ageing.percept.*

class CleverAgent(override val name: String) : Actor {

    var percept: Percept? = null

    override fun act(): Action {
        return when(percept?.value) {
            null -> ForageAction()
            percept?.value -> HuntAction(percept?.value!!)
            else -> NoAction()
        }
    }

    override fun perceive(vararg facts: Percept) {
        if(facts.isNotEmpty()) {
            percept = facts.component1()
        }
    }

    override fun toString() : String = "CleverAgent(name=$name)"

}