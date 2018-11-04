import java.util.ArrayList;

public class ListOfAnnouncements implements Sorts, Filters
{

	ArrayList<Announcement> announcements = new ArrayList<Announcement>();
	
	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		for (Announcement a : announcements)
		{
			result.append(a).append("\n");
		}
		return result.toString();
	}
	
}
