import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Kuba on 17.05.2017.
 */
public class Menu {
    private int option=0;
    private Order order=new Order();
    public void showMenu(){
        order.selectRestaurant();
        do {
            switch (option) {
                case 0: {
                    System.out.println("-----------------------------");
                    System.out.println("Witamy w menu Pizzeri Java!");
                    System.out.println("-----------------------------");
                    System.out.println("[1]Dodaj do zamowienia.");
                    System.out.println("[2]Wyswietl zamowienie.");
                    System.out.println("[3]Złoż zamowienie");
                    System.out.println("[4]Wyjdz");
                    Scanner sc = new Scanner(System.in);
                    option = sc.nextInt();
                    break;
                }
                case 1: {
                    order.selectPizza();
                    order.setSumOrder(order.sumOrder());
                    option=0;
                    break;
                }
                case 2: {
                    order.getPizzaList().stream().forEach(x-> System.out.println(x+"\n"));
                    System.out.println("-----------------------------------");
                    System.out.println(order.getSumOrder());
                    option=0;
                    break;
                }
                case 3:
                {
                    order.selectDeliveryMethod();
                    System.out.println("Twoje zamowienie zostalo przyjete do realizacji.");
                    System.out.println("Do zaplaty:"+ order.getSumOrder());
                    try {
                        FileWriter save = new FileWriter("Zamowienia.txt", true);
                        PrintWriter pw = new PrintWriter(save);
                        order.getPizzaList().stream().forEach(x->pw.println(x));
                        pw.println(order.getSumOrder());
                        pw.println(order.getDeliveryAdres());
                        pw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    order.setSumOrder(0);
                    order.getPizzaList().clear();
                    System.out.println("Dziekujemy za skorzystanie z uslug naszej Pizzeri");
                    System.out.println("Czy chcesz zlozyc kolejne zamowienie?");
                    Scanner sc=new Scanner(System.in);
                    String odp=sc.nextLine();
                    if(odp.equalsIgnoreCase("tak")){option=0;}
                    else {option = 4;}
                    break;
                }
                default: {
                    option = 0;
                    break;
                }
            }
        }while (option!=4);
    }
}
