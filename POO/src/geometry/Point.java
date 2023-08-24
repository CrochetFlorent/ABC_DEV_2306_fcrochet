package geometry;

import java.util.Scanner;

public class Point {

	double abscisse,ordonnee;
	
	Scanner sc = new Scanner(System.in);
	
	public Point(int _abscisse,int _ordonnee)
	{
		abscisse = _abscisse;
		ordonnee = _ordonnee;
	}
	public Point() 
	{
		System.out.println("Entrez un abscisse pour un point :");
		abscisse = sc.nextInt();
		System.out.println("Entrez une ordonnee pour un point :");
		ordonnee= sc.nextInt();
	}
}
