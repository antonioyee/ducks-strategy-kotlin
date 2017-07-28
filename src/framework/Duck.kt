package framework

import framework.ducks.flybehavior.FlyBehavior
import framework.ducks.quakbehavior.QuackBehavior

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> on 28/07/17.
 */

abstract class Duck {

	companion object {
		lateinit var flyBehavior: FlyBehavior
		lateinit var quackBehavior: QuackBehavior
	}

	fun setFlyBehavior(fb: FlyBehavior) {
		flyBehavior = fb
	}

	fun setQuackBehavior(qb: QuackBehavior) {
		quackBehavior = qb
	}

	abstract fun display()

	fun performFly() {
		flyBehavior.fly()
	}

	fun performQuack() {
		quackBehavior.quack()
	}

	fun swim() {
		println("All ducks float, even decoys")
	}

}