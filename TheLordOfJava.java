package theLordOfJava;

public class TheLordOfJava {

	public static void main(String[] args) {
		LordOfJava game1 = new LordOfJava("Window 10", "D/:Games", "neXus", 3);
		
		Creature dragon1 = new Dragon(100,200,125,"DragonBorn", 11, 15, 50);
		Creature dragon2 = new Dragon(125,205,125,"Drogo", 15, 19, 70);
		Creature dragon3 = new Dragon(117,185,135,"Balaur", 10, 16, 45);
		Creature dragon4 = new Dragon(85,190,110,"Balthazar", 8, 13, 38);
		
		Creature warg1 = new Warg(100,150,90,"Waarrgh", 17, 75);
		Creature warg2 = new Warg(125,140,84,"Rooargh", 12, 72);
		Creature warg3 = new Warg(120,145,92,"Aarrgh", 14, 70);
		Creature warg4 = new Warg(85,160,115,"HaHaHa", 20, 90);
		
		Creature mumakil1 = new Mumakil(75,50,66,"Mumia1", 20);
		Creature mumakil2 = new Mumakil(77,60,70,"Mumia2", 21);
		Creature mumakil3 = new Mumakil(60,41,60,"Mumia3", 14);
		Creature mumakil4 = new Mumakil(56,38,58,"Mata", 13);
		
		try{
			game1.addCreature(dragon1, "100,205");
			game1.addCreature(dragon2, "200,205");
			game1.addCreature(dragon3, "300,25");
			game1.addCreature(dragon4, "560,1000");
			game1.addCreature(warg1, "50,306");
			game1.addCreature(warg2, "350,438");
			game1.addCreature(warg3, "123,568");
			game1.addCreature(warg4, "468,896");
			game1.addCreature(mumakil1, "678,864");
			game1.addCreature(mumakil2, "123,975");
			game1.addCreature(mumakil3, "538,378");
			game1.addCreature(mumakil4, "398,367");
				
		}catch(ClassNotFoundException e) {
			e = new ClassNotFoundException("Clasa nu exista sau nu mosteneste clasa 'Creature'.");
		}
		
		
		int duel = game1.battleDragonsWargs();
		if(duel > 0) {
			System.out.println("The Dragons have won: " + duel);
		}else if(duel < 0) {
			System.out.println("The Wargs have won: " + duel*(-1));
		}else {
			System.out.println("The armies were equal in power. Nobod was left standing. The End!");
		}
		
		System.out.println();
		System.out.println(game1.toString());
	}
}
