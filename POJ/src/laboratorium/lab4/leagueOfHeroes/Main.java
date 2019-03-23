package laboratorium.lab4.leagueOfHeroes;

import laboratorium.lab4.leagueOfHeroes.model.heroes.*;

public class Main {

	public static void main(String[] args) {
		
		IStat h;
		
		h = new Mage("MMMM", 10, 20, 50);
		
		System.out.println(h.ShowStats());
		
		Hero hh;
		Mage mm = new Mage("MMMM", 10, 20, 50);
		
		hh = mm; 
		
		System.out.println(hh.ShowStats());
	}

}
