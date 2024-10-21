package personnages;

public class Humain {
	private String nom;
	private String boissonFavotite;
	protected int argent;

	public Humain(String nom, String boissonFavotite, int argent) {
		this.nom = nom;
		this.boissonFavotite = boissonFavotite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		parler(String.format("Bonjour ! Je m'appelle %s et j'aime boire du %s.", nom, boissonFavotite));
	}

	public void boire() {
		parler(String.format("Mmmm, un bon verre de %s ! GLOUPS !", boissonFavotite));
	}

	public void acheter(String bien, int prix) {
		boolean tropCher = prix > argent;
		String phrase = String.format(
				tropCher ? "Je n'ai plus que %d sous en poche. Je ne peux même pas m'offrir %s à %d sous."
				: "J'ai %d sous en poche. Je vais pouvoir m'orir %s à %d sous.",
				argent, bien, prix
		);

		parler(phrase);
		if (!tropCher) {
			perdreArgent(prix);
		}
	}
	protected void parler(String texte) {
		System.out.printf("(%s) - %s\n", nom, texte);
	}

	protected void gagnerArgent(int somme) {
		argent += somme;
	}

	protected void perdreArgent(int somme) {
		argent -= somme;
	}
}
