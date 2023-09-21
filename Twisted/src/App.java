
public class App {

	public static void main(String[] args) {
		
		Twisted jeu = new Twisted("Vert","Rouge","Jaune","Bleu","Orange");
		System.out.println(jeu.getWinners(jeu.Tournament()));
//		for(int i=0;i<jeu.score.length;i++)
//		{
//		System.out.print("\t"+jeu.score[i]);
//		}

	}

}
