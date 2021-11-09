package main.phisyque;

import main.Metier.Monstre;
import main.Metier.Playeur;

public class PlayeurFactory {
	public Monstre generateMonteur(Playeur p){
		
		return new Monstre("orc",20 * p.getLevel(),100 * p.getLevel(),5 * p.getLevel(),5 * p.getLevel());
	}
	
	
}
