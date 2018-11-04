package pizzeria;

// jedna z mozliwych funkcji  strategi
// ta ustawia stawke dowozu na 3zl
public class StawkaDowozu3 implements CenaDowozu
{
    @Override
    public int ileDowoz(int cena)
    {
        return cena+3;
    }
    
}
