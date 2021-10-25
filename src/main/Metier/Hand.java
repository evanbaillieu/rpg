package main.Metier;

public class Hand extends Arme {

	public Hand(String name, Integer valeur, Integer dommage, Integer level) {
		super(name, valeur, dommage, level);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toAsciiArt() {
		// TODO Auto-generated method stub
		return "prendre un image de main en ascii art";
	}
	
	
	
}
