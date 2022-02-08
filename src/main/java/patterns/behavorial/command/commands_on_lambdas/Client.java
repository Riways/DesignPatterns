package patterns.behavorial.command.commands_on_lambdas;

import patterns.behavorial.command.commands_on_lambdas.devices_to_control.HallDevices;
import patterns.behavorial.command.commands_on_lambdas.devices_to_control.KitchenDevices;

public class Client {

	public static void main(String[] args) {
		
		RemoteControl remCntrl = new RemoteControl();
		
		KitchenDevices kD= new KitchenDevices();
		HallDevices hD = new HallDevices();
		
		
		//kitchen devices
		//Command is functional interface. Java creates anonymous class that implements Command interface
		remCntrl.setCommandOnButton(0, ()-> kD.turnOnLight(), ()-> kD.turnOffLight());
		remCntrl.setCommandOnButton(1, ()-> kD.turnOnOven(), ()-> kD.turnOffOven());
		remCntrl.setCommandOnButton(2, ()-> kD.turnOnConditioner(), ()-> kD.turnOffConditioner());
		remCntrl.setCommandOnButton(3, ()-> kD.turnOnTV(), ()-> kD.turnOffTV());
		
		//hall devices
		remCntrl.setCommandOnButton(4, ()-> hD.turnOnLight(), ()-> hD.turnOffLight());
		remCntrl.setCommandOnButton(5, ()-> hD.turnOnRobotVacuumCleaner(), ()-> hD.turnOffRobotVacuumCleaner());
		remCntrl.setCommandOnButton(6, ()-> hD.turnOnTV(), ()-> hD.turnOffTV());
		
		System.out.println(remCntrl);
		
		System.out.println("--//--//--//--//--");
		
		remCntrl.onButtonPushed(0);
		remCntrl.offButtonPushed(0);
		
		remCntrl.onButtonPushed(1);
		remCntrl.offButtonPushed(1);
		
		remCntrl.onButtonPushed(2);
		remCntrl.offButtonPushed(2);
		
		remCntrl.onButtonPushed(3);
		remCntrl.offButtonPushed(3);
		
		remCntrl.onButtonPushed(4);
		remCntrl.offButtonPushed(4);
		
		remCntrl.onButtonPushed(5);
		remCntrl.offButtonPushed(5);
		
		remCntrl.onButtonPushed(6);
		remCntrl.offButtonPushed(6);
		
	}
}
