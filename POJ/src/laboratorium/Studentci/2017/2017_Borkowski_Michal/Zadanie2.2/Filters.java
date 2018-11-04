import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;

public interface Filters
{

	// filtrowanie wed³ug ceny od/do
	default ArrayList<Announcement> filterByPrice(ArrayList<Announcement> announcements, double priceFrom, double priceTo)
	{
		ArrayList<Announcement> filteredList = announcements.stream()
				.filter(e -> e.getCar().getPrice() >= priceFrom && e.getCar().getPrice() <= priceTo)
				.collect(Collectors.toCollection(ArrayList::new));
		return filteredList;
	}
	
	// filtrowanie wed³ug rocznika od/do
	default ArrayList<Announcement> filterByYear(ArrayList<Announcement> announcements, int yearFrom, int yearTo)
	{
		ArrayList<Announcement> filteredList = announcements.stream()
				.filter(e -> e.getCar().getYear() >= yearFrom && e.getCar().getYear() <= yearTo)
				.collect(Collectors.toCollection(ArrayList::new));
		return filteredList;
	}
	
	// filtrowanie wed³ug przebiegu od/do
	default ArrayList<Announcement> filterByMileage(ArrayList<Announcement> announcements, int mileageFrom, int mileageTo)
	{
		ArrayList<Announcement> filteredList = announcements.stream()
				.filter(e -> e.getCar().getMileage() >= mileageFrom && e.getCar().getMileage() <= mileageTo)
				.collect(Collectors.toCollection(ArrayList::new));
		return filteredList;
	}
		
	// filtrowanie wed³ug daty dodania od/do
	default ArrayList<Announcement> filterByDate(ArrayList<Announcement> announcements, LocalDateTime dateFrom, LocalDateTime dateTo)
	{
		ArrayList<Announcement> filteredList = announcements.stream()
				.filter(e -> (e.getDate().isEqual(dateFrom) || e.getDate().isAfter(dateFrom))
						&& (e.getDate().isEqual(dateTo) || e.getDate().isBefore(dateTo)))
				.collect(Collectors.toCollection(ArrayList::new));
		return filteredList;
	}

	// filtrowanie wed³ug s³owa kluczowego (tytu³u og³oszenia)
	default ArrayList<Announcement> filterByTitle(ArrayList<Announcement> announcements, String keyword)
	{
		ArrayList<Announcement> filteredList = announcements.stream()
				.filter(e -> e.getTitle().contains(keyword))
				.collect(Collectors.toCollection(ArrayList::new));
		return filteredList;
	}
	
}
