package patterns.creatioanal.singleton;

public class Singleton {
	
	private static volatile  Singleton instnce;
	
	public static Singleton getInstance() {
		if(instnce == null) {
			synchronized(Singleton.class) {
				if(instnce == null) {
					instnce = new Singleton();
				}
			}
		}
		return instnce;
	}
	
}
