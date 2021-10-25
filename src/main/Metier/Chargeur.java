package main.Metier;

public class Chargeur extends Potion{
	private Integer munition; 
	
	public Chargeur(String name, Integer valeur, Integer level, Integer quantiter, Integer munition) {
		super(name, valeur, level, quantiter);
		this.munition = munition;
	}
	
	public Integer getMana() {
		return this.munition;
	}
	
	@Override
	public String toAsciiArt() {
		return null;
	}

}
