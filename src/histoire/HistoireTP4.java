package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

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

	private static void scenario3() {
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Le Clan des Méchants");
		Commercant marco = new Commercant("Marco", 15);

		yaku.direBonjour();
		yaku.extorquer(marco);
	}

	private static void scenario4() {
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Commercant marco = new Commercant("Marco", 15);

		roro.direBonjour();
		roro.donner(marco);
	}

	public static void main(String[] _) {
//		scenario1();
//		scenario2();
//		scenario3();
		scenario4();
	}
}
