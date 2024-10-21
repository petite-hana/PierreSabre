package personnages;

public class Ronin extends Humain {
	public Ronin(String nom, String boissonFavotite, int argent) {
		super(nom, boissonFavotite, argent);
	}

	public void donner(Commercant beneficiaire) {
		int somme = argent / 10;

		parler(String.format("%s prend ces %d sous.", beneficiaire.getNom(), somme));
		perdreArgent(somme);
		beneficiaire.recevoir(somme);
	}
}
