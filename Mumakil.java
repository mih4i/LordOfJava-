package theLordOfJava;

public class Mumakil extends Creature{
	
	public Mumakil(double stamina, double speed, int agility, String nickname, long score) {
		super(stamina, speed, agility, nickname, score);
	}
	
	@Override
	public void powerUp(double newStamina, double newSpeed, int newAgility) {
		super.powerUp(0.75*newStamina, newSpeed + 10, newAgility);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "A creature of type Mumakil.";
	}
}
