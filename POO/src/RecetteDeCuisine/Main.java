package RecetteDeCuisine;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Ingredient> IngredientsChouxCroute = new ArrayList<Ingredient>();
		Plat choucroute = new Plat("Choucroute",IngredientsChouxCroute);
		choucroute.ajouterIngredient("Choucroute","Cuite",500,"Grammes",60);
		choucroute.ajouterIngredient("Lard","Cuit et Entier",150,"Grammes",60);
		choucroute.ajouterIngredient("Saucisse","Cuite et Entières",2,"",60);
		for (int i=0;i<choucroute.getIngredients().size();i++)
		{
			choucroute.getIngredients().get(i).
			//Impossible de trouver les getters de mes ingrédients pourpour les cuir ou decouper
			//Problème à choucroute.getIngredients.get(i).   car après ce point aucun getter proposé
		}
	}

}
