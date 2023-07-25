package Exercice_Tableaux_5;

public class App {

	public static void main(String[] args) {
	
		/*
		 Variables
		 	tab1 est un tableau d'entiers
		 	tab2 est un tableau d'entiers
		 	tab3 est un tableau d'entiers
		 	
		 Debut du Programme
		 	
		 	Pour i de 0 à 7 faire
		 		tab3[i] = tab2[i] + tab1[i]
		 		Ecrire tab3[i]," = ",tab2[i]," + ",tab1[i]
		 	Fin pour
		 	
		 Fin du Programme
		 	
		 */
		int[] tab1 = new int[] {4,8,7,9,1,5,4,6};
		int[] tab2 = new int[] {7,6,5,2,1,3,7,4};
		int[] tab3 = new int[8];
		
		for (int i = 0; i < 8; i++)
		{
			tab3[i] = tab2[i] + tab1[i];
			System.out.println(tab3[i]+" = "+tab2[i]+" + "+tab1[i]);
		}
	}
	
}
