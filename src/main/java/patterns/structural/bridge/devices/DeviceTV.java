package patterns.structural.bridge.devices;

public class DeviceTV implements Device {


	public void turnOff() {
		System.out.print("TV turned off");
		
	}

	public void turnOn() {
		System.out.print("TV turned on");
		
	}
}
