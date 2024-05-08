
public class Hermione implements Runnable{

	
	loc l;
		
	Hermione(loc l1) {
		Thread t = new Thread(this);
		this.l=l1;
		t.start();
	}
	
	public void run() {
		
		while(true)
		{
			if(l.getState()=="Library")
			{
				System.out.println("Harry I am here!");
				break;
			}
			
		}
	}
}
