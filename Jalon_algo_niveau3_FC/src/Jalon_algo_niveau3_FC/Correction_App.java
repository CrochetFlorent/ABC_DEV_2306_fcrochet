package Jalon_algo_niveau3_FC;

import java.util.Scanner;

public class Correction_App {

	public static void main(String[] args) {
		/*
		Variables
			i est un entier
			nombre est un entier
			resultat est un entier
			fermeture_prog est un booleen
			saisie_utilisateur est une chaine de caractere
			saisieValide est un booleen
		Debut de programme
			Debut faire tant que
				Faire
				Ecrire "Saisir un nombre de 1 à 10"
				Lire nombre
			debut si
				si nombre >= 1 ET <= 10
				saisieValide <-- vrai
			Debut pour
				pour i allant de 0 à 10
				resultat <-- i * nombre
				Ecrire i," * ",nombre," = ",resultat
			Fin pour
				debut faire tant que
					faire
					Ecrire "Souhaitez vous afficher une autre table ? Oui(O) ou Non(N)"
					Lire saisie_utilisateur
				Debut Si
					Si saisie_utilisateur egale "N"
					Alors fermeture_prog = vrai
					saisieValide = vrai
					Sinon Si saisie_utilisateur egale "O"
					Alors fermeture_prog = faux
					saisieValide = vrai
					Sinon saisieValide = faux
				Fin Si
					tant que saisieValide est faux
				fin faire tant que
			fin si
				tant que fermeture_prog est faux
			fin faire tant que
		fin du programme
			 */

		int i;
		int nombre;
		int resultat;
		boolean fermeture_prog = false;
		String saisie_utilisateur;
		boolean saisieValide;
		
		Scanner clavier = new Scanner(System.in);
		do
		{
			System.out.println("Saisir un nombre de 1 à 10");
			nombre = clavier.nextInt();
			if(nombre >= 1 && nombre <= 10)
			{
				saisieValide = true;
				for(i = 0;i <= 10;i++)
				{
					resultat = i * nombre;
					System.out.println(i+" * "+nombre+" = "+resultat);
				}
				do
				{
					System.out.println("Souhaitez vous afficher une autre table ? Oui(O) ou Non(N)");
					saisie_utilisateur = clavier.next();
					if(saisie_utilisateur.equals("N"))
					{
						fermeture_prog = true;
						saisieValide = true;
					}
					else if(saisie_utilisateur.equals("O"))
					{
						fermeture_prog = false;
						saisieValide = true;
					}
					else
					{
						System.out.println("Saisie invalide");
						saisieValide = false;
					}
				}while(!saisieValide);
			}
			
		}while(!fermeture_prog);
		
		clavier.close();
	}

}
