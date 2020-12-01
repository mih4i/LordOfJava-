package theLordOfJava;

import java.util.ArrayList;

public class LordOfJava {
	private Parameters parameters;
	private Cohort<Dragon> dragons = new Cohort<>();
	private Cohort<Warg> wargs = new Cohort<>();
	private Cohort<Mumakil> mumakils = new Cohort<>();
	
	public LordOfJava(String OS, String gamePATH, String credentials, int noLives) {
		this.parameters = new Parameters(OS, gamePATH, credentials, noLives);
	}
	
	public void addCreature(Creature creature, String address) throws ClassNotFoundException {
		if(creature instanceof Dragon) {
			dragons.addNewCitizen((Dragon)creature, address);
		}else if(creature instanceof Warg) {
			wargs.addNewCitizen((Warg)creature, address);
		}else if(creature instanceof Mumakil) {
			mumakils.addNewCitizen((Mumakil)creature, address);
		}else {
			throw new ClassNotFoundException("Clasa nu exista sau nu mosteneste clasa 'Creature'.");
		}
	}
	
	public int battleDragonsWargs() {
		int duel = 0;
		if(dragons.size() > wargs.size()) {
			return duel+1;
		}else if(dragons.size() < wargs.size()) {
			return duel-1;
		}else {
			ArrayList<Dragon> dragon = dragons.getAllCitizensToFight();
			ArrayList<Warg> warg = wargs.getAllCitizensToFight();
			for(int i = 0; i < dragon.size() && i < warg.size(); i++) {
				if(dragon.get(i).compareTo(warg.get(i)) > 0) {
					duel++;
				}else if(dragon.get(i).compareTo(warg.get(i)) < 0) {
					duel--;
				}
			}
		}
		
		return duel;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		 sb.append("The parameters are: " + parameters.toString() + "\n");
		 sb.append("\nThe Dragon cohort: \n");
		 ArrayList<Dragon> dragon = dragons.getAllCitizensToFight();
		 for(int i = 0; i < dragon.size(); i++) {
			 sb.append(dragon.get(i).toString()+"\n");
		 }
		 
		 sb.append("\nThe Warg cohort: \n");
		 ArrayList<Warg> warg = wargs.getAllCitizensToFight();
		 for(int i = 0; i<warg.size(); i++) {
			 sb.append(warg.get(i).toString()+"\n");
		 }
		 
		 sb.append("\nThe Mumakil cohort: \n");
		 ArrayList<Mumakil> mumakil = mumakils.getAllCitizensToFight();
		 for(int i = 0; i < mumakil.size(); i++) {
			 sb.append(mumakil.get(i).toString()+"\n");
		 }
		 
		 return sb.toString();
	}
}
