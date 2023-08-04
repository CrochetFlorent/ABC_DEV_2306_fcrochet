package Pierre_Feuille_Ciseaux_Switch;

import java.util.Random;
import java.util.Scanner;

public class App {

		public static String Pierre_Feuille_Ciseaux()
		{
			int rd;
			String strJeu;
			Random random = new Random();
			rd = random.nextInt(1,3);
			if (rd == 1 )
			{
				strJeu = "Pierre";
			}
			else if(rd == 2)
			{
				strJeu = "Feuille";
			}
			else
			{
				strJeu = "Ciseaux";
			}
			return strJeu;
		}
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			String strOrdi = "",strHumain = "",str;
			int winOrdi=0,winHumain=0;
			
			
			//Prise de points non logique, on passe par tous les cas du switch pour qulques str définie mais il ne
			//faudrait pas
			do {
				strOrdi = Pierre_Feuille_Ciseaux();
				System.out.println("Pierre feuille ou ciseaux?");
				strHumain = sc.next();
				
				System.out.println("L'ordi a choisis "+strOrdi);
				str = strOrdi + strHumain;
				System.out.println(str);
				switch(str)
				{
				case "FeuillePierre" :
					winOrdi = winOrdi +1;
				case "FeuilleCiseaux" :
					winHumain = winHumain +1;
				case "CiseauxPierre" :
					winHumain = winHumain +1;
				case "CiseauxFeuille" :
					winOrdi = winOrdi +1;
				case "PierreCiseaux" :
					winOrdi = winOrdi +1;
				case "PierreFeuille" :
					winHumain = winHumain +1;
				}
				
				System.out.println("L'ordi a "+winOrdi+" points.");
				System.out.println("L'humain a "+winHumain+" points.");
				
			}while (winOrdi != 3 && winHumain !=3);
			
			if (winOrdi == 3)
			{
			System.out.println("Le gagnant est l'ordinateur");
			}
			else if(winHumain == 3)
			{
				System.out.println("Le gagnant est l'humain");
			}
			sc.close();

	}

}
