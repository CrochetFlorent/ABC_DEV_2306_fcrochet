package Exercice_Tableaux_6;

public class App {

	public static void main(String[] args) {
		/*
		 Varibales
		 	tab1 est un tableau de type entier
		 	tab2 est un tableau de type entier
		 	somme est un entier
		 	produit est un entier
		 
		 Debut du programme
		 	somme = 0
		 	 Pour i de 0 à 3 faire
		 	 	Pour j de 0 à 1 faire
		 	 		produit = tab1[i] * tab2[j]
		 	 		somme = somme+produit
		 	 		Si i = 3 alors
		 	 			Ecrire tab1[i]," * ",tab2[j]," = ",somme
		 	 		Sinon 
		 	 			Ecrire tab1[i]," * ",tab2[j]," + "
		 	 		Fin si
		 	 	Fin pour
		 	 Fin pour
		 */

		int[] tab1 = {4,8,7,12};
		int[] tab2 = {3,6};
		int somme,produit;
		
		somme = 0 ;
		
		for (int i=0;i<=1;i++)
		{
			for(int j=0;j<=3;j++)
			{
				produit = tab1[j] * tab2[i];
				somme = somme + produit;
				if (i == 1 && j == 3)
				{
					System.out.print(tab2[i]+" * "+tab1[j]+" = "+somme);
				}
				else
				{
					System.out.print(tab2[i]+" * "+tab1[j]+" + ");
				}
			}
		}
		
	}

}
