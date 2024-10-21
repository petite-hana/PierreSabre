package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	private static void scenario1() {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
	}

	private static void scenario2() {
		Commercant marco = new Commercant("Marco", 100);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}

	public static void main(String[] _) {
		scenario1();
		scenario2();
	}
}
