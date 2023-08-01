package Exo4_Procédures_Fonctions_v2;

import java.util.Random;
import java.util.Scanner;

public class App {

	//Cette fonction génère un nombre entre deux variables : une minimum et une maximum
	public static int randomNb(int a,int b)
	{
		Random random = new Random();
		int nbAlea;
		
		nbAlea = random.nextInt(a,b);
		
		return nbAlea;
		
	}
	
	public static void main(String[] args) {
		
	
		// Cette version partira du principe que les deux joueurs cherchent le même nombre
	
		String rejouer;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			int i = 0,minOrdi=0,maxOrdi=100,minHumain = 0, maxHumain = 100;
			String gagnant = "";
			int mystere,supHumain,supOrdi = 0;
			boolean win = false;
			mystere = randomNb(1,100);
			//System.out.println("Nombre cherché: "+mystere);
			supOrdi = randomNb(minOrdi,maxOrdi);
			do
			{
				if (supOrdi > mystere)
				{
					supOrdi = randomNb(minOrdi,maxOrdi-1);
				}
				else if (supOrdi < mystere)
				{
				 supOrdi = randomNb(minOrdi+1,maxOrdi);
				}	
				System.out.println("Entrer une valeur entre "+minHumain+" et "+maxHumain+".");
				supHumain =sc.nextInt();
				System.out.println("Nombre supposé par l'ordi "+supOrdi+".");	
				if (supHumain == mystere)
				{
					win = true;
					gagnant = "humain";	
				}
				else if (supHumain > mystere) 
				{	
					maxHumain = supHumain;			
				}
				else 
				{
					minHumain = supHumain;	
				}
				if  (supOrdi == mystere )
				{
					win = true;
					gagnant = "l'ordinateur";
				}
				else if (supOrdi > mystere)
				{	
					maxOrdi = supOrdi;
					System.out.println("L'ordinateur a supposé "+supOrdi+". Il doit trouver entre "
							+minOrdi+" et "+maxOrdi+".");
				}
				else
				{
					minOrdi = supOrdi;
					if (win = false)
					{
						System.out.println("L'ordinateur a supposé "+supOrdi+". Il doit trouver entre "
							+minOrdi+" et "+maxOrdi+".");
					}else
					{
						System.out.println("L'ordinateur a supposé "+supOrdi+". Il devait trouver entre "
								+minOrdi+" et "+maxOrdi+".");
					}
				}
				i++;	
			}while (win == false);
			if (supHumain == mystere && supOrdi == mystere )
			{
				System.out.println("Les deux ont trouvé en "+i+" essais.");
			}else
			{
				System.out.println("Le gagnant est "+gagnant+" avec "+i+" essais.");
			}
			
			System.out.println("Voulez vous rejouer? o pour oui, n'importe qelle autre touche pour non");
			rejouer = sc.next();
		}while(rejouer.equals("o"));
		sc.close();
	}
}
