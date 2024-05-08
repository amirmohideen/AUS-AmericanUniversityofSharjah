import java.util.concurrent.TimeUnit;

public class Watch implements Runnable{

//time tim;
Thread t;
	
	Watch() {
		
		//this.tim=t1;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		
		//long start = System.currentTimeMillis();
		
		try {
			TimeUnit.SECONDS.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( "1 minute passed...");
		
		try {
			TimeUnit.SECONDS.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( "2 minutes passed...");
		
		try {
			TimeUnit.SECONDS.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( "3 minutes passed...Hide map contents before someone sees you!\n");
		
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println( "You have been caught... and the Marauder’s map has been confiscated.");
		System.exit(0);
		 
		
//		while(true)
//		{
			
			
//			long end = System.currentTimeMillis();
//			long elapsedTime = end - start;
//			
//			if(elapsedTime/1000 == 1)
//				{
//				System.out.println(elapsedTime/1000 + " seconds");
//				
//				}
//			else if(elapsedTime/1000 == 2)
//			{
//			System.out.println(elapsedTime/1000 + " seconds");
//			
//			}
			
		}
	
	
}
