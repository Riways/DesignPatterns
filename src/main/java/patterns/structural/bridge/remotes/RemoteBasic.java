package patterns.structural.bridge.remotes;

import patterns.structural.bridge.devices.Device;

public class RemoteBasic extends Remote {
	
	Device d ;

	public RemoteBasic(Device d) {
		super();
		this.d = d;
	}

	@Override
	public void turnDeviceOff() {
		d.turnOff();
		System.out.println(" by basic remote");
		
	}

	@Override
	public void turnDeviceOn() {
		d.turnOn();
		System.out.println(" by basic remote");
		
	}

}
