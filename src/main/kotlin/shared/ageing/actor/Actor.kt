package shared.ageing.actor

import shared.ageing.percept.Percept
import shared.ageing.action.Action

interface Actor {
    val name: String
    fun act(): Action
    fun perceive(vararg facts: Percept) : Unit
}