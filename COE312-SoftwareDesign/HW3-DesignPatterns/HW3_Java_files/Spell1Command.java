public class Spell1Command implements Command 
{
	Spells spells;
	
	Spell1Command(Spells spells) {
		this.spells = spells;
		}
public void execute() {
	spells.Expelliarmus();
}
}