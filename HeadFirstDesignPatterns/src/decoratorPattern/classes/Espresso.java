package decoratorPattern.classes;

public class Espresso extends Beverages{
public Espresso() {
	description = "Espresso";
}
	@Override
	public double cost() {
		return 0.53;
	}

}
