package laboratorium.lab4.leagueOfHeroes.model.heroes;

public abstract class Hero implements IStat, IReport{
	private String name;
	private int strength;
	private int defence;

	
	public Hero(String name, int strength, int defence) {
		super();
		this.name = name;
		this.strength = strength;
		this.defence = defence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	@Override
	public String toString() {
		return this.getClass().getName()+ ": name=" + name + ", strength=" + strength + ", defence=" + defence;
	}

	@Override
	public String ShowStats() {
		return "strength / defence = " + (1.0 * strength / defence);
	}

}
