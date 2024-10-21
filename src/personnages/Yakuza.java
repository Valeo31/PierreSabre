package personnages;

public class Yakuza extends Humain {

	private String clan; 
	private int reputation;
	
	
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse!");
		int argentVictime = victime.seFaireExtorquer();
		gagnerArgent(argentVictime);
		reputation++;
		parler("J'ai piqu� les " + argentVictime + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + "dans ma poche. Hi! Hi!");
		
	}

	
	
}
