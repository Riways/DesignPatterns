package patterns.behavorial.command.command_regular.commands.kitchen_devices_commands;

import patterns.behavorial.command.command_regular.commands.Command;
import patterns.behavorial.command.command_regular.devices_to_control.KitchenDevices;

public class TurnOnLightInKitchenCommand implements Command {

	KitchenDevices kitchenDevices;
	
	
	public TurnOnLightInKitchenCommand(KitchenDevices kitchenDevices) {
		super();
		this.kitchenDevices = kitchenDevices;
	}



	@Override
	public void execute() {
		kitchenDevices.turnOnLight();
	}
	
	@Override
	public void undo() {
		kitchenDevices.turnOffLight();
	}

}
