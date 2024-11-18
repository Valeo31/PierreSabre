package personnages;

public class Yakuza extends Humain {

	private String clan; 
	private int reputation;
	
	
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = 4;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse!");
		int argentVictime = victime.seFaireExtorquer();
		gagnerArgent(argentVictime);
		reputation++;
		parler("J'ai piqué les " + argentVictime + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + "dans ma poche. Hi! Hi!");
		
	}
	
	public void perdre() {
		reputation--;
		parler("J’ai perdu mon duel et mes "+ getArgent() +" sous, snif... J'ai déshonoré le clan de " + clan);
		this.perdreArgent(getArgent());
		
		
	}
	
	public void gagner(int gain) {
		reputation++;
		this.gagnerArgent(gain);
		parler("Ce ronin pensait vraiment battre "+ getNom() + " du clan de "+ clan + " ? Je l'ai dépouillé de ses "+ gain +" sous.");
	}

	
	public int getReputation() {
		return this.reputation;
	}
	
	
}
