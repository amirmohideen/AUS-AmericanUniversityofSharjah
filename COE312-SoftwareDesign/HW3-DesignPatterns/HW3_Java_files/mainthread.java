import java.util.Scanner;

public class mainthread implements  Runnable{

	int potion1=0,potion2 =0;
	loc loc;
	pot pot;
	win win1;
	Thread t;
	
	
	mainthread( loc l1,pot p1,win wmain) {
		
		
		this.loc = l1;
		this.pot = p1;
		this.win1 = wmain;
	    t = new Thread(this);
	    t.start();
	}
	
	public void run() {
	    
			//Initializations
			
			Library l=new Library(win1);
			DiningHall d=new DiningHall();
			PotionsClassroom p=new PotionsClassroom();
			
			//we assume the user types all input in lowercase
			
			// For password
			Scanner in = new Scanner(System.in);
			
			System.out.println("“Messrs Moony, Wormtail, Padfoot and Prongs Purveyors of Aids to magical Mischief-Makers are proud to present THE MARAUDER'S MAP”\n" + 
					"Say the magic phrase to reveal the map.\n");
	        
	        String input = in.nextLine();  
	                   
			while(!input.contains("i solemnly swear that i am up for no good")) {
				System.out.println("Wrong Password! Try Again:\n");
				 input = in.nextLine();  
			}
			 
			//while loop to continue asking user questions until user decides to exit by typing 'mischief managed'
			
			loc.setState("Entrance"); //to enter switch case
			
			while(!input.contains("mischief managed")) {
			
				switch(loc.getState()) {
				
				//contains 4 cases with 4 locations: Entrance, Dining Hall, Library, Potions Classroom
					case "Entrance":
						while(loc.getState().contains("Entrance")) {
							
								System.out.println("The Entrance\n" + 
								"You arrive at the doors of Hogwarts. The door on the north wall leads to the dining hall,\n"+
										"the door to the east leads to the Potions class, and the door to the west leads to the Library.");
								System.out.println("Which direction would you like to walk to? (walk north/east/west)\n");
							 	input = in.nextLine();
				
							 	if(input.contains("north")) {
							 		System.out.print("You have entered the dining hall.\n");
									loc.setState("Dining Hall");
									break;
							 	}
							 	else if(input.contains("west")) {
							 		System.out.print("You have entered the Library.\n");
									loc.setState("Library");
									break;
								}
								else if(input.contains("east")) {
									System.out.print("You have entered the potions class.\n");
									loc.setState("Potions Classroom");
									break;
								}
								else if (input.contains("mischief managed")) {
									break;
								}
								else {
									System.out.print("Wrong input! Try again\n");	
								}
							}
					
					case "Dining Hall":
						while(loc.getState().contains("Dining Hall")) {
							
							input = in.nextLine();
							if(input.contains("look")) {
								d.look();
							}
							else if(input.contains("expelliarmus") || input.contains("stupefy") ||input.contains("protego")||input.contains("expecto patronum"))
							{d.win();}
//							else if(input.contains("talk")) {
//									if(input.contains("dumbledore")) {
//									d.talk();
//									}
//									else {
//									System.out.print("This character is not here.\n");
//									}
//							}
							else if(input.contains("use")) {
									if(input.contains("hat")) {
										
										d.use("sorting hat");
									}
									else if(input.contains("plate")) { //changed to plate to make a meaningful sentence in output
										d.use("plate");}
									else {
										System.out.print("You can only use a sorting hat or plate.\n");
									}
							}
							
							else if(input.contains("north")||input.contains("east")||input.contains("west")) {
								System.out.print("You find that there is only one direction to walk, south\n");
							}
							else if (input.contains("south")) {
								loc.setState("Entrance");
							}
							else if (input.contains("mischief managed")) {
								break;
							}
							else {
								System.out.print("Wrong input");
							}
							
						}
						break;
				
						
					case "Library":
						
						
						while(loc.getState()=="Library") {
							input = in.nextLine();
							if (input.contains("look")) {
								l.look();	
							}
							else if(input.contains("expelliarmus") || input.contains("stupefy") ||input.contains("protego")||input.contains("expecto patronum"))
								l.win();
//							else if(input.contains("talk")) {
//								if(input.contains("hermione")) {
//									l.talk();
//								}
//								else {
//									System.out.print("This character is not here!\n");}
//							}
							else if(input.contains("use")) {
								if(input.contains("book")) {
									l.use("book");
										}
								else if(input.contains("quill")) {
									l.use("quill");
								}
								else {
								System.out.print("You can only use a book or quill.\n");}
							}
							else if(input.contains("north")||input.contains("west")||input.contains("east")) {
								System.out.print("You find that there is only one direction to walk, south\n");
							}else if (input.contains("south")) {
								loc.setState("Entrance");
							}
							else if (input.contains("mischief managed")) {
								break;
							}
							else {
								System.out.print("Wrong input!\n");
							}
							}
							break;
						
						
					case "Potions Classroom":
						while(loc.getState()=="Potions Classroom") {
							input = in.nextLine();
							if (input.contains("look")) {
								p.look();
							}
							else if(input.contains("expelliarmus") || input.contains("stupefy") ||input.contains("protego")||input.contains("expecto patronum"))
								p.win();
//							else if(input.contains("talk")) {
//								if(input.contains("snape")) {
//									p.talk();
//								}
//								else {
//									System.out.print("This character is not here!\n");
//									}
//							}
							else if(input.contains("make")) {
								if(input.contains("polyjuice")) {
									p.use("polyjuice");
									potion1++;
									if(potion1==2)
									{pot.setState(potion1);}//indicates how many polyjuice potions player has for hermione to know 
										
								}
								else if(input.contains("invisibility")){
									p.use("invisibility");
										potion2++;
										if(potion2==2)
										{pot.setState(potion2);}//indicates how many invisibility potions player has for hermione to know 
								}
								else {
								System.out.print("You can only make a polyjuice or a invisibility potion.\n");}
							}
							else if(input.contains("north")||input.contains("west")||input.contains("east")) {
								System.out.print("You find that there is only one direction to walk, south\n");
							}
							else if (input.contains("south")) {
								loc.setState("Entrance");
							}
							else if(input.equals("mischief managed")) {
								break;
							}
							else {
								System.out.print("Wrong input!\n");	
							}
						}
						break;
						
					default: System.out.print("Incorrect input!\n");
				
				}
			}
			
			
			
			in.close();
			System.out.print("Hiding map contents...end\n");
		
	    }
	

	
}
