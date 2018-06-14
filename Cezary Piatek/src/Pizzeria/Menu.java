package Pizzeria;

import java.util.Scanner;

abstract class Menu implements Strategia {
	public static Pizza pobierzMenu(Pizza pizza) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int menu = 2;
		int ktora = 0;
		int dostawa = 0;
		int rozmiar = 0;
		int pkt = 0;
		String adres;
		do {
			System.out.println("Pizze do wyboru:");
			System.out.println("[1] " + Capricciosa.opis());
			System.out.println("[2] " + Wegetarianska.opis());
			System.out.println("[3] " + Pepperoni.opis());
			ktora = sc.nextInt();
			menu = 1;
		} while (ktora >= 3 && ktora <= 1);

		if (ktora == 1) {
			pizza = new Capricciosa();
		} else if (ktora == 2) {
			pizza = new Wegetarianska();
		} else {
			pizza = new Pepperoni();
		}
		do {
			switch (menu) {
			case 1: {
				System.out.println("Chcesz dodac dodatkowe skladniki?");
				System.out.println("[1] Tak");
				System.out.println("[2] Nie");
				int skladniki = sc.nextInt();
				if (skladniki == 1) {
					do {
						System.out.println("Wybierz dodatkowy skladnik:");
						System.out.println("[1] Ser");
						System.out.println("[2] Szynka");
						System.out.println("[0] Zakoncz");
						skladniki = sc.nextInt();
						switch (skladniki) {
						case 1:
							pizza = new Ser(pizza);
						case 2:
							pizza = new Szynka(pizza);
						}
					} while (skladniki != 0);
				}
				menu = 2;
			}

			case 2: {
				do {
					System.out.println("Jaki rozmiar pizzy wybierasz?");
					System.out.println("[1] Mala");
					System.out.println("[2] Srednia");
					System.out.println("[3] Duza");
					rozmiar = sc.nextInt();
					menu = 3;
				} while (rozmiar <= 1 && rozmiar >= 3);
				if (rozmiar == 1) {
					pizza = new Mala(pizza);
				} else if (rozmiar == 2) {
					pizza = new Srednia(pizza);
				} else if (rozmiar == 3) {
					pizza = new Duza(pizza);
				}
				break;
			}
			case 3: {
				System.out.println("Wybierz sposob dostawy: ");
				System.out.println("[1] Odbior osobisty");
				System.out.println("[2] Dowoz");
				dostawa = sc.nextInt();
				if (dostawa == 1) {
					System.out.println("Wybierz pkt odbioru:");
					System.out.println("[1] Kolobrzeska");
					System.out.println("[2] Brzegi");
					pkt = sc.nextInt();
				} else {
					System.out.println("Podaj adres");
					adres = sc1.nextLine();
				}
				menu = 4;
			}
			}
		} while (menu != 4);
		return pizza;
		} 
}

