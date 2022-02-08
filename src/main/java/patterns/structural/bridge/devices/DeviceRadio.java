package patterns.structural.bridge.devices;

public class DeviceRadio implements Device{

	public void turnOff() {
		System.out.print("Radio turned off");
		
	}

	public void turnOn() {
		System.out.print("Radio turned on");
		
	}
	
}
