
public class App {

	public static void main(String[] args) {
		
		Twisted jeu = new Twisted("Vert","Rouge","Jaune","Bleu","Orange");
		System.out.println(jeu.getWinners(jeu.Tournament()));
		System.out.println(jeu.getPrizeValue());
		System.out.println(jeu.getColor());

	}

}
