package framework.ducks.quakbehavior

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 28/07/17.
 */

class MuteQuack: QuackBehavior {

	override fun quack() {
		println("Silence")
	}

}