class Exc9a {
    static void throwOne() throws NullPointerException, IllegalAccessException 
    {
    	System.out.println("Wewnątrz metody");
    	throw new IllegalAccessException("To tylko test");
    }
    
    public static void main(String args[]) throws IllegalAccessException 
    {
    	throwOne();
    }
}
