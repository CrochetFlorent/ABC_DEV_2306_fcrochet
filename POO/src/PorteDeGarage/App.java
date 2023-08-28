package PorteDeGarage;

public class App {

	public static void main(String[] args) {
		
		PorteDeGarage  maPorteDeGarage = new PorteDeGarage(true,false,false,0);
		
		maPorteDeGarage.Deverouiller();
		maPorteDeGarage.OuvrirPart(25);
		maPorteDeGarage.FermerPart(15);
		maPorteDeGarage.Fermer();
		maPorteDeGarage.Verouiller();
		maPorteDeGarage.setOuverture(50);
		System.out.println("Ouverture : "+maPorteDeGarage.ouverture);
	}
}
