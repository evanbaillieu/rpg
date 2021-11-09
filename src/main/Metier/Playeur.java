package main.Metier;

import java.util.ArrayList;
import java.util.List;

public abstract class Playeur extends Personne {
	
	private Integer level;
	public Arme main;
	private Integer endurance;
	private List<Item> inventaire;
	
	public Playeur(String nom, Integer pv, Integer xp, Integer or, Arme main) {
		super(nom, pv, xp, or);
		this.level = 1;
		this.main = main;
		this.endurance = 100;
		this.inventaire = new ArrayList<Item>();
	}
	
	
	
	public Arme getMain() {
		return main;
	}



	public List<Item> getInventaire() {
		return inventaire;
	}

	public void removeInventaire(Item arme) {
		this.inventaire.remove(arme);
	}
	public void addInventaire(Arme arme) {
		this.inventaire.add(arme);
	}

	public void addItem(Item obj) {
		this.inventaire.add(obj);
	}
	
	public void removeItem(Item obj) {
		this.inventaire.remove(obj);
	}
	
	public Integer attack(){
		if(this.main != null) 
			return main.getDommage();
		else 
			return 5;

	}
	
	public Integer attackSpecial(){
		if(this.main != null) { 
			this.endurance -= 5;
			return main.getDommage() * 2;
		}
		else 
			return 5;

	}
	
	public void degaRecu(int deg) {
		this.pv -=  deg;
	}
	

	public Integer getLevel() {
		return level;
	}
	
	public void checkLevel() {
		if(this.level * 1000 == super.getXp()) {
			this.level++;
			super.resetXp();
			
		}
	}
	
	public void acheteArme(Item arme) {
		this.inventaire.add(arme);
	}
	
	public void achetePotion(Item potion) {
		int flag = 0;
		for(Item item: this.inventaire) {
			if(item.equals(potion)) {
				flag += 1;
				((Potion) item).addQuantiter(((Potion) potion).getQuantiter());
			}
		}
		if(flag > 0) {
			this.inventaire.add(potion);
		}
	}
	
	
	public void afficheArme() {
		for(Item item: this.inventaire) {
			if(item instanceof Arme) {
				System.out.println(item.toString());
			}
			
		}
	}
	
	public int affichePotion() {
		int i = 0; 
		for(Item item: this.inventaire) {
			if(item instanceof Potion) {
				System.out.println(item.toString());
				i++;
			}
		}
		return i;
	}
	
	public void finCombat(int xp, int or) {
		super.addXp(xp);
		super.addOr(or);
	}
	
	public abstract boolean changeArme(Item arme);
	
	@Override
	public String toString() {
		return super.toString() + "level :" + level + ", main :" + main.toString() + ", nombre objet dans votre inventaire :" + inventaire.size() + "\n";
	}



	public String utilisePotion(String index) {
		// TODO Auto-generated method stub
		Item p = this.inventaire.get(Integer.valueOf(index));
		if(p instanceof PotionSoin) {
			super.pv +=  ((PotionSoin) p).getSoin();
			((PotionSoin) p).utilise();
			return "vous avais " + this.getPv() + " pv"; 
		}else if(p instanceof PotionEndurance){
			this.endurance += ((PotionEndurance) p).getEndurance();
			((PotionEndurance) p).utilise();
			return "vous avais " + this.getEndurance() + " endurance";
		}else {
			return "se n'est pas un potion utilisable";
		}
	}



	private Integer getEndurance() {
		return this.endurance;
	}


	
}
