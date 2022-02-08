package patterns.structural.proxy.virtual_proxy;

public class SubjectImpl implements SubjectInterface {

	@Override
	public void request() {

		System.out.println("SubjectImpl: Handling Request.");
		
	}

}
