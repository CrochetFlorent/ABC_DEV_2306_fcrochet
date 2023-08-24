package geometry;

public class TestCercle {

	public static void main(String[] args) {
		
		
		Point monPoint = new Point(4,4);
		Cercle monCercle = new Cercle(monPoint,10);
		
		Point testPoint1 = new Point(2,2);
		Point testPoint2 = new Point(45,45);
		
		monCercle.Surface();
		monCercle.Perimetre();
		monCercle.testAppartenance(testPoint1);
		monCercle.testAppartenance(testPoint2);
		System.out.println("La surface du cercle est de : "+monCercle.surface+" et son perimetre est de : "+monCercle.perimetre);
		

	}

}
