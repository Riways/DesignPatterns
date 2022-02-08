package patterns.behavorial.strategy;

import patterns.behavorial.strategy.strategy.MoveStrategy;

public class Subject {

	MoveStrategy move;
	

	
	public Subject(MoveStrategy move) {
		super();
		this.move = move;
	}



	public void move() {
		move.move();
	}
	

}
