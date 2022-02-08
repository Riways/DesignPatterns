package patterns.behavorial.strategy.strategy;

public class Lazy implements MoveStrategy {


	@Override
	public void move() {
		System.out.println("Don't move");
		
	}

}
