package Robot;

import java.util.Scanner;


public class Telecommande {


	
	public void ControleRobot() {
		
		String choix = "";
		Scanner sc = new Scanner(System.in);
		
		Robot robot1 = new Robot();
		
	
		boolean testAppui = true;
		do {
			System.out.println("Veuillez allumer le robot, appuyez sur a");
			choix = sc.next();
			if (choix.equals("a"))
			{
				robot1.action(Bouton.ALLUMER);
			}
			else
			{
				System.out.println(" Vous n'avez pas allumé le robot.");
			}
		}while(!choix.equals("a"));
		
		do {

			System.out.println("Que voulez vous faire?\nAvancer? tapez e\nTourner à droite? tapez r\nTourner à gauche? tapez t\nArreter le robot? tapez y\nEteindre le robot ? tapez z,\nsinon taper une autre touche");
			choix = sc.next();
			if(choix.equals("z"))
			{
				robot1.action(Bouton.ETEINDRE);
			}else if(choix.equals("e"))
			{
				robot1.action(Bouton.AVANCER);
			}
			else if (choix.equals("r"))
			{
				robot1.action(Bouton.TOURNEADROITE);
			}
			else if (choix.equals("t"))
			{
				robot1.action(Bouton.TOURNEAGAUCHE);
			}
			else if (choix.equals("y"))
			{
				robot1.action(Bouton.ARRETER);
			}
			else
			{
				testAppui = false;
			}
				
		}while (testAppui);
	}
	
	
	
}
