package Exemple_Ville;

public class App {

	public static void main(String[] args) {
		
		Ville ville = new Ville();
		Ville ville1 = new Ville("Marseille", 870321, "France");
		Ville ville2 = new Ville("Mulhouse" , 108038, "France");
		
		System.out.println("\n ville = "+ville.getNomVille()+" ville de "+ville.getNbHabitants()+" habitants se situant en "+ville.getNomPays());
		System.out.println("\n ville = "+ville1.getNomVille()+" ville de "+ville1.getNbHabitants()+" habitants se situant en "+ville1.getNomPays());
		System.out.println("\n ville = "+ville2.getNomVille()+" ville de "+ville2.getNbHabitants()+" habitants se situant en "+ville2.getNomPays());
		
	}

}
