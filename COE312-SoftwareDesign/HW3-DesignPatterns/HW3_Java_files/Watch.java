import java.util.concurrent.TimeUnit;

public class Watch extends ConcreteSubject implements Runnable{

//time tim;
Thread t;
int sec=0;

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
		
		sec=1;
		notifyObservers(sec); 
		
		
		try {
			TimeUnit.SECONDS.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sec=2;
		notifyObservers(sec);
		
		try {
			TimeUnit.SECONDS.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sec=3;
		notifyObservers(sec);
		
		try {
			TimeUnit.SECONDS.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sec=4;
		notifyObservers(sec);
		
		try {
			TimeUnit.SECONDS.sleep(60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sec=5;
		notifyObservers(sec);

		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sec=6;
		notifyObservers(sec);
		
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
