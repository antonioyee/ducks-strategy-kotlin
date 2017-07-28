package duckstype

import framework.Duck
import framework.ducks.flybehavior.FlyNoWay
import framework.ducks.quakbehavior.MuteQuack

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 28/07/17.
 */

class DecoyDuck: Duck() {

	init {
		setFlyBehavior(FlyNoWay())
		setQuackBehavior(MuteQuack())
	}

	override fun display() {
		println("I'm a duck Decoy")
	}

}