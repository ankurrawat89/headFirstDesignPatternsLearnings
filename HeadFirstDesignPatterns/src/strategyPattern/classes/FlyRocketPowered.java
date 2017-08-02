package strategyPattern.classes;

import strategyPattern.interfaces.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("Fly with Rocket");
	}

}
