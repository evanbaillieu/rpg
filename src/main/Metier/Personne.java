package main.Metier;

public class Personne {
	
	private String nom;
	protected Integer pv;
	private Integer xp;
	private Integer or;
	
	public Personne() {
		
	}
		
	public Personne(String nom, Integer pv, Integer xp, Integer or) {
		this.nom = nom;
		this.pv = pv;
		this.xp = xp;
		this.or = or;
	}



	public String getNom() {
		return nom;
	}



	public Integer getPv() {
		return pv;
	}



	public Integer getXp() {
		return xp;
	}



	public Integer getOr() {
		return or;
	}

	public void resetXp() {
		this.xp = 0;
	}
	public void addXp(int xp) {
		this.xp += xp;
	}
	public void addOr(int or) {
		this.or = or;
	}
	@Override
	public String toString() {
		return "nom :" + nom + ", pv :" + pv + ", xp :" + xp + ", or :" + or;
	}
	
}
