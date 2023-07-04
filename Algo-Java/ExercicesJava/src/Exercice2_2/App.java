package Exercice2_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int a;
		int	b;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrer une nombre entier");
		a = sc.nextInt();
		System.out.println("Entrez un deuxième nombre entier");
		b = sc.nextInt();
		
		if (a>b){
			System.out.println(b+" est plus petit que "+a);	
		}else if (b>a)
		{
			System.out.println(a+" est plus petit que "+b);
		}
		
		sc.close();
		
	}

}
