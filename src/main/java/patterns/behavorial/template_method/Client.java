package patterns.behavorial.template_method;

import java.util.concurrent.ThreadLocalRandom;

public class Client {
	
	public static void main(String[] args) {
		CoffeinDrinks cofDr;
		if(ThreadLocalRandom.current().nextBoolean()) {
			cofDr = new Coffee();
		}else {
			cofDr = new Tea();
		}
		cofDr.prepareRecipe();
	}

}
