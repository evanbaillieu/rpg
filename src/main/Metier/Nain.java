package main.Metier;

public class Nain extends Playeur{
	
	public Nain(String nom, Arme main) {
		super(nom, 200, 0, 0, main);
		// TODO Auto-generated constructor stub
	}
	public  boolean changeArme(Item arme) {
		if(arme instanceof Fusil) {
			super.addInventaire(super.getMain());
			this.main = (Arme) arme;
			super.removeInventaire(arme);
			return true;
		}else if(arme instanceof Dague) {
			super.addInventaire(super.getMain());
			this.main = (Arme) arme;
			super.removeInventaire(arme);
			return true;
		}else{
			return false;
		}
	};
}
