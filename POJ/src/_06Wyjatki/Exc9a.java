package _06Wyjatki;

import java.io.IOException;
import java.util.Random;

class Exc9a {
    static void throwOne() throws IllegalAccessException
    {
    	System.out.println("Wewnątrz metody");
    	Random rand = new Random();
    	
    	if (rand.nextBoolean()) {
    		System.out.println("True");
    		throw new ArithmeticException("To tylko test");
//    		throw new IOException("To tylko test");
    	}
    	else { 
    		System.out.println("False");
    		throw new IllegalAccessException("To tylko test");
    	}
    }
    
    public static void main(String args[]) 
    		throws IllegalAccessException
    {
    	throwOne();
    }
}
