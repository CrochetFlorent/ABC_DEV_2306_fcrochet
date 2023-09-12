package Exercice_2;

public class TestDomino {

	public static void main(String[] args) {
		
		Domino dom1 = new Domino(1,2,6);
		Domino dom2 = new Domino(2,3,6);
		Domino dom3 = new Domino(3,5,4);
		
		dom1.affichePoints();
		dom2.affichePoints();
		dom3.affichePoints();
		
		System.out.println(dom1.valeur());
		
		System.out.println(dom1.verifierCouple(dom2));
		System.out.println(dom1.verifierCouple(dom3));

	}

}
