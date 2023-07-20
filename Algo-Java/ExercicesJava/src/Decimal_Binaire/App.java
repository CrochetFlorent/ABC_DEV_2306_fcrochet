package Decimal_Binaire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {		
		
		int base10,end;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre entier en base 10 pour le convertir en base 2");
		base10 = sc.nextInt();
		end = base10;
		
		
		while(base10>1)
		{
			if (base10%2 == 0)
			{
				list.add(0);
			}
			else
			{
				list.add(1);
			}
			base10 = base10 / 2 ;
		}
		if (base10%2 != 0)
		{
		list.add(1);
		}
		
		Collections.reverse(list);
		
		System.out.print("La base2 de "+end+" est ");
		
		for (int i=0; i< list.size();i++)
		{
		System.out.print(list.get(i));
		}
	
		sc.close();
	}

}
