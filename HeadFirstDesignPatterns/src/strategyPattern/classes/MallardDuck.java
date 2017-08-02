package strategyPattern.classes;

public class MallardDuck extends Duck{
public MallardDuck(){
	flyBheviour = new FlyWithWings();
	quackBehaviour = new Quack();
}
@Override
public void display(){
	System.out.println("I am Mallard Duck");
}
}