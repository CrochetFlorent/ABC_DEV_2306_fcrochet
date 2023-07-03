package Exercice2_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int a;
		boolean val;

		Scanner sc = new Scanner(System.in);
		val = false;
		
		do {
			
		System.out.println(" Quel est votre age?");
		a = sc.nextInt();
		
		if (  a>=0 && a<18 ) {
			System.out.println("Vous êtes mineur.");
			val = true;
		}
		if (a>18) {
			System.out.println("Vous êtes majeurs.");
			val = true;
		}
		if (a<0) {
			System.out.println("Entrez un nouveau nombre");
			
		}
		
		}while(val == false);
		
		sc.close();	

	}

}
