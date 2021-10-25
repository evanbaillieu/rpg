package main.Metier;

import java.util.ArrayList;
import java.util.List;

public class Marchant extends Personne {

	private List<Item> marcket;

	public Marchant(String nom, Integer pv, Integer xp, Integer or, List<Item> marcket) {
		super(nom, pv, xp, or);
		// TODO Auto-generated constructor stub
		this.marcket = marcket;;
	}

	public List<Item> getMarcket() {
		return marcket;
	}
	
	public void affMarcket(){
			int i = 0;
			for(Item item: this.marcket) {
				System.out.println(item.toString()+ "\n "+ i + " : \n " + item.toAsciiArt());
				i++;
			}
	}
	
	public Item achete(Integer i) {
		Item itemAcheter = this.marcket.get(i);
		return itemAcheter;
	}
	
	public Integer vendre(Item obj) {
		this.marcket.add(obj);
		return obj.getValeur();
	}
	
}
