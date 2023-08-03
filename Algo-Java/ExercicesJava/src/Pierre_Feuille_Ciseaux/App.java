package Pierre_Feuille_Ciseaux;

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
		
		String strOrdi,strHumain;
		int winOrdi=0,winHumain=0;

		
		
		do {
			strOrdi = Pierre_Feuille_Ciseaux();
			System.out.println("Pierre feuille ou ciseaux?");
			strHumain = sc.next();
			
			System.out.println("L'ordi a choisis "+strOrdi);
			
			if (strOrdi.equals("Pierre") && strHumain.equals("Feuille"))
			{
				winHumain = winHumain +1;

			}
			else if (strOrdi.equals("Feuille") && strHumain.equals("Ciseaux"))
			{
				winHumain = winHumain + 1;

			}
			else if (strOrdi.equals("Ciseaux") && strHumain.equals("Pierre"))
			{
				winHumain = winHumain + 1; 

			}
			else if(strHumain.equals("Pierre") && strOrdi.equals("Feuille"))
			{
				winOrdi = winOrdi + 1;

			}
			else if(strHumain.equals("Feuille") && strOrdi.equals("Ciseaux"))
			{
				winOrdi = winOrdi +1;

			}
			else if (strHumain.equals("Ciseaux") && strOrdi.equals("Pierre"))
			{
				winOrdi = winOrdi +1;
				
			}
			
			System.out.println("L'ordi a "+winOrdi+" points.");
			System.out.println("L'humain a "+winHumain+" points.");
		}while (winOrdi != 3 && winHumain !=3);
		
		if (winOrdi == 3)
		{
		System.out.println("Le gagnant est l'ordinateur");
		}
		else if(winHumain ==3)
		{
			System.out.println("Le gagnant est l'humain");
		}
		sc.close();
	}

}
