package duckstype

import framework.Duck
import framework.ducks.flybehavior.FlyNoWay
import framework.ducks.quakbehavior.Squeak

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 28/07/17.
 */

class RubberDuck: Duck() {

	init {
		flyBehavior = FlyNoWay()
		quackBehavior = Squeak()
	}

	override fun display() {
		println("I'm a rubber duckie")
	}

}