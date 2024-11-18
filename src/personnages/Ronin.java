package personnages;

public class Ronin extends Humain{

	private int honneur;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		this.parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
		perdreArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		if(this.honneur*2 >= adversaire.getReputation()) {
			gagnerArgent(adversaire.getArgent());
			honneur++;
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int gain = getArgent();
			perdreArgent(gain);
			adversaire.gagner(gain);
		}
	}
	
}
