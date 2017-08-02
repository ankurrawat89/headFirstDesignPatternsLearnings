package strategyPattern.classes;

import strategyPattern.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
