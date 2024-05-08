//class PotionsClassroom 
//contains look() function that describes potion classroom and mentions Professor Snape character in the room
//contains use() function that makes snape teach a class and prompts you to make a mixture 
		//with the item used that will give an output of whether you were successful in making the mixture or not.
//contains talk() function that prints an output of the character speaking to the user

import java.util.Random;

public class PotionsClassroom extends Hogwarts implements look,use{
	
	
	boolean[] chance= {true,false};
	Random rand = new Random(); 
	
	PotionsClassroom()
	{
		locname= "Potions classroom";
	}
	
	public void look() 
	{
		System.out.print("You are in the "+locname+"\n"+
	                     "Potions is one of the core subjects that first year students are required to study. In the\n" + 
	                     "potions class there is Professor Snape who teaches the subject. He does not seem very happy\n" + 
	                     "to see you and starts attacking you!\n ");
	}
	
	public void win()
	{
		System.out.print("You defeated Snape! Make the potions and go to the door on the west leading to the Library.\n");
	}
	
	public void use(String useinput) 
    { 
		if (useinput == "polyjuice")
		{
			PolyjuicePotion p = new PolyjuicePotion();
			p.preparepotion();
		}
		
		if (useinput == "invisibility") 
		{
			InvisibilityPotion i = new InvisibilityPotion();
			i.preparepotion();
		}
    }
    
//	public void talk() 
//    { 
//		
//		System.out.println("Professor Snape: You are here to learn the subtle science and exact art of potion-making.\n"
//				+ "You have two choices: Use a cauldron to understand the beauty of the softly simmering cauldron OR \n"
//				+ "Use a potion bottle to learn the dangerous procedure of potion making\n");
//	}
	
    }
	
