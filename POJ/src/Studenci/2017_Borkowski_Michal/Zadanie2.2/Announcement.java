import java.time.LocalDateTime;

public class Announcement
{
	
	private Car car;
	private String title;
	private LocalDateTime date;
	
	public Announcement(Car car, String title, LocalDateTime date)
	{
		this.car = car;
		this.title = title;
		this.date = date;
	}

	public Car getCar()
	{
		return car;
	}

	public String getTitle()
	{
		return title;
	}

	public LocalDateTime getDate()
	{
		return date;
	}

	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		result.append("Title: ").append(title).append("    ");
		result.append("Date: ").append(date).append("    ");
		result.append(car);
		return result.toString();
	}

}
