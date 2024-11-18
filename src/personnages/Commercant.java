package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}

	public int seFaireExtorquer() {
		int argent = getArgent();
		perdreArgent(argent);
		parler("Le monde est vraiment trop injuste");
		return argent;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}
	
}
