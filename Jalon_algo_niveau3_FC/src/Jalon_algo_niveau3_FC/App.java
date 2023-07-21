package Jalon_algo_niveau3_FC;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombre,nombre2,i;
		String saisie;
		boolean fin;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter un nombre de 0 à 10");
			nombre = sc.nextInt();
			
			for (i = 0; i<= 10; i++)
			{
				nombre2 = nombre * i ;
				System.out.println(i+" * "+nombre+" = "+nombre2);
			}
			
			System.out.println("Voulez vous une autre table? o ou O pour oui");
			saisie = sc.next();
			
			if (saisie.equals("o") == true || saisie.equals("O") == true)
			{
				fin = false;
			} 
			else 
			{
				fin = true;
			}
		}while (fin == false);

		sc.close();
		
	}

}
