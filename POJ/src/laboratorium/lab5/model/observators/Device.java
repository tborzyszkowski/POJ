package laboratorium.lab5.model.observators;

import laboratorium.lab5.model.DeviceCommandEvent;
import laboratorium.lab5.model.IObserveDevice;

public abstract class Device implements IObserveDevice {

	public void reactOnCommand(DeviceCommandEvent command) {
		if (command.shouldTurnOn)
			turnOn();
		if (command.shouldTurnOff)
			turnOff();
	}

	public abstract void turnOn();

	public abstract void turnOff();

}
