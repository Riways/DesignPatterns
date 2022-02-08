package patterns.structural.bridge;

import patterns.structural.bridge.devices.Device;
import patterns.structural.bridge.devices.DeviceRadio;
import patterns.structural.bridge.devices.DeviceTV;
import patterns.structural.bridge.remotes.RemoteBasic;
import patterns.structural.bridge.remotes.RemoteFromSmartphone;

public class Client {

	public static void main(String[] args) {
		
		Device tv = new DeviceTV();
		Device radio = new DeviceRadio();
		
		RemoteBasic rb = new RemoteBasic(tv);
		RemoteFromSmartphone rs = new RemoteFromSmartphone(radio);
		
		rb.turnDeviceOn();
		rb.turnDeviceOff();
		
		rs.turnDeviceOn();
		rs.turnDeviceOff();
	}
}
