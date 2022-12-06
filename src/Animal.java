
public class Animal {

	private String name;

	private int legs;
	
	private boolean canFly;
	
	
	public Animal() {
		System.out.println("In constructor");
		name = "Dier";
		legs = 4;
		canFly = true;
	}
	
	public Animal(String nieuweNaam) {
		name = nieuweNaam;
		legs = 2;
	}
	
	public Animal(String nieuweNaam, int nieuweLegs) {
		name = nieuweNaam;
		legs = nieuweLegs;
	}

	public Animal(int nieuweLegs, String nieuweNaam) {
		name = nieuweNaam;
		legs = nieuweLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

}
