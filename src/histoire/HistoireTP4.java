package histoire;

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

	public static void main(String[] _) {
		scenario1();
	}
}
