package patterns.structural.proxy.virtual_proxy;

public class Client {
	public static void main(String[] args) {
		
		SubjectInterface subjIntrface;
		
		subjIntrface = new SubjectImpl();
		System.out.println("Without proxy: " +'\n');
		
		subjIntrface.request();
		
		System.out.println('\n'+"-----"+'\n');
		System.out.println("With proxy: " +'\n');
		
		subjIntrface = new Proxy();
		subjIntrface.request();
	}
}
