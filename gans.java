public class gans {
   	public static void main(String[] args) {
 	
	Speler speler1 = new Speler();
	speler1.kleur = "blauwe";

	Speler speler2 = new Speler();
	speler2.kleur = "groene";

	speler1.dobbelen(1);
	speler2.dobbelen(2);
   }

}


class Speler {
	String kleur;

	void dobbelen(int ogen){
		System.out.println("De " + kleur + " gans gooit " + ogen);
		lopen(ogen);
	}

	void lopen(int vakje){
		System.out.println("De " + kleur + " gans staat op vakje " + vakje);
	}
}


