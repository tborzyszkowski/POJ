package Hamborgir;

import java.util.ArrayList;

/// Abstract class for restaurant
public abstract class Hamborgir
{
    /// Never self constructed
    Hamborgir()
    {

    }

    /// Creates VEGAN type burger
    Burger CreateVEGAN(BurgerSize burgerSize, DeliveryMethod deliveryMethod)
    {
        double price = 0.0;

        switch (burgerSize)
        {
            case NORMAL: price = 20.0; break;
            case XL: price = 25.0; break;
            case DOUBLEXL: price = 30.0; break;
        }

        ArrayList<Ingredient> list = new ArrayList<>();
        list.add(new SauceIngredient());
        list.add(new CheeseIngredient());
        list.add(new PepperIngredient());
        list.add(new TomatoIngredient());

        return new Burger("Veganski", burgerSize, 0, price, list, deliveryMethod);
    }

    /// Creates CHEESEBURGER type burger
    Burger CreateCHEESEBURGER(BurgerSize burgerSize, DeliveryMethod deliveryMethod)
    {
        double price = 0.0;

        switch (burgerSize)
        {
            case NORMAL: price = 22.0; break;
            case XL: price = 27.0; break;
            case DOUBLEXL: price = 32.0; break;
        }

        ArrayList<Ingredient> list = new ArrayList<>();
        list.add(new SauceIngredient());
        list.add(new CheeseIngredient());
        list.add(new MeatIngredient());
        list.add(new PickleIngredient());

        return new Burger("Cheeseburger", burgerSize, 1, price, list, deliveryMethod);
    }

    /// Creates Burgerszefa type burger
    Burger CreateSZEFA(BurgerSize burgerSize, DeliveryMethod deliveryMethod)
    {
        double price = 0.0;

        switch (burgerSize)
        {
            case NORMAL: price = 25.0; break;
            case XL: price = 30.0; break;
            case DOUBLEXL: price = 35.0; break;
        }

        ArrayList<Ingredient> list = new ArrayList<>();
        list.add(new SauceIngredient());
        list.add(new CheeseIngredient());
        list.add(new BaconIngredient());
        list.add(new HotPepperIngredient());
        list.add(new OnionIngredient());

        return new Burger("Burger Szefa", burgerSize, 5, price, list, deliveryMethod);
    }

    /// Creates order to start fun
    public Order CreateOrder()
    {
        return new Order(this);
    }

    /// Restaurant name getter
    public abstract String GetRestaurantName();

}
