package main.Metier;

public class Hammer extends Arme{
	
	
	public Hammer(String name, Integer valeur, Integer dommage, Integer level) {
		super(name, valeur, dommage, level);
	}

	@Override
	public String toAsciiArt() {
		return  "	__,_____\n" +
				"  / __.==--\"\n" +
				" /#(-'\n" + 
				" `-'\n";
	}
}
