package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return argent;
	}

	public void recevoir(int argent) {
		parler(String.format("%d sous ! Je te remercie généreux donateur !", argent));
		gagnerArgent(argent);
	}
}
