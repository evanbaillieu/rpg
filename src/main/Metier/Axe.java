package main.Metier;

public class Axe extends Arme {

	public Axe(String name, Integer valeur, Integer dommage , Integer level) {
		super(name, valeur, dommage, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toAsciiArt() {
		return  "   ,:\\      /:.\n" +
				"  //  \\_()_/  \\\\\n" +
				" ||   |    |   ||\n" + 
				" ||   |    |   ||\n"+
				" ||   |    |   ||\n" +
				"  \\\\  / || \\  //\n" +
				"   `:/  ||  \\;'\n" +
				"        ||\n"+
				"        ||\n" +
				"        ||\n" +
				"        XX\n" +
				"        XX\n"+
				"        XX\n"+
				"        OO\n"+
				"        `'\n";

	}

}
