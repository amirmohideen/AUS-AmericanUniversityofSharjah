public class Spell4Command implements Command 
{
	Spells spells;
	
	Spell4Command(Spells spells) {
		this.spells = spells;
		}
public void execute() {
	spells.Expecto();
}
}