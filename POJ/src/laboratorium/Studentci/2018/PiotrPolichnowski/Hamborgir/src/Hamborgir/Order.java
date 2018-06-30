package Hamborgir;

import java.util.ArrayList;

/// Class for ordering Hamborgirs
public class Order
{
    /// Package scope constructor
    Order(Hamborgir hamborgirRestaurant)
    {
        m_hamborgirRestaurant = hamborgirRestaurant;
        m_Burgers = new ArrayList<>();
        m_deliveryMethod = DeliveryMethod.LOCAL;
    }

    /// Sets delivery method
    public Order SetDeliveryMethod(DeliveryMethod deliveryMethod)
    {
        m_deliveryMethod = deliveryMethod;

        return this;
    }

    /// Adds new burger to order
    public Order Add(BurgerType burgerType, BurgerSize burgerSize)
    {
        switch (burgerType)
        {
            case VEGAN: m_Burgers.add(m_hamborgirRestaurant.CreateVEGAN(burgerSize, m_deliveryMethod)); break;
            case CHEESEBURGER: m_Burgers.add(m_hamborgirRestaurant.CreateCHEESEBURGER(burgerSize, m_deliveryMethod)); break;
            case BURGERSZEFA: m_Burgers.add(m_hamborgirRestaurant.CreateSZEFA(burgerSize, m_deliveryMethod)); break;
        }

        return this;
    }

    /// Returns total price of order
    public double GetTotalPrice()
    {
        double price = 0.0;
        boolean hasToHouse = false;

        for (Burger burger : m_Burgers)
        {
            price += burger.GetPrice();

            if (burger.GetDeliveryMethod() == DeliveryMethod.TO_HOUSE)
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
        return "\nZamówienie (" + GetTotalPrice() + " zł): " + m_Burgers;
    }

    private Hamborgir m_hamborgirRestaurant;
    private ArrayList<Burger> m_Burgers;
    private DeliveryMethod m_deliveryMethod;

}
