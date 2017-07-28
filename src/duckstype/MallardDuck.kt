package duckstype

import framework.Duck
import framework.ducks.flybehavior.FlyWithWings
import framework.ducks.quakbehavior.Quack

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 28/07/17.
 */

class MallardDuck: Duck() {

	init {
		quackBehavior = Quack()
		flyBehavior = FlyWithWings()
	}

	override fun display() {
		println("I'm a real Mallard duck")
	}

}