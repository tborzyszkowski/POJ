package _06Wyjatki;

import java.io.IOException;
import java.util.Random;

class Exc9a {
    static void throwOne() throws IllegalAccessException, IOException
    {
    	System.out.println("Wewnątrz metody");
    	Random rand = new Random();
    	
    	if (rand.nextBoolean())
    		//throw new ArithmeticException("To tylko test");
    		//throw new IOException("To tylko test");
    		System.out.println("True");
    	else 
    		//throw new IllegalAccessException("To tylko test");
    		System.out.println("False");
    }
    
    public static void main(String args[]) 
    		throws IllegalAccessException, IOException
    {
    	throwOne();
    }
}
