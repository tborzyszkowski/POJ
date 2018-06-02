package PizzaProject;

/// Factory specialization for Kwidzyn
public class PizzaFactoryKwidzyn extends PizzaFactory
{
    /// Default constructor
    public PizzaFactoryKwidzyn()
    {

    }

    /// Returns name of the restaurant
    @Override
    public String GetRestaurantName()
    {
        return "California";
    }

}
