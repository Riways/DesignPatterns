package patterns.structural.adapter.adapter_of_classes;

import patterns.structural.adapter.adapter_of_classes.adapters.SquareFigAdapter;
import patterns.structural.adapter.adapter_of_classes.round.RoundFigure;
import patterns.structural.adapter.adapter_of_classes.round.RoundHole;
import patterns.structural.adapter.adapter_of_classes.square.SquareFig;

public class Client {

	
	public static void main(String[] args) {
		
		RoundHole hole = new RoundHole(5);
	
		RoundFigure rfig = new RoundFigure(4);
	
		SquareFig smallSFig = new SquareFig(1);
	
		SquareFig largeSFig = new SquareFig(6);
		
		SquareFigAdapter smallAdapter = new SquareFigAdapter(smallSFig);
		SquareFigAdapter largeAdapter = new SquareFigAdapter(largeSFig);
		
		
		System.out.println(hole.fits(rfig));
		
		System.out.println(hole.fits(smallAdapter));
		
		System.out.println(hole.fits(largeAdapter));
		
		
	
		
	}
	
}
