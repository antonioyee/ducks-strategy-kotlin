import duckstype.MallardDuck
import duckstype.ModelDuck
import framework.Duck
import framework.ducks.flybehavior.FlyRocketPowered

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 28/07/17.
 */

fun main(args: Array<String>) {

	val mallard: Duck = MallardDuck()

	mallard.performQuack()
	mallard.performFly()

	val model: Duck = ModelDuck()

	model.performFly()
	model.setFlyBehavior(FlyRocketPowered())
	model.performFly()
}