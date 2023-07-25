package Exercice_Tableaux_4;


public class App {

	public static void main(String[] args) {
		/*
		  Variables
		  		tab est un tableau de valeurs 1,2,3,4,5
		  		somme est un entier
		  	
		  Debut du Programme
		  		somme = 0
		  			
		  		Pour i de 0 à 4 faire
		  			somme = somme + i
		  		Fin pour
		  		 Ecrire "La somme des valeurs du tableau est de ",somme
		  Fin du programme
		  */
		
		  int somme;
		  int[] tab = new int[] {1,2,3,4,5};

		  somme  = 0;
		  
		  for (int i = 0;i < 5;i++)
		  {
			 somme = somme + tab[i]; 
			 System.out.println("La somme des valeur du tableau à l'indice "+i+" vaut "+somme);
		  }
	}

}
