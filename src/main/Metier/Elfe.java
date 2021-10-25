package main.Metier;

public class Elfe extends Playeur{
	
	private Integer mana;
	private Integer endurence;
	
	public Elfe(String nom, Arme main) {
		
		super(nom, 250, 0, 0, main);
		this.endurence = 100;
		this.mana = 100;
		// TODO Auto-generated constructor stub
	}
	public boolean changeArme(Item arme) {
		if(arme instanceof Arc) {
			super.addInventaire(super.getMain());
			this.main = (Arme) arme;
			super.removeInventaire(arme);
			return true;
		}else if(arme instanceof Lance) {
			super.addInventaire(super.getMain());
			this.main = (Arme) arme;
			super.removeInventaire(arme);
			return true;
		}else{
			return false;
		}
	}
	
}
