package decoratorPattern.classes;

public class Decaf extends Beverages{
public Decaf() {
	description = "Decaf";
}
	@Override
	public double cost() {
		return 0.89;
	}

}
