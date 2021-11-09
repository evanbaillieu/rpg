package main.client;

import java.util.List;
import java.util.Scanner;

import main.Metier.Arme;
import main.Metier.Elfe;
import main.Metier.Hand;
import main.Metier.Humain;
import main.Metier.Item;
import main.Metier.Nain;
import main.Metier.Marchant;
import main.Metier.Monstre;
import main.Metier.Playeur;
import main.phisyque.MarchantFactory;
import main.phisyque.PhisyqueFactory;
import main.phisyque.PlayeurFactory;

public class Game {
	private Playeur joueur;
	private final PlayeurFactory playeurFactory;
	private final MarchantFactory marchantFactory;
	

	private Marchant marchant;
	
	public Game(){
		this.playeurFactory = new PhisyqueFactory().getPlayeurFactory();
		this.marchantFactory = new PhisyqueFactory().getMarchantFactory();
		this.marchant = this.marchantFactory.getMarchant();
		this.joueur = createPerso();
		System.out.println("bienvenue sur terre vous allez aire a la recherche d'arme ultime");
		System.out.println(this.joueur);
	}
	
	public void objetUtilisable() {
		// TODO Auto-generated method stub
		System.out.println("vous continuer a aire a la cherche un marchant ou un monstre plus fort");
		System.out.println("vouler vous utilser un objet.");
		String choix = "";
		Scanner clavier = new Scanner(System.in);
		while(choix != "exit") {
			System.out.println("utilise une potion: 1, changer d'arme : 2, exit pour quiter");
			choix = clavier.nextLine();
			switch(choix) {
				case "1":
					this.joueur.affichePotion();
					String i = clavier.nextLine();
					System.out.println(this.joueur.utilisePotion(i));
					break;
				case "2":
					this.joueur.afficheArme();
					int j = clavier.nextInt();
					if(this.joueur.changeArme(this.joueur.getInventaire().get(j))) {
						System.out.println("vous changer arme");
					}else {
						System.out.println("na pas pue etre equiper elle neut doit pas etre compatible avec votre class");
					}
					break;
				case "exit":
					return;
				default:
					System.out.println("quelle voulait faire");
			}
		}
		
	}

	private Playeur createPerso() {
		Scanner clavier = new Scanner(System.in);
		Arme main = new Hand("main", 0, 5, 0);
		System.out.println("Bienvenue dans le jeu.");
		System.out.println("elfe : 1, humain : 2, magicien : 3");
		String choix = clavier.nextLine();
		Playeur j = null;
		
		do {
			System.out.println("choisier votre nom :");
			String nom = clavier.nextLine();
			switch(choix) {
				case "1":
					System.out.println("bienvenue jeune elfe " + nom + ".");
					 j = new Elfe(nom, main);
					break;
				case "2":
					System.out.println("bienvenue jeune elfe " + nom + ".");
					 j = new Humain(nom, main);
					 break;
				case "3":
					System.out.println("bienvenue jeune elfe " + nom + ".");
					 j = new Nain(nom, main);
					 break;
				default:
					System.out.println("la class na pas etait choisie.");
			
			}
		}while(j == null);
		
		return j;
	}

	public void combat(){
		Scanner clavier = new Scanner(System.in);
		Monstre m = this.playeurFactory.generateMonteur(this.joueur);
		while(m.getPv() != 0 && this.joueur.getPv() != 0 ){
			System.out.println("monstre lui reste pv: " + m.getPv() + "\n il vous reste " + this.joueur.getPv() +" pv \n");
			
			
			System.out.println("attack normal : 1, attack speciale : 2, utiliser une potion: 3 ");
			String choix = clavier.nextLine();
			switch(choix) {
				case "1":
					this.joueur.degaRecu(m.getDomage());
					m.degaRecu(this.joueur.attack());
					System.out.println("vous attecker normalement");
					break;
				case "2":
					this.joueur.degaRecu(m.getDomage());
					m.degaRecu(this.joueur.attackSpecial());
					System.out.println("vous attacker avec une attacke special");
					break;
				case "3":
					this.joueur.affichePotion();
					System.out.println("vous voulais utiliser un objet");
					break;
				default:
					System.out.println("vous naver pas pris de desion");
					break;
			}
		}
		this.joueur.finCombat(m.getXp(), m.getOr());
		if(m.getPv() == 0) {
			System.out.println("vous aver gagner xp :" + m.getXp()+ " or : "  + m.getOr());
		}else {
			System.out.println("desoler vous avez perdu"); 
		}
	}
	
	public void decouvreMarchant() {
		Scanner clavier = new Scanner(System.in);
		String choix = "";
		while(choix != "exit") {
			System.out.println("1 : affichier se qu'il vend, 2 acheter un objet en lui presisent id, 3 vendre une arme, exit: pour sortire.");
			choix = clavier.nextLine();
			switch(choix) {
				case "1":
					this.marchant.affMarcket();
					break;
				case "2":
					this.acheteItem();
					break;
				case "exit":
					return;
				default:
					System.out.println("vieller saisir quelle chose de comprensible");
			}
		}
	}
	private void acheteItem() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("qu'elle item voulait vous acheter");
		int c = clavier.nextInt();
		Item item = this.marchant.achete(c);
		if(item instanceof Arme) {
			System.out.println("voulais equiper tout de suite oui/non.\n non par defaults");
			String choix = clavier.nextLine();
			if(choix == "oui") {
				if(this.joueur.changeArme(item)) {
					System.out.println("n'a pas pue etre echanger a etait ajouter a votre inventaire");
				}else {
					this.joueur.addItem(item);
				}
			}else {
				this.joueur.addItem(item);
			}
			
		}else {
			System.out.println("a etait ajouter dans votre inventaires");
			this.joueur.achetePotion(item);
		}
		
	}
}
