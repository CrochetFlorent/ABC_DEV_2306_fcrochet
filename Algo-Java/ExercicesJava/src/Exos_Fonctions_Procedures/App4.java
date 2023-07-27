package Exos_Fonctions_Procedures;

import java.util.Scanner;

public class App4 {
	
	
		/*Est Bissextile (annee%400 == 0 || (annee%100 != 0 && annee%4 == 0))
		
			Booleen Fonction estBissextile(VAL annee,VAR estBissextile)
				Si annee est divisible par 400 ou pas par 100 et par 4 alors
					estBissextile <-- vrai
				Sinon 
					est Bissextile <-- faux
				Fin si
				Retourne estBissextile
			Fin Fonction
		*/
		
		public static String estBissextile(int annee)
		{
			String strAnnee;
			
			if(annee%400 == 0 || (annee%100 != 0 && annee%4 == 0))
			{
				strAnnee = "L'année est bissextile";
			}
			else
			{
				strAnnee = "L'année n'est pas bissextile";
			}
		return strAnnee;
		}
		

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Quatrième fonction
		int annee;		
		System.out.println("Entrer une annee");
		annee = sc.nextInt();		
		System.out.println(estBissextile(annee));
		
		sc.close();
		}
}
