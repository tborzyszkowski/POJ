import java.time.LocalDateTime;

public class Test
{

	public static void main(String[] args)
	{
		
		ListOfAnnouncements announcementsList = new ListOfAnnouncements();
		
		announcementsList.announcements.add(new Announcement(new Car("BMW", "X5", 300000, 2016, 100000), "BMW X5", 
				LocalDateTime.of(2016, 10, 12, 8, 10, 5)));
		announcementsList.announcements.add(new Announcement(new Car("Audi", "A4", 150000, 2014, 160000), "Audi A4", 
				LocalDateTime.of(2016, 11, 20, 10, 25, 30)));
		announcementsList.announcements.add(new Announcement(new Car("Volvo", "S60", 200000, 2015, 125000), "Volvo S60", 
				LocalDateTime.of(2017, 3, 15, 20, 40, 20)));
		announcementsList.announcements.add(new Announcement(new Car("BMW", "M4", 400000, 2017, 20000), "BMW M4", LocalDateTime.now()));
		
		System.out.println(announcementsList);
		
	}

}
