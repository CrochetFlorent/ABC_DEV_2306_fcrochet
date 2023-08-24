package geometry;

import java.util.Scanner;

public class TestCercle {

	public static void main(String[] args) {
		
		Point monPoint = new Point(4,4);
		Cercle monCercle = new Cercle(monPoint,10);
		
		monCercle.Afficher();		
		monCercle.testAppartenance();

	}

}
