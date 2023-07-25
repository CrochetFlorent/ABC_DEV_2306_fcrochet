package Exercice_Tableaux_1;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables
		 	tab est un tableau d'entiers
		 	
		 Début du Programme
		 	Pour i de 0 à 6 faire
		 		tab[i] <--0
		 		Ecrire "La valeur numéro ",i," du tableau vaut",tab[i]
		 	Fin pour
		 Fin du Programme
		 
		 */
			
		int[] tab = new int[7];
		
		for (int i=0;i<=6;i++)
		{
			tab[i] = 0;
			System.out.println("La valeur numéro "+i+" du tableau vaut "+tab[i]);
		}
	}

}
