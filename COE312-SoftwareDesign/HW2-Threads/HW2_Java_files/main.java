import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class main {	
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		loc l = new loc();
		//time t = new time();
		
		mainthread main = new mainthread(l);
		Watch w = new Watch();
		Harry h = new Harry(l);
		Hermione her = new Hermione(l);
	
		
	}
}
