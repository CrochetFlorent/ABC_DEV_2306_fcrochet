package Robot;

public class Test {

	public static void main(String[] args) {
		
		Robot robot1 = new Robot();
		
		//On appuie sur les boutons

		robot1.action(Bouton.ALLUMER);//On allume
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.TOURNEADROITE);//Test tourner à droite
		robot1.action(Bouton.AVANCER); //On regarde si le déplacement à changé d'axe après avoir avancé
		robot1.action(Bouton.TOURNEAGAUCHE);//Test tourner à gauche
		robot1.action(Bouton.TOURNEAGAUCHE);
		robot1.action(Bouton.AVANCER);//On regarde si le déplacement à changé d'axe après avoir avancé
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.RECULER);// On test si le robot recule
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.AVANCER);//On regarde si la butée est atteinte donc si l'abcisse ne change pas
		robot1.action(Bouton.RECULER);// On test si le robot recule
		robot1.action(Bouton.ETEINDRE);//ON éteint
		

	}

}
