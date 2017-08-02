package strategyPattern.classes;

import strategyPattern.interfaces.FlyBehaviour;
import strategyPattern.interfaces.QuackBehaviour;

public abstract class Duck {
	FlyBehaviour flyBheviour;
	QuackBehaviour quackBehaviour;
	
public void swim(){
	System.out.println("swim");
}
public void performFly(){
	flyBheviour.fly();
}
public void performQuack(){
	quackBehaviour.quack();
}
public abstract void display();
public void setQuackBehaviour(QuackBehaviour quackBehaviour){
	this.quackBehaviour = quackBehaviour;
}
public void setFlyBehaviour(FlyBehaviour flyBehaviour){
	this.flyBheviour = flyBheviour;
}
}
