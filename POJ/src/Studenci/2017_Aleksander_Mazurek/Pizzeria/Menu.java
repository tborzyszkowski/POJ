package Pizzeria;


import java.util.Scanner;

public class Menu {
	
	Pizza pizza = Pizza.getStandardPizza();
	
	public  int menuPizza(){
	System.out.println("--------------------------------");
	System.out.println(" ");
	System.out.println("Do wyboru są nastepujace pizze: ");
	System.out.println("1: wegetraianksa mała 20 zł") ;
	Kreator WegeM = new WegeDekorator(pizza);
	WegeM.getPizza().MENU();
	System.out.println(" ");
	System.out.println("2: wegetrariańka średnia 25 zł ");
	Kreator WegeS = new WegeDekorator(pizza);
	WegeS.getPizza().MENU();
	System.out.println(" ");
	System.out.println("3: wegetrariańka duża 35 zł ");
	Kreator WegeD = new WegeDekoratorD(pizza);
	WegeD.getPizza().MENU();
	System.out.println(" ");
	System.out.println("4: capricciosa mala 27 zł");
	Kreator CapriM = new CapriDekorator(pizza);
	CapriM.getPizza().MENU();
	System.out.println(" ");
	System.out.println("5: capricciosa średnia 27 zł");
	Kreator CapriS = new CapriDekoratorS(pizza);
	CapriS.getPizza().MENU();
	System.out.println(" ");
	System.out.println("6: capricciosa dużo 27 zł");
	Kreator CapriD = new CapriDekoratorD(pizza);
	CapriD.getPizza().MENU();
	System.out.println(" ");
	System.out.println("7: pepperoni mala 27 zł");
	Kreator PepeM = new PepeDekorator(pizza);
	PepeM.getPizza().MENU();
	System.out.println(" ");
	System.out.println("8: pepperoni średnia 27 zł");
	Kreator PepeS = new PepeDekoratorS(pizza);
	PepeS.getPizza().MENU();
	System.out.println(" ");
	System.out.println("9: pepperoni duża 35  zł");
	Kreator PepeD = new PepeDekoratorS(pizza);
	PepeD.getPizza().MENU();
	System.out.println(" ");
	System.out.println("--------------------------------");
	 System.out.println("\nWciśnij klawisz od 1 do 9, aby kontynuować...");
	 System.out.println("\nWciśnij O, aby zakończyć");
	 System.out.println("");
	Scanner sc = new Scanner(System.in);
	
	int option = sc.nextInt();
	
	return option ;
	}
	public int menuDostawa(){
		
		Scanner dost = new Scanner(System.in);
		System.out.println("wybierz sposób dostawy:");
		System.out.println("wciśnij 1 lub 2 :");
		System.out.println("1: dostawa do domu + 10 zł do cenu zamowienia");
		System.out.print("2: odbiór osobisty w lokalu");
		
		int dostawa =dost.nextInt();
		
		return dostawa;
		
	}
	
}
