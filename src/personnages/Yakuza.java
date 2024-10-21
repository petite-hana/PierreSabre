package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavotite, int argent, String clan) {
		super(nom, boissonFavotite, argent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(String.format("%s, si tu tiens à la vie donne moi ta bourse !", victime.getNom()));

		int gain = victime.seFaireExtorquer();

		reputation++;
		gagnerArgent(gain);

		parler(String.format("J'ai piqué les %d sous de %s, ce qui me fait %d sous dans ma poche. Hi ! Hi !", gain, victime.getNom(), argent));
	}

	public int perdre() {
		parler(String.format("J'ai perdu mon duel et mes %d sous, snif... J'ai déshonoré le clan de %s.", argent, clan));

		int somme = argent;
		perdreArgent(somme);
		return somme;
	}

	public void gagner(int gain) {
		parler(String.format("Ce ronin pensait vraiment battre %s du clan de %s ? Je l'ai dépouillé de ses %d sous", getNom(), clan, gain));
		gagnerArgent(gain);
	}
}
