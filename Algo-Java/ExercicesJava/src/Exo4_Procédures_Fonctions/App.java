package Exo4_Procédures_Fonctions;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static boolean RNG()
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int nbOrdi,nbAlea;
		boolean juste;
		
		nbAlea = random.nextInt(100)+1;
		System.out.println(nbAlea);
		nbOrdi = random.nextInt(100)+1;
		
		if (nbOrdi == nbAlea)
		{
			juste = true;
		}
		else 
		{
			juste = false;
		}
		
		return juste;
	}
	public static void main(String[] args) {
		
		// Cette version part du principe que les eux joueurs cherchent un nombre différent, la fonction déclarée
		//plus haut ne traite que le cas de l'ordinateur
		
		int Mystere;
		int Suppose;
		int i;
		int Tempo1;
		int Tempo2;
		boolean trouveOrdi,trouveHumain;
	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		Mystere = random.nextInt(100)+1;
		
		i = 0 ;
		trouveHumain = false;
		Tempo1 = 0;
		Tempo2 = 100;
		
		
			do {	
				
				trouveOrdi = RNG();
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
					trouveHumain = true;
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
				
		}while (trouveHumain == false || trouveOrdi == false);
		
		if (trouveOrdi)
		{
			System.out.println(" L'ordinateur à trouvé en "+i+" essais");
		}
		else if (trouveHumain)
		{
			System.out.println("Vous avez trouvé en "+i+" essais");
		}

		scanner.close();	
	}

}
