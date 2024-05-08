public class Spell3Command implements Command 
{
	Spells spells;
	
	Spell3Command(Spells spells) {
		this.spells = spells;
		}
public void execute() {
	spells.Protego();
}
}