package Decimal_Binaire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		/*
		Variables 
			 base10 est un entier
			 base2 est un entier
			 i est un entier
			 taille est un entier
			 tab est un tableau
			 
		Debut du Programme
		  	Ecrire "Entrer un nombre en base10 pour le convertir en base2"
		  	Lire base10
		  	i = 0;
		  	
		  	Tant que base10%2 == 0 et que base10 > 1 faire
		  		if base10%2 == 0 alors
		  			tab[i] = 0
		  		else
		  			tabt[i] = 1
		  		fin si
		  		i = i+1
		  	Fin tant que
		  	
		  		 
		 
		 */
		
		
		int base10,taille = 0,i=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre entier en base 10 pour le convertir en base 2");
		base10 = sc.nextInt();
		
		while(base10>1)
		{
			if (base10%2 == 0)
			{
				list.add(0);
				taille = taille+1;
			}
			else
			{
				list.add(1);
				taille = taille+1;
			}
			i++;
		};
		
		if (base10%2 == 0)
		{
			list.add(0);
			taille = taille+1;
		}
		else if (base10%2 !=0)
		{
			list.add(1);
			taille = taille+1;
		}
		
		Collections.reverse(list);
		
		for (i=0; i< list.size();i++)
		{
		System.out.println(list.get(i));
		}
	
		sc.close();
	}

}
