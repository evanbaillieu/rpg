package main.Metier;

public class Humain extends Playeur{
	
	
	private Integer endurance; 
	
	public Humain(String nom, Arme main) {
		super(nom, 300, 0, 0, main);
		this.endurance = 100;
		// TODO Auto-generated constructor stub
	}
	
	public boolean changeArme(Item arme) {
		if(arme instanceof Epee) {
			super.addInventaire(super.getMain());
			this.main = (Arme) arme;
			super.removeInventaire(arme);
			return true;
		}else if(arme instanceof Axe) {
			super.addInventaire(super.getMain());
			this.main = (Arme) arme;
			super.removeInventaire(arme);
			return true;
		}else{
			return false;
		}
	}
	
	public Integer getEndurance() {
		return this.endurance;
	}

}
