package PizzaProject;

import java.util.ArrayList;

/// Basic pizza class
public class Pizza
{
    /// Non-public constructor to call from factory
    Pizza(String name, PizzaSize size, int hotLevel, double price, ArrayList<Ingredient> ingredients, DeliveryMethod deliveryMethod)
    {
        m_name = name;
        m_size = size;
        m_hotLevel = hotLevel;
        m_price = price;
        m_ingredients = ingredients;
        m_deliveryMethod = deliveryMethod;
    }

    /// Name getter
    public String GetName()
    {
        return m_name;
    }

    // Size getter
    public PizzaSize GetSize()
    {
        return m_size;
    }

    // Size getter
    public String GetSizeStr()
    {
        switch (m_size)
        {
            case SMALL: return "Mała";
            case MEDIUM: return "Średnia";
            case BIG: return "Duża";
        }

        return "Zły rozmiar";
    }

    // Hot level getter
    public int GetHotLevel()
    {
        return m_hotLevel;
    }

    // Price getter
    public double GetPrice()
    {
        return m_price;
    }

    // Ingredients getter
    public ArrayList<Ingredient> GetIngredients()
    {
        return m_ingredients;
    }

    // Delivery type getter
    public DeliveryMethod GetDeliveryMethod()
    {
        return m_deliveryMethod;
    }

    // Delivery type getter
    public String GetDeliveryMethodStr()
    {
        switch (m_deliveryMethod)
        {
            case LOCAL: return "Na miejscu";
            case TAKEAWAY: return "Wynos";
            case TO_HOUSE: return "Dowóz";
        }

        return "Zły sposób wydania";
    }

    /// toString converter
    @Override
    public String toString()
    {
        return "\nNazwa: " + GetName() +
               "\nRozmiar: " + GetSizeStr() +
               "\nStopień ostrości: " + GetHotLevel() +
               "\nCena: " + GetPrice() +
               "\nSkładniki: " + GetIngredients() +
               "\nSposób wydania: " + GetDeliveryMethodStr() + "\n";
    }

    private String m_name;
    private PizzaSize m_size;
    private int m_hotLevel;
    private double m_price;
    private ArrayList<Ingredient> m_ingredients;
    private DeliveryMethod m_deliveryMethod;

}
