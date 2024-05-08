public class win {
	
	boolean win;

	win() {
	   win = false; 
	    }

public synchronized boolean getState() {
	return win;
	}

public synchronized void setState(boolean w) {
	this.win = w;
	}

}
