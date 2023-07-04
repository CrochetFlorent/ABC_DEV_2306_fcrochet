package exemple_Modulo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombre;
		int mod;
		int mod2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre entier : ");
		nombre = sc.nextInt();
		mod = nombre%2;
		mod2 = nombre%4;
		
		if(nombre%2 == 0) // si nombre est divisible par 2(reste de la division = 0)
		{
			System.out.println("Le nombre saisi est pair , le reste de la division est : " + mod);
		}
		else
		{
			System.out.println("Le nombre saisi est impair, le reste de la division est : " + mod);
		}
		
		if(nombre%4 == 0) // si nombre est divisible par 4(reste de la division = 0)
		{
			System.out.println("Le nombre saisi est divisible par 4 , le reste de la division est : " + mod2);
		}
		else
		{
			System.out.println("Le nombre saisi n'est pas divisible par 4 , le reste de la division est : " + mod2);
		}

		sc.close();
	}

}
