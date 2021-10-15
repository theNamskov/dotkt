package shared.ageing.environment

import shared.ageing.action.Action
import shared.ageing.action.ForageAction
import shared.ageing.action.HuntAction
import shared.ageing.action.NoAction
import shared.ageing.actor.Actor
import shared.ageing.percept.Percept
import utility.Helper

class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {

    val huntOptions : List<String> = listOf("ak)nf3m", "pr3ko", "p)nk)", "bayla", "akok)", "nantwie", "akyekyere")

    var scores : MutableMap<Actor, Int> = mutableMapOf()
    var animal : String? = null

    init {
        ags.forEach { scores.put(it, 0) }
    }

    override fun processAction(agent: Actor, act: Action) {

        when(act) {
            is ForageAction -> scores.put(agent, scores.getValue(agent) + 1)
            is HuntAction -> scores.put(agent, scores.getValue(agent) + 2)
            is NoAction -> scores.put(agent, scores.getValue(agent))
        }
    }

    override fun sense(agent: Actor) {
        if(animal != null) {
            agent.perceive(Percept("animal", animal!!))
        }
        else
            agent.perceive()
    }

    override fun step() {
        animal = if(Helper.generateRandomDouble(0, 1) > 0.5) huntOptions[Helper.generateRandomInt(0, huntOptions.size)] else null
        super.step()
    }
}