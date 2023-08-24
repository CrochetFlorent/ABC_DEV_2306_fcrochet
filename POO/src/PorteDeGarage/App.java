package PorteDeGarage;

public class App {

	public static void main(String[] args) {
		
		PorteDeGarage  maPorteDeGarage = new PorteDeGarage(true,false,false,0);
		
		System.out.println("La porte est vérouillee si true: "+maPorteDeGarage.estVerouillee+" et la porte est ouverte entirèrement si true: "+maPorteDeGarage.estOuverte+" et la porte est partiellement ouverte si true: "+maPorteDeGarage.estPartOuverte+" et enfin la porte est ouverte de "+maPorteDeGarage.ouverture+" pourcents.");
		maPorteDeGarage.Deverouiller();
		maPorteDeGarage.OuvrirPart();
		System.out.println("L'ouverture est de : "+maPorteDeGarage.getOuverture());
		maPorteDeGarage.FermerPart();
		maPorteDeGarage.Fermer();
		maPorteDeGarage.Verouiller();
		System.out.println("L'ouverture est de : "+maPorteDeGarage.getOuverture());
		maPorteDeGarage.setOuverture(50);
		System.out.println("Après le set l'ouverture est de : "+maPorteDeGarage.getOuverture());
	}
}
