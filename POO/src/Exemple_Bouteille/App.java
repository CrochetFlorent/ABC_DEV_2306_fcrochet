package Exemple_Bouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille cristaline = new Bouteille("Cristaline",1.25,1.5,true);
		
		cristaline.ouvrirProcedure();
		boolean test1 = cristaline.fermer();
		boolean test2 = cristaline.ouvrir();
		boolean test3 = cristaline.fermer();

	}

}
