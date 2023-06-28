package Exercice3_1;

import java.util.Random;
import java.util.Scanner ;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nb;
		int sup;
		int i;
		boolean win;
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		nb = random.nextInt(100)+1;
		
		
		i = 0 ;
		win = false;
		while (win != true) {
			
			System.out.println("Saisir un nombre entier entre 0 et 100");	
			sup = scanner.nextInt();
			
		
			if (nb != sup)  {
			
				if (sup > nb) {
					System.out.println("Essayez plus petit");}
				else {
					System.out.println("Essayez plus grand");}
				}
			else {
					System.out.println("Vous avez trouvé en "+i+" Essais");
				}
			
				i = i+1; 
				
			}
			
			win = true;
			
		
		if (win = true) {
			System.out.println(" Vous avez trouvé en "+i+" essais");
		}
		
		scanner.close();
		
		}

}
