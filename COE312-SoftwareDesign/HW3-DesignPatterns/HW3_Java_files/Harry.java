
public class Harry extends ConcreteObserver implements Runnable{

loc l;
pot p;
win w;

Harry(Subject subject,loc l1,pot p1,win w1) {
		
	super(subject);
	
	l=l1;
	p=p1;
	w=w1;
	Thread t = new Thread(this);
	t.start();
}
	
	public void run() {
		
		while(true)
		{

		if(l.getState()=="Library") {
			if((p.getState())== 2) 
			{ 
			
			if((w.getState())== true){
			System.out.println("Found Hermione!");
			break;
			}
			}}
		}
	}
	
	public void update(int sec) {
		
		if (sec>5)
		{
			System.out.println( "You have been caught... and the Marauder’s map has been confiscated.");
			System.exit(0); 
		}
		System.out.println( sec +" minute passed...");
		if(sec==5)
		{
			System.out.println( "Hide map contents before you get caught!...");
		}
		
	
 }
}
