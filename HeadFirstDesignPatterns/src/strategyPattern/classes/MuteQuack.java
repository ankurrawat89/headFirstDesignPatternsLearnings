package strategyPattern.classes;

import strategyPattern.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour{

	@Override
	public void quack() {
		System.out.println("mute quack");
	}

}
