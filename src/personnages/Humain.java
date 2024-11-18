package personnages;



public class Humain {

	public static int NB_MAX_CONNAISSANCES = 3;
	
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[NB_MAX_CONNAISSANCES];
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
		this.nbConnaissance = 0;
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
	
	public void faireConnaissance(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	private void memoriser(Humain humain) {
		memoire[nbConnaissance] = humain;
		nbConnaissance = (nbConnaissance + 1)%NB_MAX_CONNAISSANCES;
	}
	
	public void listerConnaissances() {	
		String s = "";
		for (int i = 0; i<nbConnaissance; i++) {
			s = s + " " + memoire[i].getNom() + ",";
		}
		parler("Je connais beaucoup de monde :"+s);
	}
	
	
}
