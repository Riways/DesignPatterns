package patterns.structural.facade;

import patterns.structural.facade.complicated_classes.Projector;
import patterns.structural.facade.complicated_classes.Screen;
import patterns.structural.facade.complicated_classes.Tuner;

public class HomeTheaterFacade {
	Tuner tun;
	Projector proj;
	Screen screen;
	public HomeTheaterFacade(Tuner tun, Projector proj, Screen screen) {
		super();
		this.tun = tun;
		this.proj = proj;
		this.screen = screen;
	}
	
	public void startWatchMovie() {
		screen.unRoll();
		tun.turnOn();
		proj.turnOn();
	}
	
	public void endWatchMovie() {
		screen.roll();
		tun.turnOff();
		proj.turnOff();
	}
	
}
