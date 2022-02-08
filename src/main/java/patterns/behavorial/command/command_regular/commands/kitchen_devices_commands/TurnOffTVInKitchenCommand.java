package patterns.behavorial.command.command_regular.commands.kitchen_devices_commands;

import patterns.behavorial.command.command_regular.commands.Command;
import patterns.behavorial.command.command_regular.devices_to_control.KitchenDevices;

public class TurnOffTVInKitchenCommand implements Command {

	KitchenDevices kitchenDevices;
	
	
	public TurnOffTVInKitchenCommand(KitchenDevices kitchenDevices) {
		super();
		this.kitchenDevices = kitchenDevices;
	}



	@Override
	public void execute() {
		kitchenDevices.turnOffTV();
	}
	
	@Override
	public void undo() {
		kitchenDevices.turnOnTV();
	}

}
