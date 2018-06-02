package PizzaProject;

import java.util.ArrayList;

/// Abstract class for factory
public abstract class PizzaFactory
{
    /// Never self constructed
    PizzaFactory()
    {

    }

    /// Creates VEGETARIANA type pizza
    Pizza CreateVegetriana(PizzaSize pizzaSize, DeliveryMethod deliveryMethod)
    {
        double price = 0.0;

        switch (pizzaSize)
        {
            case SMALL: price = 20.0; break;
            case MEDIUM: price = 25.0; break;
            case BIG: price = 30.0; break;
        }

        ArrayList<Ingredient> list = new ArrayList<>();
        list.add(new SauceIngredient());
        list.add(new CheeseIngredient());
        list.add(new PepperIngredient());
        list.add(new TomatoIngredient());

        return new Pizza("Wegetariańska", pizzaSize, 0, price, list, deliveryMethod);
    }

    /// Creates CAPRICIOSA type pizza
    Pizza CreateCapriciosa(PizzaSize pizzaSize, DeliveryMethod deliveryMethod)
    {
        double price = 0.0;

        switch (pizzaSize)
        {
            case SMALL: price = 22.0; break;
            case MEDIUM: price = 27.0; break;
            case BIG: price = 32.0; break;
        }

        ArrayList<Ingredient> list = new ArrayList<>();
        list.add(new SauceIngredient());
        list.add(new CheeseIngredient());
        list.add(new HamIngredient());
        list.add(new MushroomsIngredient());

        return new Pizza("Capriciosa", pizzaSize, 1, price, list, deliveryMethod);
    }

    /// Creates PEPPERONI type pizza
    Pizza CreatePepperoni(PizzaSize pizzaSize, DeliveryMethod deliveryMethod)
    {
        double price = 0.0;

        switch (pizzaSize)
        {
            case SMALL: price = 25.0; break;
            case MEDIUM: price = 30.0; break;
            case BIG: price = 35.0; break;
        }

        ArrayList<Ingredient> list = new ArrayList<>();
        list.add(new SauceIngredient());
        list.add(new CheeseIngredient());
        list.add(new SalamiIngredient());
        list.add(new HotPepperIngredient());
        list.add(new OnionIngredient());

        return new Pizza("Pepperoni", pizzaSize, 5, price, list, deliveryMethod);
    }

    /// Creates order to start fun
    public Order CreateOrder()
    {
        return new Order(this);
    }

    /// Restaurant name getter
    public abstract String GetRestaurantName();

}
