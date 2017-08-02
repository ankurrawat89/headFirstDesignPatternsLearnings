package strategyPattern.classes;

import strategyPattern.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
