package deepcopy;
/*
 * Klasa nie do klonowania
 */
public class Foo {
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
}
