package PizzaProject;

import java.util.ArrayList;

/// Class for ordering pizza :)
public class Order
{
    /// Package scope constructor
    Order(PizzaFactory pizzaFactory)
    {
        m_pizzaFactory = pizzaFactory;
        m_pizzas = new ArrayList<>();
        m_deliveryMethod = DeliveryMethod.LOCAL;
    }

    /// Sets delivery method
    public Order SetDeliveryMethod(DeliveryMethod deliveryMethod)
    {
        m_deliveryMethod = deliveryMethod;

        return this;
    }

    /// Adds new pizza to order
    public Order Add(PizzaType pizzaType, PizzaSize pizzaSize)
    {
        switch (pizzaType)
        {
            case VEGETARIANA: m_pizzas.add(m_pizzaFactory.CreateVegetriana(pizzaSize, m_deliveryMethod)); break;
            case CAPRICIOSA: m_pizzas.add(m_pizzaFactory.CreateCapriciosa(pizzaSize, m_deliveryMethod)); break;
            case PEPPERONI: m_pizzas.add(m_pizzaFactory.CreatePepperoni(pizzaSize, m_deliveryMethod)); break;
        }

        return this;
    }

    /// Returns total price of order
    public double GetTotalPrice()
    {
        double price = 0.0;
        boolean hasToHouse = false;

        for (Pizza pizza : m_pizzas)
        {
            price += pizza.GetPrice();

            if (pizza.GetDeliveryMethod() == DeliveryMethod.TO_HOUSE)
            {
                hasToHouse = true;
            }
        }

        if (hasToHouse)
        {
            price += 4.0;
        }

        return price;
    }

    /// toString converter
    @Override
    public String toString()
    {
        return "\nZamówienie (" + GetTotalPrice() + " zł): " + m_pizzas;
    }

    private PizzaFactory m_pizzaFactory;
    private ArrayList<Pizza> m_pizzas;
    private DeliveryMethod m_deliveryMethod;

}
