import java.util.Scanner;

public class Client {
	
	private String name;
	private String surname;
	private String phone;
	private boolean takeaway;
	private String address;
	
	Scanner scan = new Scanner(System.in);
	
	public boolean isTakeAway() {
		return takeaway;
	}
	
	public Client() {
		System.out.print("Name: ");
		name = scan.nextLine();
		System.out.print("Surname: ");
		surname = scan.nextLine();
		System.out.print("Phone number: ");
		phone = scan.nextLine();
		System.out.print("Take away (Y/N)? ");
		takeaway = (scan.nextLine().toUpperCase().equals("Y")) ? true : false;
		if (takeaway) {
			System.out.print("Address: ");
			address = scan.nextLine();
		}
		System.out.println();
	}
}
