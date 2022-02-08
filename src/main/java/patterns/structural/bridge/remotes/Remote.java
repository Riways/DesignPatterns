package patterns.structural.bridge.remotes;

import patterns.structural.bridge.devices.Device;

public abstract class Remote {

	Device d;
	
	public abstract void turnDeviceOff();
	
	public abstract void turnDeviceOn();
	
}
