package decoratorPattern.classes;

public abstract class Beverages {
public String description = "Unknown Breverage";
public String getDescription(){
	return description;
}
public abstract double cost();
}
