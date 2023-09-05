package Robot;

public class Test {

	public static void main(String[] args) {
		
		Robot robot1 = new Robot();
		
		//On appuie sur les boutons

		robot1.action(Bouton.ALLUMER);
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.TOURNEADROITE);
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.TOURNEAGAUCHE);
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.AVANCER);
		robot1.action(Bouton.AVANCER);
		

	}

}
