package patterns.behavorial.strategy.strategy;

public class Normal implements MoveStrategy {

	@Override
	public void move() {
		System.out.println("Walk");

	}

}
