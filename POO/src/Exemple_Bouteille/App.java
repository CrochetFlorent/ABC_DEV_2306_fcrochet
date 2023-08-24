package Exemple_Bouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille cristaline = new Bouteille("Cristaline",1.25,1.5,true);
		
		cristaline.remplir();
		System.out.println("La contenance est de : "+cristaline.getContenanceEnL());
		cristaline.viderTout();
		cristaline.setContenanceEnL(0.5);
		System.out.println("La contenance est de : "+cristaline.getContenanceEnL());	
	}
}
