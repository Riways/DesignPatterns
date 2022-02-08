package patterns.behavorial.strategy;

import java.util.concurrent.ThreadLocalRandom;


import patterns.behavorial.strategy.strategy.HurryUp;
import patterns.behavorial.strategy.strategy.Lazy;
import patterns.behavorial.strategy.strategy.MoveStrategy;
import patterns.behavorial.strategy.strategy.Normal;

public class Client {

	public static void main(String[] args) {
		
		MoveStrategy str1 = new Normal();
		MoveStrategy str2 = new HurryUp();
		MoveStrategy str3 = new Lazy();
		
		MoveStrategy [] strArr = {str1, str2, str3};
		Subject sbj = new Subject(strArr[ThreadLocalRandom.current().nextInt(0,3)]);
		
		sbj.move();
	
	}
}
