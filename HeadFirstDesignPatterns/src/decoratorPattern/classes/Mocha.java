package decoratorPattern.classes;

public class Mocha extends CondimentDecorator{
Beverages beverages;
public Mocha(Beverages beverages) {
	this.beverages = beverages;
}
	@Override
	public String getDescription() {
		return beverages.getDescription() + " , Mocha";
	}

	@Override
	public double cost() {
		return beverages.cost() + .20;
	}

}
