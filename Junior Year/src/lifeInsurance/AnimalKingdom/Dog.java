package lifeInsurance.AnimalKingdom;

public abstract class Dog extends Mammal {
	public Dog() {
		legs = 4;
	}

	public String makeNoise() {
		return "Bark";
	}

	public String move() {
		return "Walk";
	}

}