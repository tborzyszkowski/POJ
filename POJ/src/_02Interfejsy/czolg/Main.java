package _02Interfejsy.czolg;

public class Main {

	public static void main(String[] args) {
       Czolg czolg1 = new Czolg();

       System.out.println(czolg1);

       Czolg czolg2 = new Czolg(czolg1);

       System.out.println(czolg2);

       System.out.println(czolg1 == czolg2);
       System.out.println(czolg1.getDzialo() == czolg2.getDzialo());
      }
}
