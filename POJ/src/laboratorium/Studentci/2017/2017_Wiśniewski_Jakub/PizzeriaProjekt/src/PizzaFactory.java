/**
 * Created by Kuba on 16.05.2017.
 */
public interface PizzaFactory {
    default Pizza createPizzaWegetarianska(int sizePizza){
        Pizza pc=PizzaFactoryCake.createPizzaCake(sizePizza);

        pc=new CheeseDecorator(pc);
        pc=new TomatoDecorator(pc);
        pc=new PepperDecorator(pc);
        pc.setName(pc.getName()+" Wegetarianska");
        return pc;
    }
    default Pizza createPizzaCapricciosa(int sizePizza)
    {
        Pizza pc=PizzaFactoryCake.createPizzaCake(sizePizza);
        pc=new MushroomsDecorator(pc);
        pc=new SauceDecorator(pc);
        pc=new HamDecorator(pc);
        pc.setName(pc.getName()+ " Capricciosa");
        return pc;
    }
    default  Pizza createPizzaPepperoni(int sizePizza)
    {
        Pizza pc=PizzaFactoryCake.createPizzaCake(sizePizza);
        pc=new SalamiDecorator(pc);
        pc=new HotPepperDecorator(pc);
        pc=new OnionDecorator(pc);
        pc=new CheeseDecorator(pc);
        pc.setName(pc.getName()+" Pepperoni");
        return pc;
    }

    public String getNameRestaurant();
}
