package Hamborgir;

import java.util.ArrayList;

/// Basic class
public class Burger
{
    Burger(String name, BurgerSize size, int hotLevel, double price, ArrayList<Ingredient> ingredients, DeliveryMethod deliveryMethod)
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
    public BurgerSize GetSize()
    {
        return m_size;
    }

    // Size getter
    public String GetSizeStr()
    {
        switch (m_size)
        {
            case NORMAL: return "Normalny";
            case XL: return "XL";
            case DOUBLEXL: return "2 x XL";
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
    private BurgerSize m_size;
    private int m_hotLevel;
    private double m_price;
    private ArrayList<Ingredient> m_ingredients;
    private DeliveryMethod m_deliveryMethod;

}
