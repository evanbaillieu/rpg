package main.phisyque;

import main.Metier.Marchant;

public class MarchantFactory {
		private ItemFactory itemFactory = null;
		private Marchant marchant;
		
		public MarchantFactory() {
			PhisyqueFactory pf = new PhisyqueFactory();
			this.itemFactory = pf.getItemFactory();
			this.marchant = new Marchant("marchant vagabon",2000,0, 0, this.itemFactory.findAll());
		}
		
		public Marchant getMarchant() {
			return this.marchant;
		}
		
		

}