package PizzaProject;

/// Factory specialization for Brzegi
public class PizzaFactoryBrzegi extends PizzaFactory
{
    /// Default constructor
    public PizzaFactoryBrzegi()
    {

    }

    /// Returns name of the restaurant
    @Override
    public String GetRestaurantName()
    {
        return "Gusto Notte";
    }

}
