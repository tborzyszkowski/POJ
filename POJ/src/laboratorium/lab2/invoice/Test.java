package bankowo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Account ja = new Account();
		Scanner menuRead = new Scanner(System.in);
		Scanner keyput = new Scanner(System.in);
		String att;	//Account to transfer
		
		Operation operation = new Operation(true);
		
		// Random operations
		for (int i = 0; i < 5; i++) 
			operation.deposit(ja);
		
		while (true) {
			System.out.println(ja.owner+" - Saldo: "+ja.balance);
			System.out.print("Menu Banku\nOperacje: \n1. Wpłata na konto\n2. Wypłata z konta\n3. Przelew\n4. Historia operacji\n5. Zamknij program\n? ");
			switch(menuRead.nextInt()) {
				case 1: {
					System.out.print("Podaj kwotę do wpłaty: ");
					operation.deposit(keyput.nextInt(), ja);
					break;
				}
				case 2: {
					System.out.print("Podaj kwotę do wypłaty: ");
					if (operation.deposit(keyput.nextInt()*(-1), ja)) break;
					else {
						System.out.println("Niewystarczająca ilość środków na koncie\nSpróbuj ponownie później...");
						break;
					}
				}
				case 3: {
					System.out.print("Podaj numer konta do przelewu: ");
					att = keyput.next();
					System.out.print("Podaj kwotę do przelewu: ");
					if(operation.transfer(keyput.nextInt(), att, false, ja)) break;
					else System.out.println("Brak środków!");
					break;
				}
				case 4: {
					System.out.println("Przedział czasowy:");
					System.out.println("1. Cała historia\n2. Przed określonym rokiem\n3. Po określonym roku \n4. Konkretny rok\n5. Anuluj");
					switch(menuRead.nextInt()) {
					case 1: {
						ja.load(ja,"all",0);
						break;
					}
					case 2: {
						System.out.print("Podaj rok\n? ");
						ja.load(ja, "before", keyput.nextInt());
						break;
					}
					case 3: {
						System.out.print("Podaj rok\n? ");
						ja.load(ja, "after", keyput.nextInt());
						break;
					}
					case 4: {
						System.out.print("Podaj rok\n? ");
						ja.load(ja, "exact", keyput.nextInt());
						break;
					}
					}
					break;
				}
				case 5: {
					keyput.close();
					menuRead.close();
					System.exit(0);
				}
				}
		}
		}
}

