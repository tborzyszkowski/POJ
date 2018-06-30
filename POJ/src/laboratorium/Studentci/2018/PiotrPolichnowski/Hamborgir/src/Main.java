import Hamborgir.*;

import java.util.Scanner;

public class Main
{

/// Main program entry
public static void main(String[] args)
{
    System.out.println("Siema!\n");

    int opt;

    System.out.println("===============================================");
    System.out.println("Wybierz Burgerownie Gdanska, do której chcesz się wybrać");
    System.out.println("===============================================");
    System.out.println("[1] Pasibus Gdansk");
    System.out.println("[2] 3Burger Gdansk");
    System.out.println("[3] Surfburger Gdansk Glowny");
    System.out.println("===============================================");
    System.out.println("[4-0] Wyjdź");

    Scanner sc = new Scanner(System.in);
    opt = sc.nextInt();

    Hamborgir hamburger;

    switch (opt)
    {
        case 1: hamburger = new PasibusGda(); break;
        case 2: hamburger = new TrzyBurgerGda(); break;
        case 3: hamburger = new SurfburgerGdaGlowny(); break;
        default: return;
    }

    System.out.println("\nWitaj w " + hamburger.GetRestaurantName() + "!\n");

    BurgerType burgerType;
    BurgerSize burgerSize;
    DeliveryMethod deliveryMethod;
    Order order = hamburger.CreateOrder();

    while (true)
    {
        System.out.println("===============================================");
        System.out.println("Wybierz burgera:");
        System.out.println("[1] Veganski");
        System.out.println("[2] Cheeseburger");
        System.out.println("[3] Burger Szefa");
        System.out.println("===============================================");
        System.out.println("[4-0] Zakończ");

        opt = sc.nextInt();

        switch (opt)
        {
            case 1: burgerType = BurgerType.VEGAN; break;
            case 2: burgerType = BurgerType.CHEESEBURGER; break;
            case 3: burgerType = BurgerType.BURGERSZEFA; break;
            default: return;
        }

        System.out.println("===============================================");
        System.out.println("Wybierz rozmiar:");
        System.out.println("[1] Normalny");
        System.out.println("[2] XL");
        System.out.println("[3] 2 x XL");
        System.out.println("===============================================");
        System.out.println("[4-0] Zakończ");

        opt = sc.nextInt();

        switch (opt)
        {
            case 1: burgerSize = BurgerSize.NORMAL; break;
            case 2: burgerSize = BurgerSize.XL; break;
            case 3: burgerSize = BurgerSize.DOUBLEXL; break;
            default: return;
        }

        System.out.println("===============================================");
        System.out.println("Jak chcesz zjesc?:");
        System.out.println("[1] Na miejscu");
        System.out.println("[2] Wynos");
        System.out.println("[3] Dowóz");
        System.out.println("===============================================");
        System.out.println("[4-0] Zakończ");

        opt = sc.nextInt();

        switch (opt)
        {
            case 1: deliveryMethod = DeliveryMethod.LOCAL; break;
            case 2: deliveryMethod = DeliveryMethod.TAKEAWAY; break;
            case 3: deliveryMethod = DeliveryMethod.TO_HOUSE; break;
            default: return;
        }

        order.SetDeliveryMethod(deliveryMethod);
        order.Add(burgerType, burgerSize);

        System.out.println("===============================================");
        System.out.println("Czy chcesz coś więcej?");
        System.out.println("[1] Tak, poproszę kolejnego");
        System.out.println("[2-0] Nie, dziękuję");

        opt = sc.nextInt();

        if (opt != 1)
        {
            break;
        }
    }

    System.out.println(order);
}

}
