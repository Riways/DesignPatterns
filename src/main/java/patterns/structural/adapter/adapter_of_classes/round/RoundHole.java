package patterns.structural.adapter.adapter_of_classes.round;

public class RoundHole {
	private double radius;
	
	public RoundHole(double radius) {
		this.radius =radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public boolean fits(RoundFigure rfig) {
		return this.getRadius() >= rfig.getRadius();
	}
}
