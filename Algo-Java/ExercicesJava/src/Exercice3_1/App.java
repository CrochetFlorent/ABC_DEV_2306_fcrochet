package Exercice3_1;

import java.util.Random;
import java.util.Scanner ;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nb;
		int sup;
		int i;
		int base1;
		int base2;
		boolean win;
	
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		nb = random.nextInt(100)+1;
		
		i = 0 ;
		win = false;
		base1 = 0;
		base2 = 100;
		
		System.out.println("Saisir un nombre entier entre 0 et 100"); 
		
		do {
					
			sup = scanner.nextInt();

			if (nb != sup)  {
				//System.out.println(+nb);			
				
				if (sup > nb) {
					System.out.println("Entrer un nombre compris entre : "+sup+" et "+base1);
					base2 = sup;
								}
				else {
					System.out.println("Entrer un nombre compris entre : "+base2+" et "+sup);
					base1 = sup;
					}		
				}
			
				if (nb == sup) {
					win = true;}			
				
				i = i+1; 
						
			}while (win != true);
				
			System.out.println(" Vous avez trouvé en "+i+" essais");

		scanner.close();
		
		}

}
