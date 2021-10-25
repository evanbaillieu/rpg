package main.Metier;

public class PotionSoin extends Potion{
	
	private Integer soin;

	public PotionSoin(String name, Integer valeur,Integer level, Integer quantiter, Integer soin) {
		super(name, valeur, level, quantiter);
		this.soin = soin;
	}
	
	public Integer getSoin() {
		return this.soin;
	}

	@Override
	public String toAsciiArt() {
		return "   (-) \n" + " .-'-'-.\n" + " |-...-|\n" + " |;:.._|\n" + " `-...-'\n";
	}	
	
}
