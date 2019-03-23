package laboratorium.lab4.leagueOfHeroes.model.heroes;

public class Archer extends Hero {
	int numberOfArrows;
	
	public Archer(String name, int strength, int defence, int numberOfArrows) {
		super(name, strength, defence);
		this.numberOfArrows = numberOfArrows;
	}

	public int getNumberOfArrows() {
		return numberOfArrows;
	}

	public void setNumberOfArrows(int numberOfArrows) {
		this.numberOfArrows = numberOfArrows;
	}
	@Override
	public String ShowStats() {
		return super.ShowStats() + " numberOfArrows = "+ numberOfArrows;
	}

	@Override
	public String report() {
		return "Archer report";
	}

}
