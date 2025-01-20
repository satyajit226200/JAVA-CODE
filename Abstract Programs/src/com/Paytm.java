package com;

abstract class Paytm {
	abstract void payAmount();

}
abstract class Swiggy extends Paytm () {
	@Override
	abstract void orderFood();
}
