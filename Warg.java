package theLordOfJava;

public class Warg extends Creature implements IBite{
	double bitePower;
	
	public Warg(double stamina, double speed, int agility,
				String nickname, long score, double bitePower) {
		super(stamina, speed, agility, nickname, score);
		this.bitePower = bitePower;
	}

	@Override
	public double getBitePower() {
		// TODO Auto-generated method stub
		return this.bitePower;
	}
	
	@Override
	public void powerUp(double newStamina, double newSpeed, int newAgility) {
		super.powerUp(newStamina/2, 4*newSpeed, newAgility);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "Bite Power: " + this.bitePower;
	}
}
