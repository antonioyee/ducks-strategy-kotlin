package framework.ducks.flybehavior

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 28/07/17.
 */

class FlyNoWay: FlyBehavior {

	override fun fly() {
		println("I can't fly")
	}

}