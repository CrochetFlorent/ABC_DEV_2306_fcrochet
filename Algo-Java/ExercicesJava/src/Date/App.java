package Date;

import java.util.Scanner;

public class App {
	public static boolean verifValiditeDate(int annee, int mois, int jour)
	{
		boolean estValide;
		boolean cas1, cas2, cas3, cas4, estBissextille;
		
		estBissextille = (annee%4 == 0 && annee%100 != 0) || annee%400 == 0;
		cas1 = (mois == 1 || mois == 3 || mois == 5 || mois == 8 || mois == 10 || mois == 12) && (jour >= 1 && jour <= 31);
		cas2 = (mois == 4 || mois == 6 || mois == 9 || mois == 11) && (jour >= 1 && jour <= 30);
		cas3 = mois == 2 && estBissextille  && jour >= 1 && jour <= 29;
		cas4 = mois == 2 && jour >= 1 && jour <= 28;
		
		if(cas1 || cas2 || cas3 || cas4)
		{
			estValide = true;
		}
		else
		{
			estValide = false;
		}
		
		return estValide;
	}
	
	public static String trouveJourSemaine(int annee, int mois, int jour)
	{
		int jourSemaine;
		String jourDeLaSemaine="";
		
		// cree un objet date au format annee mois jour
		java.time.LocalDate dateLocale = java.time.LocalDate.of(annee, mois, jour);
		
		// permet de recuperer le numéro du jour de la semaine de 1 a 7(1 pour lundi, 2 pour mardi ....)
		jourSemaine = dateLocale.getDayOfWeek().getValue();
		
		// transforme le numéro de jour en mot
		switch(jourSemaine)
		{
			case 1:
			{
				jourDeLaSemaine = "Lundi";
				break;
			}
			case 2:
			{
				jourDeLaSemaine = "Mardi";
				break;
			}
			case 3:
			{
				jourDeLaSemaine = "Mercredi";
				break;
			}
			case 4:
			{
				jourDeLaSemaine = "Jeudi";
				break;
			}
			case 5:
			{
				jourDeLaSemaine = "Vendredi";
				break;
			}
			case 6:
			{
				jourDeLaSemaine = "Samedi";
				break;
			}
			case 7:
			{
				jourDeLaSemaine = "Dimanche";
				break;
			}
		}
		return jourDeLaSemaine;
	}

	public static void main(String[] args) {
		int _annee;
		int _mois;
		int _jour;
		String _jourDeLaSemaine;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le jour ");
		_jour = sc.nextInt();
		System.out.println("Saisir le mois ");
		_mois = sc.nextInt();
		System.out.println("Saisir l'annee ");
		_annee = sc.nextInt();
		
		if(verifValiditeDate(_annee,_mois,_jour))
		{
			_jourDeLaSemaine = trouveJourSemaine(_annee,_mois,_jour);
			System.out.println(_jourDeLaSemaine+" Le "+_jour+" "+_mois+" "+_annee);
		}
		else
		{
			System.out.println("La date saisie n'est pas valide");
		}
		sc.close();
		
	}

}
