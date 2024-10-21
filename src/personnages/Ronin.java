package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavotite, int argent) {
		super(nom, boissonFavotite, argent);
	}

	public void donner(Commercant beneficiaire) {
		int somme = argent / 10;

		parler(String.format("%s prend ces %d sous.", beneficiaire.getNom(), somme));
		perdreArgent(somme);
		beneficiaire.recevoir(somme);
	}

	public void provoquer(Yakuza adversaire) {
		if (honneur * 2 >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand.");
			parler("Je t'ai eu petit yakuza !");
			int gain = adversaire.perdre();
			honneur++;

			gagnerArgent(gain);
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int perte = getArgent();
			honneur--;
			adversaire.gagner(perte);
		}
	}
}
