public class ControlPanel {
	Command [] slots;
	
public ControlPanel(Command [] slots) 
{
	this.slots = slots;
}

public void choice(int index){
slots[index].execute();
}
}