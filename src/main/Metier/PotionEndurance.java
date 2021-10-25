package main.Metier;

public class PotionEndurance extends Potion{
	private Integer endurance;
	
	public PotionEndurance(String name, Integer valeur, Integer level,Integer quantiter, Integer endurance) {
		super(name, valeur, level, quantiter);
		this.endurance  = endurance;
	}
	
	public Integer getEndurance() {
		return this.endurance;
	}

	@Override
	public String toAsciiArt() {
		return "      _____\n" +  "    `.___,'\n" + "      (___)\n" + "      <   >" +
		"       ) (\n" + "      /`-.\\ \n" + "     /     \\ \n" +"    / _    _\\ \n" +
				"   :,' `-.' `: \n" + "   |         |\n" + "   :         ;\n" + 
		"    \\       /\n" + "     `.___.'\n"; 
	}

}
