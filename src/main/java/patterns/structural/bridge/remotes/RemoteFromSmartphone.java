package patterns.structural.bridge.remotes;

import patterns.structural.bridge.devices.Device;

public class RemoteFromSmartphone extends Remote {

	Device d ;

	public RemoteFromSmartphone(Device d) {
		super();
		this.d = d;
	}

	@Override
	public void turnDeviceOff() {
		d.turnOff();
		System.out.println(" by smartphone");
		
	}

	@Override
	public void turnDeviceOn() {
		d.turnOn();
		System.out.println(" by smartphone");
		
	}
}
