package pizzeria;

// jedna z mozliwych funkcji  strategi
// ta ustawia stawke dowozu na 5zl
public class StawkaDowozu5 implements CenaDowozu {
    @Override
    public int ileDowoz(int cena)
    {
        return cena+5;
    }
    
}
