package theLordOfJava;

public class Abilities implements Comparable<Abilities>{
	private double stamina;
	private double speed;
	private int agility;
	
	public Abilities(double stamina, double speed, int agility) {
		this.stamina = stamina;
		this.speed = speed;
		this.agility = agility;
	}

	@Override
	public int compareTo(Abilities other) {
		if(powerDifferenceApprox(other) > 0) {
			return 1;
		}else if(powerDifferenceApprox(other) < 0) {
			return -1;
		}else {
			if(this.speed > other.speed) {
				return 1;
			}else if(this.speed < other.speed) {
				return -1;
			}else {
				if(this.agility > other.agility) {
					return 1;
				}else if(this.agility < other.agility) {
					return -1;
				}else {
					return 0;
				}
			}
		}
	}
	
	public void update(double stamina, double speed, int agility) {
		this.stamina += stamina;
		this.speed += speed;
		this.agility += agility;
	}
	
	public int powerDifferenceApprox(Abilities other) {
		return (int)(this.stamina-other.stamina);
	}
	
	@Override
	public String toString() {
		return "Player has a power of: " +this.stamina + ",the speed: " + this.speed + " and the agility: " + this.agility + ".";
	}

	public double getStamina() {
		return stamina;
	}

	public void setStamina(double stamina) {
		this.stamina = stamina;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}
	
	

}
