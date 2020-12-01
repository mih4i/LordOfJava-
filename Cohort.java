package theLordOfJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cohort<C extends Creature>{
	private Map<String, C> container = new HashMap<String, C>();

	public int size() {
		return this.container.size();
	}
	
	public C getCitizenAt(String address) {
		return this.container.get(address);
	}
	
	public boolean isEmpty() {
		return this.container.isEmpty();
	}
	
	public void addNewCitizen(C creature,String address) {
		this.container.put(address, creature);
	}
	
	public ArrayList<C> getAllCitizensToFight(){
		ArrayList<C> readyToFight= new ArrayList<C>();
		for(String iter : container.keySet()) {
			readyToFight.add(container.get(iter));
		}
		
		Collections.sort(readyToFight);
		
		return readyToFight;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(String iter: container.keySet()) {
			sb.append(container.get(iter).toString() + "\n\n");
		}
		
		return sb.toString();
	}
}
