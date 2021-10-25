package main.phisyque;

import java.util.ArrayList;
import java.util.List;

import main.Metier.*;



/**
 * 
 * @author evanbaillieu
 *
 */
public class ItemFactory {
	 private List<Item> items;
	 private static final String[] nameArc = { "arc en bois", "arc de chasse", "arc long", "arc en fer", "arc", "arc", "arc", "arc", "arc", "arc"};
	 private static final String[] nameAxe = { "hache en bois", "hache en fer" , "Bardiche", "Francisque", "Hache de Lochaber", "Labrys", "Tomahawk", "Haches de guerre", "haches en poisonner", "hache en diament"};
	 private static final String[] nameEpee = { "epee en bois", "Le glaive", "L'épée de chevalier", "La broadsword", "La claymore", "L'espadon", "L'épée bâtarde", "La flamberge", "La rapière", "La canne-épée"};
	 private static final String[] nameLance = { "lance en bois", "Anicroches", "Bardiche",  "Faux de guerre", "Pertuisane", "Pique", "Vouge", "Hache d'armes", "Guisarme", "Hallebarde"};
	 private static final String[] nameDague = { "Poignard en os", "Poignard en bois", "Poignard silex", "Poignard en fer", "Poignard de guerre", "lame assacins", "ouvre lettre", "Poignard en or", "Poignard en diament", "Poignard cacher"};
	 private static final String[] nameFusil = {  "fusil a plond", "fusil de chasse", "Fusil à pompe", "fusil à canons sciés", "Carabine semi-automatique", "Carabine à verrou", "Carabine linéaire", "Carabine à pompe", "Carabine à levier de sous garde", "Carabine Double Express"};
	 private static final String[] nameHammer = { "arc en bois", "arc de chasse", "arc long", "arc en fer", "arc", "arc", "arc", "arc", "arc", "arc"};
	 private static final String[] namePotionSoin = {"petit potion de soin", "potion de soin", "moyen potion de soin", "grand potion de soin"};
	 private static final String[] namePotionEndurence = {"petit potion d'Endurence", "potion d'Endurence", "moyen potion d'Endurence", "grand potion d'Endurence"};
	 private static final String[] nameChargeur = {"petit Chargeur", "Chargeur", "moyen Chargeur", "grand Chargeur"};
	 private static final Integer[] nameLevel = {1,10,20,30};
	 
	 public ItemFactory() {
		this.items = new ArrayList<Item>();
		this.createAll();
	 }
	 
	 private void createAll() {
		 this.createAllArme();
		 this.createAllPotion();
	 }
	 
	 private void createAllArme() {
		 for(int i = 1; i <= 10; i++) {
			 	Arme arc = new Arc(nameArc[i - 1], 5 * i, 5 * i, 5 * i );
				this.items.add(arc);
				Arme epee = new Epee(nameEpee[i-1], 5 * i, 5 * i ,5*i);
				this.items.add(epee);
				Arme dague = new Dague(nameDague[i - 1], 5 * i, 5 * i , (5*i) + 3);
				this.items.add(dague);
				Arme fusil = new Fusil(nameFusil[i - 1], 5 * i, 5 * i, 200, 5 * i );
				this.items.add(fusil);
				Arme lance = new Lance(nameLance[i-1], 5 * i, 5 * i ,(5*i)+3); 
				this.items.add(lance);
				Arme hammer = new Hammer(nameHammer[i - 1], 5 * i, 5 * i , (5*i) + 3);
				this.items.add(hammer);
			 }
	 }
	 
	 private void createAllPotion() {
		 	for(int i = 1; i <= 3; i++) {
		 		Potion potionE = new PotionSoin(namePotionSoin[i], 10 * i, nameLevel[i], 99, 20 * i);
		 		this.items.add(potionE);
		 		Potion potionS = new PotionEndurance(namePotionEndurence[i], 10 * i, nameLevel[i], 99, 20 * i);
		 		this.items.add(potionS);
		 	}
		 
	 }
	 
	 public List<Item> findAll(){
		 return this.items;
	 }
	 
	 public List<Item> findAllArme(){
		 List<Item> is = new ArrayList<Item>();
		 for(Item i : this.items) {
			 if(i instanceof Arme) {
				 is.add(i);
			 }
		 }
		 return is;
	 }
	 
	 public List<Item> findAllPotion(){
		 List<Item> is = new ArrayList<Item>();
		 for(Item i : this.items) {
			 if(i instanceof Potion) {
				 is.add(i);
			 }
		 }
		 return is;
	 }
	 
}
