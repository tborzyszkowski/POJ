package laboratorium.lab5.model;

import java.util.Date;

public interface IScheduleTimeForDevices {

	public void setTime(Date time);

	public Date getTime();

	public void addDeviceObservator(IObserveDevice device);

	public void removeDeviceObservator(IObserveDevice device);

	public void sendCommandToDevices();
}
