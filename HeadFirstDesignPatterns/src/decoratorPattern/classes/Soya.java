package decoratorPattern.classes;

public class Soya extends CondimentDecorator{
	Beverages beverages;
	public Soya(Beverages beverages) {
		this.beverages = beverages;
	}
		@Override
		public String getDescription() {
			return beverages.getDescription() + " , Soya";
		}

		@Override
		public double cost() {
			return beverages.cost() + .25;
		}

}
