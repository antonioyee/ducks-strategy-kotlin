package duckstype

import framework.Duck
import framework.ducks.flybehavior.FlyNoWay
import framework.ducks.quakbehavior.Quack

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 28/07/17.
 */

class ModelDuck: Duck() {

	init {
		flyBehavior = FlyNoWay()
		quackBehavior = Quack()
	}

	override fun display() {
		println("I'm a model duck")
	}

}