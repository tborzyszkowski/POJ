package _09_Swing;

/**
   @version 1.30 2000-05-02
   @author Cay Horstmann
*/

 import javax.swing.*;
 import java.awt.*;
 
 public class NieWitajSwiecie
 {  
    public static void main(String[] args)
    {  
       RamkaNieWitajSwiecie ramka = new RamkaNieWitajSwiecie();
       ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ramka.setVisible(true);
       //ramka.show();
    }
 }
 
 /**
    Ramka , zawierajaca panel wiadomosci
 */
 class RamkaNieWitajSwiecie extends JFrame
 {
    public RamkaNieWitajSwiecie()
    {
       setTitle("NieWitajSwiecie");
       setSize(SZEROKOSC, WYSOKOSC);
 
       // dolacz panel do ramki
 
       PanelNieWitajSwiecie panel = new PanelNieWitajSwiecie();
       Container powZawartosci = getContentPane();
       powZawartosci.add(panel);
    }
 
    public static final int SZEROKOSC = 800;
    public static final int WYSOKOSC = 600;  
 }
 
 /**
    Panel, wyswietlajacy wiadomosc
 */
 class PanelNieWitajSwiecie extends JPanel
 {  
    public void paintComponent(Graphics g)
    {  
       super.paintComponent(g);
       	
       g.drawString("To nie jest program 'Witaj, Swiecie'", 
          WIADOMOSC_X, WIADOMOSC_Y);   
    }
 
    public static final int WIADOMOSC_X = 200;
    public static final int WIADOMOSC_Y = 300;
 }
