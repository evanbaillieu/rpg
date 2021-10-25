package main.Metier;

public abstract class Item {
	private String nom;
	private Integer valeur;
	private Integer level;
	

	public Item(String name, Integer valeur, Integer level) {
		this.nom = name;
		this.valeur = valeur;
		this.level = level;
	}

	public String getNom() {
		return nom;
	}
	
	public Integer getValeur() {
		return valeur;
	}

	@Override
	public String toString() {
		return "Item : nom : " + nom + ", valeur :" + valeur ;
	}
	
	public abstract String toAsciiArt();

	
}
