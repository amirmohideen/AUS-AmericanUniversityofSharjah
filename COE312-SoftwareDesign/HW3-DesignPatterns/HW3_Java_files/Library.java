//class Library
//contains look() function that describes the Library and mentions Hermione character in the room
//contains use() function that outputs the user doing an action with the object
//contains talk() function that prints an output of the character speaking to the user

public class Library extends Hogwarts implements look,use{

	win win1;
	
	Library(win w1)
	{
		locname="Library";
		win1 = w1;
	}
	public void look() 
	{
		System.out.print("You look around the magnificient "+locname+ " of Hogwarts."
				+ " In the centre of the library, you find Draco Malfoy drawing his wand to attack you!\n");
	}
	
	public void win()
	{
		System.out.print("You defeated Malfoy!\n");
		win1.setState(true);
	}
	
	public void use(String useinput) 
    { 
		if (useinput == "book")
		{
			System.out.println("You have picked up a book. The title says 'Diary of The Half-Blood Prince'.\n"+
		"You open the book and start to read the pages. You don't understand anything. You keep it down.\n");    
		}
		if (useinput == "quill") 
		{
			System.out.println("You have picked up a quill. You write in a piece of paper the following,"+
								" 'Hermione is a nerd...'	\n");
		}
    }
	
//	public void talk() 
//    { 
//		System.out.println("You: How do you pronounce Leviosa?");
//		System.out.println("Hermione: OMG! It's pronounced Levi'oosa. Not leviosa!");
//		System.out.println("You: *giggles*");
//		System.out.println("Hermione: Instead of wasting my time, read that book or take that quill and complete your essay!");
//    }
	
}
