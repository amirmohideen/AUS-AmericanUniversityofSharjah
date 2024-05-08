
public class Hermione implements Runnable{

	
	loc l;
	pot p;
	win w;
		
	Hermione(loc l1,pot p1,win w1) {
		Thread t = new Thread(this);
		l=l1;
		p=p1;
		w=w1;
		t.start();
	}
	
	public void run() {
		
		while(true)
		{
			if(l.getState()=="Library")
			{
				if((p.getState())== 2) 
					{ 
					
					if((w.getState())== true){//will only reveal herself if player has 2 potions and defeat malfoy
					System.out.println("\nHermione: I am here!");
					break;
				}
			}
			}
			
		}
	}
}
