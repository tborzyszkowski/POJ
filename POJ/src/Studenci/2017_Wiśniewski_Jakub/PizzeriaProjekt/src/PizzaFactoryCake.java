/**
 * Created by Kuba on 16.05.2017.
 */
public interface PizzaFactoryCake {
    static Pizza createPizzaCake(int sizePizza) {
        switch (sizePizza) {
            case 1: {
                return new SmallPizza();
            }
            case 2: {
                return new MediumPizza();
            }
            case 3: {
                return new LargePizza();
            }
            default: {
                return new SmallPizza();
            }
        }
    }


}
