package PizzaProject;

/// Abstract ingredient class
public abstract class Ingredient
{
    /// Never self constructed
    Ingredient()
    {

    }

    /// Name getter
    public abstract String GetName();

    /// toString converter
    @Override
    public String toString()
    {
        return GetName();
    }

}
