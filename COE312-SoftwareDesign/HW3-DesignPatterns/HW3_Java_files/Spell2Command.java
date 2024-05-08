public class Spell2Command implements Command 
{
	Spells spells;
	
	Spell2Command(Spells spells) {
		this.spells = spells;
		}
public void execute() {
	spells.Stupefy();
}
}