package personnages;

public class Humain {

	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoissonFavorite() {
		return boissonFavorite;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boissonFavorite + " ! GLOUPS !");
		
	}
	
	public void acheter(String bien, int prix) {
		if (argent > prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	
	
	
	public void parler(String speech) {
		System.out.println("("+this.nom+") - " + speech);
	}
	
	
}
