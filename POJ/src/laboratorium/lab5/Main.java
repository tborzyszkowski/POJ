package laboratorium.lab5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import laboratorium.lab5.model.DeviceCommandEvent;
import laboratorium.lab5.model.IObserveDevice;
import laboratorium.lab5.model.IScheduleTimeForDevices;
import laboratorium.lab5.model.observators.AirConditioning;
import laboratorium.lab5.model.observators.Device;
import laboratorium.lab5.model.observators.Lights;
import laboratorium.lab5.model.schedulers.ScheduleTurningOn;
import laboratorium.lab5.model.schedulers.SchedulerTask;

public class Main {

	public static void main(String[] args) {
		Device lights = new Lights();
		Device airConditioning = new AirConditioning();
		Calendar calendar = new GregorianCalendar(2016, 4, 6, 19, 56);
		IScheduleTimeForDevices schedulerForAc = new ScheduleTurningOn(calendar.getTime());
		IScheduleTimeForDevices schedulerForLights = new ScheduleTurningOn(calendar.getTime());
		schedulerForAc.addDeviceObservator(airConditioning);
		schedulerForLights.addDeviceObservator(lights);
		SchedulerTask taskForAC = new SchedulerTask(schedulerForAc);
		SchedulerTask taskForLights = new SchedulerTask(schedulerForLights);
		taskForAC.start();
		taskForLights.start();

	}

}
