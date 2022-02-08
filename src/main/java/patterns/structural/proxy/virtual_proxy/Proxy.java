package patterns.structural.proxy.virtual_proxy;

public class Proxy implements SubjectInterface {
	
	SubjectImpl realSubject;

	
	
	public Proxy() {
		realSubject = new SubjectImpl();
	}



	@Override
	public void request() {
		if(this.checkAccess()) {
			this.realSubject.request();
			this.logAccess();
		}
		
	}
	
	public boolean checkAccess()
    {
		System.out.println("lol, they think i'm the same object");
        System.out.println("Proxy: Checking access prior to firing a real request.");

        return true;
    }
    
    public void logAccess()
    {
    	System.out.println("Proxy: Logging the time of request.");
    }
}
