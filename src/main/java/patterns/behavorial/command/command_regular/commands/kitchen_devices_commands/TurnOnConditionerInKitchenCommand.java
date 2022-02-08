package patterns.behavorial.command.command_regular.commands.kitchen_devices_commands;

import patterns.behavorial.command.command_regular.commands.Command;
import patterns.behavorial.command.command_regular.devices_to_control.KitchenDevices;

public class TurnOnConditionerInKitchenCommand implements Command {

	KitchenDevices kitchenDevices;
	
	
	public TurnOnConditionerInKitchenCommand(KitchenDevices kitchenDevices) {
		super();
		this.kitchenDevices = kitchenDevices;
	}



	@Override
	public void execute() {
		kitchenDevices.turnOnConditioner();;
	}
	
	@Override
	public void undo() {
		kitchenDevices.turnOffConditioner();;
	}

}
