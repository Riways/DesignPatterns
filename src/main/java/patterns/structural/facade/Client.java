package patterns.structural.facade;

import patterns.structural.facade.complicated_classes.Projector;
import patterns.structural.facade.complicated_classes.Screen;
import patterns.structural.facade.complicated_classes.Tuner;

public class Client {

	public static void main(String[] args) {
		HomeTheaterFacade htf = new HomeTheaterFacade(new Tuner(), new Projector(), new Screen());
		htf.startWatchMovie();
		htf.endWatchMovie();
	}
}
