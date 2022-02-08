package patterns.behavorial.command.command_regular.commands.hall_devices_commands;

import patterns.behavorial.command.command_regular.commands.Command;
import patterns.behavorial.command.command_regular.devices_to_control.HallDevices;

public class TurnOnRobotVacuumCleanerCommand implements Command {

	HallDevices hallDevices;
	
	
	public TurnOnRobotVacuumCleanerCommand(HallDevices hallDevices) {
		super();
		this.hallDevices = hallDevices;
	}



	@Override
	public void execute() {
		hallDevices.turnOnRobotVacuumCleaner();
	}
	
	@Override
	public void undo() {
		hallDevices.turnOffRobotVacuumCleaner();
	}

}
