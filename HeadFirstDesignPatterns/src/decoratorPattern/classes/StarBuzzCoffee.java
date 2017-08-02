package decoratorPattern.classes;

public class StarBuzzCoffee {
public static void main(String args[]) {
	Beverages beverages = new Espresso();
	beverages = new Mocha(beverages);
	beverages = new Mocha(beverages);
	beverages = new Whip(beverages);
	System.out.println("Coffee : "+beverages.getDescription()+"\nCost   : "+beverages.cost());
}
}
