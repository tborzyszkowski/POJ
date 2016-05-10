package laboratorium.lab5.model.schedulers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import laboratorium.lab5.model.DeviceCommandEvent;
import laboratorium.lab5.model.IObserveDevice;
import laboratorium.lab5.model.IScheduleTimeForDevices;

public class ScheduleTurningOn implements IScheduleTimeForDevices{

	private Date time;
	
	public ScheduleTurningOn(Date time) {
		this.time = time;
	}

	@Override
	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public Date getTime() {
		return time;
	}
	
	private List<IObserveDevice> observers = new ArrayList<IObserveDevice>() ;
	@Override
	public void addDeviceObservator(IObserveDevice device) {
		observers.add(device);
	}

	@Override
	public void removeDeviceObservator(IObserveDevice device) {
		observers.remove(device);
	}

	@Override
	public void sendCommandToDevices() {
		DeviceCommandEvent command = new DeviceCommandEvent();
		command.shouldTurnOn=true;
		for(IObserveDevice device : observers)
			device.reactOnCommand(command);
	}
}
