public class pot {
	
	int potion;

	pot() {
	   potion = 0; 
	    }

public synchronized int getState() {
	return potion;
	}

public synchronized void setState(int p) {
	this.potion = p;
	}

}
