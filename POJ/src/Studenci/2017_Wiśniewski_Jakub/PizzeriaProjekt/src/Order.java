import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kuba on 17.05.2017.
 */
public class Order {
    private List<Pizza> pizzaList = new ArrayList<>();
    private double sumOrder;
    private int deliveryMethod;
    private String deliveryAdres;
    private PizzaFactory pizzaFactory;
    public Order() {
    }

    public int getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(int deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getDeliveryAdres() {
        return deliveryAdres;
    }

    public void setDeliveryAdres(String deliveryAdres) {
        this.deliveryAdres = deliveryAdres;
    }

    public Order(List<Pizza> orderList) {
        this.pizzaList = orderList;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public double getSumOrder() {
        return sumOrder;
    }

    public void setSumOrder(double sumOrder) {
        this.sumOrder = sumOrder;
    }
    public double sumOrder()
    {
        double sum=0;
        for (Pizza pizza:pizzaList) {
            sum+=pizza.getPrice();
        }
        return sum;
    }
    public void selectDeliveryAdress()
    {
        Scanner sc = new Scanner(System.in);
        if (deliveryMethod == 1) {
            System.out.println("Podaj adres mieszkania.");
            deliveryAdres = sc.nextLine();
        }else{
            System.out.println("Pizza do odebrania w"+deliveryAdres);
        }

    }
    public void selectDeliveryMethod(){
        if(deliveryMethod ==1)
        {
            sumOrder -=5;
            deliveryMethod =0;
        }do {
            System.out.println("Wybierz sposob dostawy");
            System.out.println("[1]Dostawa do domu.");
            System.out.println("[2]Odbior osobisty.");
            Scanner sc = new Scanner(System.in);
            deliveryMethod = sc.nextInt();
            if (deliveryMethod == 1) {
                selectDeliveryAdress();
                System.out.println("Wybrales dostawe do domu za dodatkowa oplata.");
                sumOrder += 5;
            } else if (deliveryMethod == 2) {
                selectDeliveryAdress();
                System.out.println("Wybrales odbior osobisty.");
            }
        }while(deliveryMethod !=1&& deliveryMethod !=2);
    }

    public void selectRestaurant(){
        boolean restaurantSelect=false;
        int restuarnantType=0;
        do{
            switch (restuarnantType)
            {
                case 0:
                {
                    System.out.println("Wybierz restauracje:");
                    System.out.println("[1]Rogalinska");
                    System.out.println("[2]Plocka");
                    System.out.println("[3]Brzegi");
                    Scanner sc =new Scanner(System.in);
                    restuarnantType=sc.nextInt();
                    break;
                }
                case 1:
                {
                    pizzaFactory=new PizzaFactoryRogalinska();
                    deliveryAdres=pizzaFactory.getNameRestaurant();
                    restaurantSelect=true;
                    break;
                }
                case 2:
                {
                    pizzaFactory=new PizzaFactoryPlocka();
                    deliveryAdres=pizzaFactory.getNameRestaurant();
                    restaurantSelect=true;
                    break;
                }
                case 3:
                {
                    pizzaFactory=new PizzaFactoryRogalinska();
                    deliveryAdres=pizzaFactory.getNameRestaurant();
                    restaurantSelect=true;
                    break;
                }
                default:
                {
                    restuarnantType=0;
                    break;
                }
            }
    }while(restaurantSelect==false);
    }
    public void selectPizza() {
        int sizePizza = 0;
        int typePizza = 0;
        boolean czyWybrano=false;
        do {
            switch (typePizza) {
                case 0: {
                    do {
                        System.out.println("Podaj rozmiar pizzy");
                        System.out.println("[1]Mala");
                        System.out.println("[2]Srednia");
                        System.out.println("[3]Duza");
                        Scanner sc = new Scanner(System.in);
                        sizePizza = sc.nextInt();
                    } while (sizePizza < 1 && sizePizza > 3);
                    do {
                        System.out.println("Wybierz rodzaj Pizzy");
                        System.out.println("[1]Wegetarianska");
                        System.out.println("[2]Capriciosa");
                        System.out.println("[3]Pepperoni");
                        Scanner sc = new Scanner(System.in);
                        typePizza = sc.nextInt();
                    } while (typePizza < 1 && typePizza > 3);
                    break;
                }
                case 1: {
                    pizzaList.add(pizzaFactory.createPizzaWegetarianska(sizePizza));
                    czyWybrano=true;
                    break;
                }
                case 2: {
                    pizzaList.add(pizzaFactory.createPizzaCapricciosa(sizePizza));
                    czyWybrano=true;
                    break;
                }
                case 3: {
                    pizzaList.add(pizzaFactory.createPizzaPepperoni(sizePizza));
                    czyWybrano=true;
                    break;
                }
            }
        }while(czyWybrano==false);
    }


}
