package patterns.structural.adapter.adapter_of_classes.adapters;

import patterns.structural.adapter.adapter_of_classes.round.RoundFigure;
import patterns.structural.adapter.adapter_of_classes.square.SquareFig;

public class SquareFigAdapter extends RoundFigure {

	

	private SquareFig fig;

	public SquareFigAdapter(SquareFig fig) {
		super();
		this.fig = fig;
	}
	
	@Override
	public double getRadius() {
		
		double result;
		
		result = (Math.sqrt(fig.getWidth()*fig.getWidth()*2));
		return result;
		
	}
}
