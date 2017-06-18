package Pizzeria;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class MainTESTER {
	public static void main(String[] args) throws IOException  
	{
		ArrayList<String> orders = new ArrayList<>();
		double totalPrice = 0;
			Pizza pizza = Pizza.getStandardPizza();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("witaj w interetowej pizzeri!");
			Menu m= new Menu();
			Scanner sa = new Scanner(System.in);
			System.out.println("Podaj imię:");
			String adres1 = sa.next();
			System.out.println("Podaj nazwisko:");
			String adres2 = sa.next();
			System.out.println("Podaj miasto:");
			String adres3 = sa.next();
			System.out.println("Podaj ulice :");
			String adres4 = sa.next();
			System.out.println("Podaj numer ulicy :");
			String adres5 = sa.next();
			System.out.println("Podaj numer lokalu:");
			String adres6 = sa.next();
			
			int wybor=m.menuPizza();
			while(wybor!=0){
				
				switch(wybor){
				
			case 1:
					Kreator WegeM = new WegeDekorator(pizza);
					
					
					totalPrice=totalPrice+WegeM.getPizza().getCena();
					
					orders.add(WegeM.getPizza().getNazwa());
					
					break;
			case 2: 
					Kreator WegeS = new WegeDekoratorS(pizza);
				
					
					totalPrice=totalPrice+WegeS.getPizza().getCena();
					orders.add(WegeS.getPizza().getNazwa());
					break;
			case 3: 
					Kreator WegeD = new WegeDekoratorD(pizza);
					
					totalPrice=totalPrice+WegeD.getPizza().getCena();
					orders.add(WegeD.getPizza().getNazwa());
					break;
			case 4: 
				Kreator CapriM = new CapriDekorator(pizza);
				
				totalPrice=totalPrice+CapriM.getPizza().getCena();
				orders.add(CapriM.getPizza().getNazwa());
				break;
			case 5: 
				Kreator CapriS = new CapriDekoratorS(pizza);
				
				totalPrice=totalPrice+CapriS.getPizza().getCena();
				orders.add(CapriS.getPizza().getNazwa());
				break;
			case 6: 
				Kreator CapriD = new CapriDekoratorD(pizza);
				
				totalPrice=totalPrice+CapriD.getPizza().getCena();
				orders.add(CapriD.getPizza().getNazwa());
				break;
			case 7: 
					Kreator PepeM = new PepeDekorator(pizza);
				
					totalPrice=totalPrice+PepeM.getPizza().getCena();
					orders.add(PepeM.getPizza().getNazwa());
					break;
			case 8: 
					Kreator PepeS = new PepeDekoratorS(pizza);
				
					totalPrice=totalPrice+PepeS.getPizza().getCena();
					orders.add(PepeS.getPizza().getNazwa());
					break;
			case 9: 
					Kreator PepeD = new PepeDekoratorD(pizza);
					
					totalPrice=totalPrice+PepeD.getPizza().getCena();
					orders.add(PepeD.getPizza().getNazwa());
					break;
			default:
					
				System.out.println("nie wybrano pizzy!");
				totalPrice=totalPrice+0;
				System.out.println("");
				m.menuPizza();
				}
				 System.out.println("<<------------------------------>>");
				 System.out.println("<< wybrano"+orders+         ">>" );
				 System.out.println("<< do zaplaty: "+totalPrice+"zł >>");
				 System.out.println("<<------------------------------>>");
	             wybor=m.menuPizza();
	            
			}
			if(wybor==0){
				int q=m.menuDostawa();
				switch(q){
				
				case 1:
					totalPrice=totalPrice+10;
					break; 
				case 2: 
					totalPrice=totalPrice+0;
					break;
				}
				System.out.println("--------------------------------");
				if(q==1){
					System.out.println("wybrano dostawe do domu");
				}else {
					System.out.println("wybrano odbiór w lokalu ");
				}
				System.out.println("--------------------------------");
				System.out.println("dziekujemy za złożenie zamówienia");
				System.out.println("Zamowiono:"+orders);
				System.out.println("do zaplaty: "+totalPrice+"zł");
				System.out.println("adres dostawy:"+adres1+" "+adres2 );
				System.out.println(adres3+" ,"+adres4+" "+adres5+"/"+adres6 );
				System.out.println("--------------------------------");
			}
			}
		}
	
		

	

	

	


