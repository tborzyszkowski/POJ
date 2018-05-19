package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.Pizza;
import PizzaDecoratorElements.CiastoCienkieDekorator;
import PizzaDecoratorElements.CiastoGrubeDekorator;
import PizzaDecoratorElements.MiesoBrakDekorator;
import PizzaDecoratorElements.MiesoKebabDekorator;
import PizzaDecoratorElements.MiesoSzynkaDekorator;
import PizzaDecoratorElements.SerBrakDekorator;
import PizzaDecoratorElements.SerZoltyDekorator;
import PizzaDecoratorElements.SosBrakDekorator;
import PizzaDecoratorElements.SosKetchupDekorator;
import PizzaDecoratorElements.WarzywaBrakDekorator;
import PizzaDecoratorElements.WarzywaMixDekorator;

public class MenuZamowienia {
	int opcja=0;
	//MenuProdukcji produkcja = new MenuProdukcji();
	AbstractProduct pizza;
	List<AbstractProduct> orders = new ArrayList<>();
	int[] iloscZamowien=new int[5];
	
	public void ZlozZamownienie(){
		
		iloscZamowien[0]=0;
		iloscZamowien[1]=0;
		iloscZamowien[2]=0;
		iloscZamowien[3]=0;
		iloscZamowien[4]=0;
		
		do {
            switch (opcja) {
                case 0: {
                	System.out.println("Produkcja pizzy. Zloz zamowienie.");
                	System.out.println("1. Pizza Capricciosa");
                	System.out.println("2. Pizza Margherita");
                	System.out.println("3. Pizza Hawaii");
                	System.out.println("4. Pizza Vegetariana");
                	System.out.println("5. Pizza Firenze");
                	System.out.println("6. Zloz zamowienie");
                	System.out.println("7. Wyjscie");
                	Scanner wybor = new Scanner(System.in);
                	opcja = wybor.nextInt();
                    break;
                }
                
				case 1: {
					pizza = new Pizza();
					pizza = new CiastoCienkieDekorator(pizza);
					pizza = new SosBrakDekorator(pizza);
					pizza = new SerBrakDekorator(pizza);
					pizza = new WarzywaBrakDekorator(pizza);
					pizza = new MiesoBrakDekorator(pizza);
					orders.add(pizza);
					opcja = 0;
					iloscZamowien[0]+=1;
					break;
				}
				
				case 2: {
					pizza = new Pizza();
					pizza = new CiastoCienkieDekorator(pizza);
					pizza = new SosKetchupDekorator(pizza);
					pizza = new SerZoltyDekorator(pizza);
					pizza = new MiesoKebabDekorator(pizza);
					pizza = new WarzywaMixDekorator(pizza);
					orders.add(pizza);
					opcja = 0;
					iloscZamowien[1]+=1;
					break;
				}
				
				case 3: {
					pizza = new Pizza();
					pizza = new CiastoCienkieDekorator(pizza);
					pizza = new SosKetchupDekorator(pizza);
					pizza = new SerZoltyDekorator(pizza);
					pizza = new MiesoSzynkaDekorator(pizza);
					pizza = new WarzywaBrakDekorator(pizza);
					orders.add(pizza);
					opcja = 0;
					iloscZamowien[2]+=1;
					break;
				}
				case 4: {
					pizza = new Pizza();
					pizza = new CiastoGrubeDekorator(pizza);
					pizza = new SosKetchupDekorator(pizza);
					pizza = new SerZoltyDekorator(pizza);
					pizza = new MiesoBrakDekorator(pizza);
					pizza = new WarzywaMixDekorator(pizza);
					orders.add(pizza);
					opcja = 0;
					iloscZamowien[3]+=1;
					break;
				}
				case 5: {
					pizza = new Pizza();
					pizza = new CiastoGrubeDekorator(pizza);
					pizza = new SerBrakDekorator(pizza);
					pizza = new SosKetchupDekorator(pizza);
					pizza = new MiesoKebabDekorator(pizza);
					pizza = new WarzywaMixDekorator(pizza);
					orders.add(pizza);
					opcja = 0;
					iloscZamowien[4]+=1;
					break;
				}
				case 6: {
					System.out.println("Lista zamowionych produktow: ");
					System.out.println("");
					for (int i = 0; i < orders.size(); i++) {
					    int orderNumber = i + 1;
					    System.out.println("Zamowienie " + orderNumber + ":");
					    System.out.println(orders.get(i));
					}
					System.out.println("");
					System.out.println("Wysylamy zamownienie do fabryki: ");
					System.out.println("");
					
					MenuProdukcji menuProdukcji = new MenuProdukcji();
					menuProdukcji.ProdukujZamownienie(iloscZamowien);
					
					opcja = 8;
					break;
				}
				case 7: {
					opcja=8;
					break;
				}
				default: {
					opcja = 0;
                    System.out.println("Blad! Wybrales zla opcje.");
		            break;
	            }
            }   
		}while(opcja!=8);
	}
}
