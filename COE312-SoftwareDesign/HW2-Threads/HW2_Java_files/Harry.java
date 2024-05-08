
public class Harry implements Runnable{

loc l;
	
Harry(loc l1) {
		
	this.l = l1;
	Thread t = new Thread(this);
	t.start();
}
	
	public void run() {
		
		while(true)
		{
		
		if(l.getState()=="Library") {
			System.out.println("Found Hermione!");
			break;
			}
			
		}
	}
}
