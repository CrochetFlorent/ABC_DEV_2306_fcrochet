package Bouteille;

public class App {

	public static void main(String[] args) {
		
		Bouteille maBouteille = new Bouteille(false,false,100,"cristalline");
		System.out.println(maBouteille.Ouvrir());
		System.out.println(maBouteille.RemplirVider());
		System.out.println(maBouteille.Fermer());
	}

}
