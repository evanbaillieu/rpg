package main.Metier;

public class Fusil extends Arme{
	
	private final Integer maxMunition;
	private Integer munition;
	

	public Fusil(String name, Integer valeur, Integer dommage, Integer maxMunition, Integer level) {
		super(name, valeur, dommage, level);
		this.maxMunition = maxMunition;
	}

	@Override
	public String toAsciiArt() {
		// TODO Auto-generated method stub
		return " ,________________________________\n"+
			   " |__________,----------._ [____]  \"\"-,__  __...-----===\"\n"+
			   "         (_(||||||||||||)___________/   \"\"             |\n"+
			   "            `----------'        [ ))\"-,                |\n"+
			   "                                 \"\"    `,  _,--...___  |\n"+
			   "                                         `/          \"\"\"\n";
	}

}
