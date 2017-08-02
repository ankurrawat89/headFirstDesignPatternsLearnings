package strategyPattern.classes;

import strategyPattern.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("No fly");
	}

}
