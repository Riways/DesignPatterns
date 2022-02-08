package patterns.creatioanal.abstract_factory;

import patterns.creatioanal.abstract_factory.factories.CarFactory;
import patterns.creatioanal.abstract_factory.factories.HelicopterFactory;
import patterns.creatioanal.abstract_factory.factories.VehicleFactory;

public class Demo {
	
	private static Client configureApplication() {
		Client app;
		VehicleFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if(osName.contains("linux")) {
			factory = new HelicopterFactory();
			app = new Client(factory);
		}else {
			factory = new CarFactory();
			app = new Client(factory);
		}
		return app;
	}

	public static void main(String[] args) {
		configureApplication();
	}
}
