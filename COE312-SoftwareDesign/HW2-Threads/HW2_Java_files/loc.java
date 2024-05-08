public class loc {
	
	String location;

	loc() {
	   location = "none"; 
	    }

public synchronized String getState() {
	return location;
	}

public synchronized void setState(String l) {
	this.location = l;
	}

}
