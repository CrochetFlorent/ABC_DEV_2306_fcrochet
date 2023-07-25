package Exercice_Tableaux_2;

public class App {

	public static void main(String[] args) {
		/*
		 Variables
		 	tab est un tableau d'entiers
		 	voyelles est un tableau de caractères
		 	
		 Debut du programme
		 	Pour i de 0 à 5 faire
		 		tab[i] <-- voyelles[i]
		 	Fin pour
		 Fin du Programme
		 */
		
		//String voyelles;
		char[] tab = new char[6];
		char[] voyelles = new char[] {'a','e','i','o','u','y'};
		
		//voyelles = "aeiouy";
		
		for (int i=0; i<=5; i++)
		{
			tab[i] = voyelles[i];
			//tab[i] = voyelles.charAt(i);
			System.out.println(tab[i]);
		}

	}

}
