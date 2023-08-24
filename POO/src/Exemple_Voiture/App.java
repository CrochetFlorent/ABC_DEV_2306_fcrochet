package Exemple_Voiture;

public class App {

	public static void main(String[] args) {
		
		Voiture maVoiture = new Voiture();
		
		maVoiture.Afficher();
		maVoiture.setMarque("Chevrolet");
		maVoiture.setPrix(20000);
		maVoiture.Afficher();

	}

}
