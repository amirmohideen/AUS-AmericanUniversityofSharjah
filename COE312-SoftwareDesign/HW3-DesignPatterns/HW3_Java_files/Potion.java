
public abstract class Potion {

	void Potion()
	{
		
	}
	
	final void preparepotion() {
		add();
		stir();
		heat();
		
		if(polyjuice()){
			wave();
			}
		
		
		status();
	}

	private boolean polyjuice() {
		return true;
		}
	
	 protected void heat() {
		
		 System.out.println("Heating at high temperature…");
		
	}

	 protected void status() {
			
		 System.out.println("Potion is ready!");
		
	}
	abstract void add();
	 abstract void stir();
	 abstract void wave();
}
