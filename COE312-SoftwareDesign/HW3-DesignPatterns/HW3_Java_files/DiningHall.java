//class DiningHall
//contains look() function that describes the dining hall  and mentions Dumbledore character in the room
//contains use() function that outputs a random house or a random food
//contains talk() function that prints an output of the character speaking to the user

import java.util.Random;

public class DiningHall extends Hogwarts implements look,use{

//	Spells s = new Spells();
//	// create the commands
//	Spell1Command s1 = new Spell1Command(s);
//	Spell2Command s2 = new Spell2Command(s);
//	Spell3Command s3 = new Spell3Command(s);
//	Spell4Command s4 = new Spell4Command(s);
//	// create the panel
//	Command[] cmds = { s1, s2, s3, s4 };
//	ControlPanel p = new ControlPanel(cmds);
	
	
	String[] randomfood= {"Pizza", "Pasta", "Lasagna"};
	String[] house = {"Gryffindor!", "Slytherin!", "Ravenclaw!","Hufflepuff!"}; 
	Random rand = new Random(); 
	
	DiningHall()
	{
		locname = "Dining Hall";
	}
	
	public void look() 
	{
		System.out.print("The "+locname+ " is the biggest open area inside Hogwarts. "
				+ "Bellatrix Lestrange is here, get ready to fight!\n");
	}
	
	public void win()
	{
		System.out.print("You defeated Bellatrix! The door on the east leads to the Potions Classroom.\n");
	}
	
	
	
	public void use(String useinput) 
    { 
		if (useinput == "sorting hat") 
		{
			System.out.println("You walk towards the chair and you sit on it. You are nervous. The sorting hat is \n"+
		"placed on your head. He takes his sweet time choosing a house for you..." );
			System.out.print("Sorting Hat: "+house[rand.nextInt(4)]+"\n");
		
		}
		if (useinput == "plate") 
		{
			
			System.out.println("You find a huge table filled with all sorts of food. You spot your 3 most favourite food:\n" +
		"Pizza, Pasta, and Lasagna. You take your plate and decide to have " + randomfood[rand.nextInt(3)]+"\n");
		}
    }
	
//	public void talk() 
//    { 
//		System.out.println("Dumbledore: Welcome to the dining hall! Interact with the sorting hat to be sorted\n" + 
//				"into a house or grab a plate and enjoy the food served in the hall!\n");
//    }
}
