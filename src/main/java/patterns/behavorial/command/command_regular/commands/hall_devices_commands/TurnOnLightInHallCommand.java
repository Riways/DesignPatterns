package patterns.behavorial.command.command_regular.commands.hall_devices_commands;

import patterns.behavorial.command.command_regular.commands.Command;
import patterns.behavorial.command.command_regular.devices_to_control.HallDevices;

public class TurnOnLightInHallCommand implements Command {

	HallDevices hallDevices;
	
	
	public TurnOnLightInHallCommand(HallDevices hallDevices) {
		super();
		this.hallDevices = hallDevices;
	}



	@Override
	public void execute() {
		hallDevices.turnOnLight();;
	}
	
	@Override
	public void undo() {
		hallDevices.turnOffLight();;
	}

}
