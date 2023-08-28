package Exemple_Bouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille maBouteille = new Bouteille("Cristalline",1.25,1.5,true);
		
		maBouteille.remplir(0.25);
		System.out.println("La contenance est de : "+maBouteille.getContenanceEnL());
		maBouteille.viderTout();
		maBouteille.setContenanceEnL(0.5);
		System.out.println("La contenance est de : "+maBouteille.getContenanceEnL());	
	}
}
