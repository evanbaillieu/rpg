package main.Metier;

public abstract class  Arme extends Item {
	
	private Integer dommage;
	
	public Arme(String name, Integer valeur, Integer dommage, Integer level) {
		super(name	, valeur, level); 
		this.dommage = dommage;
	}


	public Integer getDommage() {
		return this.dommage;
	}
	
	public abstract String toAsciiArt();


	@Override
	public String toString() {
		return "Arme : " + super.toString() +" dommage :" + dommage + " \n";
	}
	
	
}
