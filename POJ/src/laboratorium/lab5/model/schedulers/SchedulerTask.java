package laboratorium.lab5.model.schedulers;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import laboratorium.lab5.model.IScheduleTimeForDevices;

public class SchedulerTask extends Thread {

	private IScheduleTimeForDevices scheduler;

	public SchedulerTask(IScheduleTimeForDevices scheduler) {
		super();
		this.scheduler = scheduler;
	}

	public void run() {
		Calendar calendar = new GregorianCalendar();
		while (true) {
			if (scheduler.getTime().before(new Date())) {
				scheduler.sendCommandToDevices();
				calendar.setTime(scheduler.getTime());
				calendar.add(Calendar.DATE, 1);
				scheduler.setTime(calendar.getTime());
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
