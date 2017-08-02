package decoratorPattern.classes;

public class HouseBlend extends Beverages{
public HouseBlend() {
	description = "House Blend";
}
	@Override
	public double cost() {
		return 2.23;
	}

}
