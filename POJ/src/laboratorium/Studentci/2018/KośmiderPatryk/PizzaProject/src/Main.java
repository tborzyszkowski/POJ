import PizzaProject.*;

import java.util.Scanner;

public class Main
{

/// Main program entry
public static void main(String[] args)
{
    System.out.println("Witaj!\n");

    int opt;

    System.out.println("===============================================");
    System.out.println("Wybierz pizzerię, do której chcesz się wybrać");
    System.out.println("===============================================");
    System.out.println("[1] Brzegi");
    System.out.println("[2] Kwidzyn");
    System.out.println("[3] Tczew");
    System.out.println("===============================================");
    System.out.println("[n] Wyjdź");

    Scanner sc = new Scanner(System.in);
    opt = sc.nextInt();

    PizzaFactory pizzaFactory;

    switch (opt)
    {
        case 1: pizzaFactory = new PizzaFactoryBrzegi(); break;
        case 2: pizzaFactory = new PizzaFactoryKwidzyn(); break;
        case 3: pizzaFactory = new PizzaFactoryTczew(); break;
        default: return;
    }

    System.out.println("\nWitaj w " + pizzaFactory.GetRestaurantName() + "!\n");

    PizzaType pizzaType;
    PizzaSize pizzaSize;
    DeliveryMethod deliveryMethod;
    Order order = pizzaFactory.CreateOrder();

    while (true)
    {
        System.out.println("===============================================");
        System.out.println("Wybierz pizzę:");
        System.out.println("[1] Wegetariańska");
        System.out.println("[2] Capriciosa");
        System.out.println("[3] Pepperoni");
        System.out.println("===============================================");
        System.out.println("[n] Zakończ");

        opt = sc.nextInt();

        switch (opt)
        {
            case 1: pizzaType = PizzaType.VEGETARIANA; break;
            case 2: pizzaType = PizzaType.CAPRICIOSA; break;
            case 3: pizzaType = PizzaType.PEPPERONI; break;
            default: return;
        }

        System.out.println("===============================================");
        System.out.println("Wybierz rozmiar:");
        System.out.println("[1] Mała");
        System.out.println("[2] Średnia");
        System.out.println("[3] Duża");
        System.out.println("===============================================");
        System.out.println("[n] Zakończ");

        opt = sc.nextInt();

        switch (opt)
        {
            case 1: pizzaSize = PizzaSize.SMALL; break;
            case 2: pizzaSize = PizzaSize.MEDIUM; break;
            case 3: pizzaSize = PizzaSize.BIG; break;
            default: return;
        }

        System.out.println("===============================================");
        System.out.println("Wybierz sposób wydania:");
        System.out.println("[1] Na miejscu");
        System.out.println("[2] Wynos");
        System.out.println("[3] Dowóz");
        System.out.println("===============================================");
        System.out.println("[n] Zakończ");

        opt = sc.nextInt();

        switch (opt)
        {
            case 1: deliveryMethod = DeliveryMethod.LOCAL; break;
            case 2: deliveryMethod = DeliveryMethod.TAKEAWAY; break;
            case 3: deliveryMethod = DeliveryMethod.TO_HOUSE; break;
            default: return;
        }

        order.SetDeliveryMethod(deliveryMethod);
        order.Add(pizzaType, pizzaSize);

        System.out.println("===============================================");
        System.out.println("Kontynuować zamówienie?");
        System.out.println("[1] Tak, poproszę kolejną");
        System.out.println("[n] Nie, dziękuję");

        opt = sc.nextInt();

        if (opt != 1)
        {
            break;
        }
    }

    System.out.println(order);
}

}
