package bankowo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.text.SimpleDateFormat;

class Operation {
	Date dateOfOperation;
	int		quota;
	boolean	transfer;
	//	Type of transfer:
	//	false - deposit / withdraw (later called deposit)
	//	true - transfer
	String	partnerNumber;		// In case of transferring money
	Account client;
	
	@SuppressWarnings("deprecation")
	public Operation(boolean rand) {
		Random randgen = new Random();
		if (rand) {
			int		day = randgen.nextInt(30),
					month = randgen.nextInt(12),
					year = randgen.nextInt(4)+113;
			dateOfOperation = new Date(year, month, day);
			quota = (randgen.nextInt(500)*(-1)) + 65;
			transfer = randgen.nextBoolean();
		} else {
			dateOfOperation = new Date();
		}
		 
		/*
		if (transfer) {
			StringBuilder strNum = new StringBuilder();
			for(int i = 0; i < 24; i++) 
				strNum.append(randgen.nextInt(9));
			partnerNumber = strNum.toString();
		}
		*/	
	}
	
	public boolean deposit(Account client) {
		Operation operation = new Operation(true);
		if (operation.quota + client.balance < 0) return false;
		operation.transfer = false;
		save(operation, client);
		return true;
	};
	
	public boolean deposit(int cash, Account client) {
		Operation operation = new Operation(false);
		operation.transfer = false;
		operation.quota += cash;
		if (operation.quota + client.balance < 0) return false;
		save(operation, client);
		return true;
	};
	
	
	public boolean transfer(int cash, String number, boolean israndom, Account client) {
		Operation operation = new Operation(israndom);
		operation.transfer = true;
		operation.quota -= cash;
		if (operation.quota + client.balance < 0) return false;
		operation.partnerNumber = number;
		operation.dateOfOperation = new Date();
		save(operation, client);
		return true;
	}
	
	private void save(Operation operation, Account client) {
		client.balance += operation.quota;
		client.history.add(operation);
	}
}


class Account {
	List<Operation> history = new ArrayList<Operation>();
	
	String	owner = "Henryk Sienkiewicz",
			number = "482749248105238523";
	int		balance;
	
	public Account() {
		balance = 10000;
	}
	
	public Account(int cash) {
		balance = cash;
	}
	
	@SuppressWarnings("deprecation")
	public void load(Account client, String interval, int yearRequested) {
		if (client.history.size() == 0) System.out.println("*** Brak operacji ***");
		for (Operation operation : client.history) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd - MM - yyyy");
			if (interval == "before")
				if (operation.dateOfOperation.getYear()+1900 > yearRequested) continue;
			if (interval == "after")
				if (operation.dateOfOperation.getYear()+1900 < yearRequested+1) continue;
			if (interval == "exact")
				if (operation.dateOfOperation.getYear()+1900 != yearRequested) continue;
			if (operation.transfer) {
				System.out.print("Przelew wychodzący\t| Na rachunek: "+operation.partnerNumber+ "\t| ");
			}
			else if(operation.quota < 0) {
				System.out.print("Wypłata środków\t| ");
			} else {
				System.out.print("Wpłata środków\t| ");
			}
			System.out.print("Kwota: "+operation.quota+"\t| ");
			System.out.println("Data Operacji: "+dateFormat.format(operation.dateOfOperation)+"\t |");
		}
	}
}


