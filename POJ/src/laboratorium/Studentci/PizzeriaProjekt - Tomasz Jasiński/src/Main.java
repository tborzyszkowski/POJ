import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	Pizzeria pizzeria;
	Pizza pizza;


	System.out.println("\n~~*~~*WITAJ W TWOJEJ ULUBIONEJ PIZZERII*~~*~~");

	System.out.println("\nZamow jedna z naszych pizz!\n");

	System.out.println("*]Rodzaje pizzy[*");
	Typ[] typy = Typ.values();
		for(Typ t : typy){
			System.out.println("~"+t+"~ ");
		}
	System.out.print("Wybierz: ");
	String t_wybor = scanner.nextLine();

	System.out.println("\n\n*]Rozmiary pizzy[*");
	Rozmiar[] rozmiary = Rozmiar.values();
		for(Rozmiar r : rozmiary){
			System.out.print("~"+r+"~ ");
		}
	System.out.print("Wybierz: ");
	String r_wybor = scanner.nextLine();

	System.out.println("\n*]Na [1]grubym, czy [2]cienkim ciescie?[*");
	System.out.print("Wybierz: ");
	int c_wybor = scanner.nextInt();

	if(c_wybor==1){ pizzeria = new NaGrubymPizzeria(); }
	else{ pizzeria = new NaCienkimPizzeria(); }

	pizza = pizzeria.createPizza(Typ.valueOf(t_wybor), Rozmiar.valueOf(r_wybor));

	System.out.println("\n*>Chcesz cos dodac do swojej pizzy? [1]TAK | [2]NIE");
	int dodaj = scanner.nextInt();
	if(dodaj == 1) {
		do {
			System.out.println("\n*]Dostepne dodatki[*");
			Dodatek[] dodatki = Dodatek.values();
			int i = 1;
			for (Dodatek d : dodatki) {
				System.out.println("["+i+"]~" + d + "~ ");
				i +=1;
			}
			System.out.println("[0] Zloz zamowienie ");
			System.out.print("Wybierz: ");
			dodaj = scanner.nextInt();
				switch (dodaj) {
					case 1:
						pizza = new MozzarellaDekorator(pizza);
						break;
					case 2:
						pizza = new SalamiDekorator(pizza);
						break;
					case 3:
						pizza = new SzynkaDekorator(pizza);
						break;
					case 4:
						pizza = new PieczarkiDekorator(pizza);
						break;
					case 5:
						pizza = new PeperoncinoDekorator(pizza);
						break;
					case 6:
						pizza = new KrewetkiDekorator(pizza);
						break;
					case 7:
						pizza = new CzosnekDekorator(pizza);
						break;
					case 8:
						pizza = new BaklazanDekorator(pizza);
						break;
					case 9:
						pizza = new KarczochyDekorator(pizza);
						break;
					default:
						break;
				}
			}while(dodaj != 0);
		}
	System.out.println("\nEFEKT TWOJEGO ZAMOWNIENIA:\n");
	System.out.println("-#-# "+pizza+pizzeria.getPizzeria()+" #-#-");

	}
}
