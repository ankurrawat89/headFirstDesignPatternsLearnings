package strategyPattern.classes;

public class DuckSimulator {
public static void main(String args[]){
	Duck d = new MallardDuck();
	d.performFly();
	d.performQuack();
	d.display();
}
}
