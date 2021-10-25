package main.phisyque;

public class PhisyqueFactory {
	
	public PhisyqueFactory() {
		
	}
	
	private static ItemFactory itemFactory = null;
	public ItemFactory getItemFactory() {
		if(this.itemFactory == null) {
			this.itemFactory = new ItemFactory();
		}
		return this.itemFactory;
	}
	
	private static MarchantFactory marchantFactory = null;
	public MarchantFactory getMarchantFactory() {
		if(this.marchantFactory == null) {
			this.marchantFactory = new MarchantFactory();
		}
		return this.marchantFactory;
	}
	
	private static PlayeurFactory playeurFactory = null;
	public  PlayeurFactory getPlayeurFactory() {
		if(this.playeurFactory == null) {
			this.playeurFactory = new PlayeurFactory();
		}
		return this.playeurFactory;
	}
	
}
