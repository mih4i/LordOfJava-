package theLordOfJava;

public abstract class Creature implements ICreature, Comparable<Creature>{
	private Abilities abilities;
	private String nickname;
	private long score;
	
	
	public Creature(double stamina, double speed, int agility, 
			String nickname, long score) {
		abilities = new Abilities(stamina, speed, agility);
		this.nickname = nickname;
		this.score = score;
	}
	
	@Override
	public String getNickname() {
		// TODO Auto-generated method stub
		return nickname;
	}
	
	@Override
	public void setNickname(String nickname) {
		// TODO Auto-generated method stub
		this.nickname = nickname;
	}

	@Override
	public void updateScore(long amount) throws NumberFormatException {
		// TODO Auto-generated method stub
		if(amount > 0) {
			this.score += amount;
		}else {
			throw new NumberFormatException("Expecting positive bonus value, got: " + amount);
		}
	}

	@Override
	public void powerUp(double stamina, double speed, int agility) {
		// TODO Auto-generated method stub
		this.abilities.update(stamina, speed, agility);
	}

	@Override
	public int compareTo(Creature other) {
		// TODO Auto-generated method stub
		return this.abilities.compareTo(other.abilities);
	}
	
	@Override
	public String toString() {
		return "Nickname: " + this.nickname + "\nScore: " + this.score + "\n" + this.abilities.toString();
	}
}
