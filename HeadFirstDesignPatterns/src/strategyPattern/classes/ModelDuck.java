package strategyPattern.classes;

public class ModelDuck extends Duck{
    public ModelDuck(){
    	flyBheviour = new FlyNoWay();
    	quackBehaviour = new Quack();
    }
	@Override
	public void display() {
		System.out.println("Model Duck");
	}

}
