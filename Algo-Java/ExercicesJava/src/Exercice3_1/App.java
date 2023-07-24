package Exercice3_1;

import java.util.Random;
import java.util.Scanner ;


public class App {

	public static void main(String[] args) {

		/*
		 Variables

			Mystere est un entier
			Suppose est un entier
			Trouve	est un booléen
			Tempo1 et Tempo2 sont des entier
			i est un entier
						
		Debut du Programme
		
			Trouve <-- faux
			Suppose <-- Random (1-100)
			Tempo1<--0
			Tempo2<--100			
			
			Faire
				Ecrire " Le nombre est compris entre ",Tempo1," et ",Tempo2
				Lire <-- Suppose
				Si Mystere est égale à Suppose alors
					Trouve <-- vrai
				Sinon 
					Si Suppose est plus grand que Mystere alors
						Tempo2 = mystere
					Sinon (si Mystere est plus grand que Suppose alors)
						Tempo1 = Mystere
					Fin si
				Fin si
		
				i <-- i+1		
			Tant que Trouve est egale à faux
		
			Ecrire "Vous avez réussi en ",i," Essais
		
		Fin du Programme	
		 */
		
		int Mystere;
		int Suppose;
		int i;
		int Tempo1;
		int Tempo2;
		boolean Trouve;
	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		Mystere = random.nextInt(100)+1;
		
		i = 0 ;
		Trouve = false;
		Tempo1 = 0;
		Tempo2 = 100;
				
			do {	
				
				System.out.println(+Mystere);
				if (Tempo1 == Tempo2)
				{
					System.out.println("Entrer :"+Tempo1);
					Suppose = scanner.nextInt();
				}
				else
				{
				System.out.println("Entrer un nombre compris entre : "+Tempo1+" et "+Tempo2);
				Suppose = scanner.nextInt();
				}
				
				if (Suppose == Mystere)
				{
					Trouve = true;
				}				
				else if (Suppose > Mystere) 
				{
					Tempo2 = Suppose-1;
				}
				else 
				{
					Tempo1 = Suppose+1;
				}		
								
				i = i+1; 	
		}while (Trouve == false);
				
		System.out.println(" Vous avez trouvé en "+i+" essais");

		scanner.close();	
		}

}
