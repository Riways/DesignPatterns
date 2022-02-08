package patterns.behavorial.command.command_regular;

import java.util.ArrayList;

import patterns.behavorial.command.command_regular.commands.Command;
import patterns.behavorial.command.command_regular.commands.hall_devices_commands.TurnOffLightInHallCommand;
import patterns.behavorial.command.command_regular.commands.hall_devices_commands.TurnOffRobotVacuumCleanerCommand;
import patterns.behavorial.command.command_regular.commands.hall_devices_commands.TurnOffTVInHallCommand;
import patterns.behavorial.command.command_regular.commands.hall_devices_commands.TurnOnLightInHallCommand;
import patterns.behavorial.command.command_regular.commands.hall_devices_commands.TurnOnRobotVacuumCleanerCommand;
import patterns.behavorial.command.command_regular.commands.hall_devices_commands.TurnOnTVInHallCommand;
import patterns.behavorial.command.command_regular.commands.kitchen_devices_commands.TurnOffConditionerInKitchenCommand;
import patterns.behavorial.command.command_regular.commands.kitchen_devices_commands.TurnOffLightInKitchenCommand;
import patterns.behavorial.command.command_regular.commands.kitchen_devices_commands.TurnOffOvenCommand;
import patterns.behavorial.command.command_regular.commands.kitchen_devices_commands.TurnOffTVInKitchenCommand;
import patterns.behavorial.command.command_regular.commands.kitchen_devices_commands.TurnOnConditionerInKitchenCommand;
import patterns.behavorial.command.command_regular.commands.kitchen_devices_commands.TurnOnLightInKitchenCommand;
import patterns.behavorial.command.command_regular.commands.kitchen_devices_commands.TurnOnOvenCommand;
import patterns.behavorial.command.command_regular.commands.kitchen_devices_commands.TurnOnTVInKitchenCommand;
import patterns.behavorial.command.command_regular.commands.macros.MacroCommand;
import patterns.behavorial.command.command_regular.devices_to_control.HallDevices;
import patterns.behavorial.command.command_regular.devices_to_control.KitchenDevices;

public class Client {

	public static void main(String[] args) {
		
		RemoteControl remCntrl = new RemoteControl();
		
		KitchenDevices kD= new KitchenDevices();
		HallDevices hD = new HallDevices();
		
		ArrayList<Command> partyOn = new ArrayList<Command>();
		ArrayList<Command> partyOff = new ArrayList<Command>();
		
		partyOn.add(new TurnOnLightInKitchenCommand(kD));
		partyOn.add(new TurnOnConditionerInKitchenCommand(kD));
		partyOn.add(new TurnOnTVInHallCommand(hD));
		
		
		partyOff.add(new TurnOffLightInKitchenCommand(kD));
		partyOff.add(new TurnOffConditionerInKitchenCommand(kD));
		partyOff.add(new TurnOffTVInHallCommand(hD));
		
		MacroCommand mCmndOn = new MacroCommand(partyOn);
		MacroCommand mCmndOff = new MacroCommand(partyOff);
		
		//kitchen devices
		remCntrl.setCommandOnButton(0, new TurnOnLightInKitchenCommand(kD), new TurnOffLightInKitchenCommand(kD));
		remCntrl.setCommandOnButton(1, new TurnOnConditionerInKitchenCommand(kD), new TurnOffConditionerInKitchenCommand(kD));
		remCntrl.setCommandOnButton(2, new TurnOnOvenCommand(kD), new TurnOffOvenCommand(kD));
		remCntrl.setCommandOnButton(3, new TurnOnTVInKitchenCommand(kD), new TurnOffTVInKitchenCommand(kD));
		
		//hall devices
		remCntrl.setCommandOnButton(4, new TurnOnLightInHallCommand(hD),new TurnOffLightInHallCommand(hD));
		remCntrl.setCommandOnButton(5, new TurnOnRobotVacuumCleanerCommand(hD),new TurnOffRobotVacuumCleanerCommand(hD));
		remCntrl.setCommandOnButton(6, new TurnOnTVInHallCommand(hD),new TurnOffTVInHallCommand(hD));
		
		//macro
		remCntrl.setCommandOnButton(7, mCmndOn, mCmndOff);
		
		
		System.out.println(remCntrl);
		
		System.out.println("--//--//--//--//");
		
		
		System.out.println('\n'+"---Undo button test---" + '\n');
		remCntrl.undoButtonPushed();
		System.out.println("\n");
		
		remCntrl.onButtonPushed(0);
		remCntrl.offButtonPushed(0);
		
		remCntrl.onButtonPushed(1);
		remCntrl.offButtonPushed(1);
		
		remCntrl.onButtonPushed(2);
		remCntrl.offButtonPushed(2);
		
		System.out.println('\n'+"---Undo button test---" + '\n');
		remCntrl.undoButtonPushed();
		remCntrl.undoButtonPushed();
		remCntrl.undoButtonPushed();
		remCntrl.undoButtonPushed();
		System.out.println("\n");
		
		remCntrl.onButtonPushed(3);
		remCntrl.offButtonPushed(3);
		
		remCntrl.onButtonPushed(4);
		remCntrl.offButtonPushed(4);
		
		remCntrl.onButtonPushed(5);
		remCntrl.offButtonPushed(5);
		
		remCntrl.onButtonPushed(6);
		remCntrl.offButtonPushed(6);
		
		System.out.println('\n'+"---Undo button test---" + '\n');
		remCntrl.undoButtonPushed();
		
		System.out.println('\n'+"---Macros button test---" + '\n');
		
		System.out.println('\n'+"---Macros button on---" + '\n');
		remCntrl.onButtonPushed(7);
		
		System.out.println('\n'+"---Macros button off---" + '\n');
		remCntrl.offButtonPushed(7);
		
		System.out.println("\n");
		
		
	}
}
