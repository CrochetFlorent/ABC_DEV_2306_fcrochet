package exemple_boucle_while;

public class App {

	public static void main(String[] args) {

	int compteur = 0;
		
		while(compteur <= 50)
		{
			System.out.print(compteur+ " ");
			compteur += 1;
		}
		
		compteur = 0;
		do
		{
			System.out.print(compteur+ " ");
			compteur ++;
		}
		while(compteur <= 50);

	}

}
