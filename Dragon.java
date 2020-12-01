package theLordOfJava;

public class Dragon extends Creature implements IBurn{
	private double flamesPower;
	private int flySpeed;
	
	public Dragon(double stamina, double speed, int agility, 
			String nickname, long score, 
			double flamesPower, int flySpeed) {
		super(stamina, speed, agility, nickname, score);
		this.flamesPower = flamesPower;
		this.flySpeed = flySpeed;
	}

	@Override
	public double getFlamesPower() {
		// TODO Auto-generated method stub
		return this.flamesPower;
	}

	@Override
	public int getFlyingSpeed() {
		// TODO Auto-generated method stub
		return this.flySpeed;
	}
	
	@Override
	public void powerUp(double newStamina, double newSpeed, int newAgility) {
		super.powerUp(2*newStamina, newSpeed/2, 3*newAgility);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "Flames power: " + this.flamesPower + "\nFly speed: " + this.flySpeed;
	}
}
