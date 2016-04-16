package laboratorium.lab3.heros;


public class Archer extends Hero  implements ICanBeHero  {

	@Override
	protected void modifyStrength() {
		strength=(int)((strength+1)/1.05);
		strength++;
		strength*=1.05;
	}

	@Override
	protected void modifyDefence() {
		defence=(int)((defence+1)/1.05);
		defence++;
		defence*=1.05;
	}

	@Override
	protected void modifyIntelligence() {
		intelligence++;
	}

	@Override
	protected void modifySDextrity() {
		dextrity=(int)((dextrity+1)/1.2);
		dextrity++;
		dextrity*=1.2;
	}

	@Override
	protected void modifyAgility() {
		agility=(int)((agility+1)/1.1);
		agility++;
		agility*=1.1;
	}

	@Override
	protected void modifySpeed() {
		speed=(int)((speed+1)/1.05);
		speed++;
		speed*=1.05;
	}
}
