package laboratorium.lab4.leagueOfHeroes.model.heroes;

public class Mage extends Hero {
	int magicLevel;
	
	public Mage(String name, int strength, int defence, int magicLevel) {
		super(name, strength, defence);
		this.magicLevel = magicLevel;
	}
	
	public int getMagicLevel() {
		return magicLevel;
	}

	public void setMagicLevel(int magicLevel) {
		this.magicLevel = magicLevel;
	}

	@Override
	public String toString() {
		return super.toString() + " magicLevel = " + magicLevel;
	}

	@Override
	public String ShowStats() {
		return super.ShowStats() + " magicLevel = " + magicLevel;
	}
	
	@Override
	public String report() {
		return "Mage report";
	}

}
