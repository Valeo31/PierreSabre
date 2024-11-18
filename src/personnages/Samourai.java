package personnages;

public class Samourai extends Humain { 

	private String seigneur;
	
	public Samourai(String nom, String seigneur ,String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
	}

	@Override
	public void boire(String boisson) {
		parler("Qu'est ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
		
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur);
	}
	
}
