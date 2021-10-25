package main.Metier;

public abstract class Potion extends Item{
	
	public Integer quantiter;
	
	public Potion(String name, Integer valeur, Integer level, Integer quantiter) {
		super(name, valeur, level);
		this.quantiter = quantiter;
	}
	
	public void utilise() {
		this.quantiter--;
	}
	
	public Integer getQuantiter(){
		return this.quantiter;
	}
	
	public void addQuantiter(int quantiter) {
		this.quantiter += quantiter;
	}
	@Override
	public abstract String toAsciiArt();

}
