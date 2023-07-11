package exemple_boucle_for;

public class App {

	public static void main(String[] args) {

		
		/*
		 Exemple boucle for qui compte de 1 à 50
		 
		 Variables 
		 i est un entier
		 
		 Debut du programme
		 Debut boucle for
		 Pour i allant de 1 à 50
		 	ecrire i
		 	suivant i+1
		 fin boucle for
		 fin du programme
		 */

			int i;
			
			// boucle for de 1 à 50
			for(i=1; i<=50; i++)
			{
				System.out.println(i);
			}
			
			// boucle for de 50 à 1
			for(int j=50; j>=1; j--)
			{
				System.out.println(j);
			}
			
			// boucle for de 1 à 50 avec un pas de 2
			for(int k = 0; k<=50;k+=2)
			{
				System.out.println(k);
			}
			
			for(i=20;i<=100;i+=15)
			{
				System.out.println(i);
			}
			
			

	}

}
