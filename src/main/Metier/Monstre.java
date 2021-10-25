package main.Metier;

public class Monstre extends Personne {
	
	private Integer Domage;

	public Monstre(String nom, Integer pv, Integer xp, Integer or, Integer domage) {
		super( nom,  pv,  xp, or);
		Domage = domage;
	}
	
	public void degaRecu(int deg) {
		this.pv -= deg;
	}
	
	public Integer getDomage() {
		return Domage;
	}

	@Override
	public String toString() {
		return  super.toString() + " Domage : " + Domage + " \n";
	}
	
	
	
}
