

public class time {
	
	double elapsedtime;
	

	time() {
		elapsedtime = 0; 
	   
	    }

public synchronized double gettime() {
	return elapsedtime;
	}

//public synchronized long getend() {
//	return end;
//	}

public synchronized void settime(double t) {
	this.elapsedtime = t;
	}

//public synchronized void setend(long t) {
//	this.end = t;
//	}

}
