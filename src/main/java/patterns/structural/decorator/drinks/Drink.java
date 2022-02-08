package patterns.structural.decorator.drinks;

public abstract class Drink {
	
	protected String description = "Unknown drink";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

}
