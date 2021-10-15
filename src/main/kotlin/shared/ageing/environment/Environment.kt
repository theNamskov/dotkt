package shared.ageing.environment

import shared.ageing.action.Action
import shared.ageing.actor.Actor

//import shared.ageing.actor.Actor;

abstract class Environment(vararg ags : Actor) {
    val agents : List<Actor> = ags.toList()

    open fun step() {
        for(agent in agents) {
            sense(agent)
            processAction(agent, agent.act())
        }
    }

    abstract fun processAction(agent: Actor, act: Action)

    abstract fun sense(agent: Actor)
}