package RecetteDeCuisine;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Plat choucroute = new Plat("Choucroute");
		choucroute.ajouterIngredient("Choucroute","Cuite",500,"Grammes",60);
		choucroute.ajouterIngredient("Lard","Cuit et Entier",150,"Grammes",60);
		choucroute.ajouterIngredient("Saucisse","Cuite et Entières",2,"",60);
		for (int i=0;i<choucroute.getIngredients().size();i++)
		{
			Ingredient temp = (Ingredient) choucroute.getIngredients().get(i);

			if(temp.getNomAliment().equals("Choucroute"))
			{
				TraitementIngredient cuisiner = new TraitementIngredient(temp,false,true);
				cuisiner.cuire(60, temp);
				cuisiner.decouper(temp);
			}
			else if (temp.getNomAliment().equals("Lard"))
			{
				TraitementIngredient cuisiner = new TraitementIngredient(temp,false,true);
				cuisiner.cuire(60, temp);
				cuisiner.decouper(temp);
			}else
			{
				TraitementIngredient cuisiner = new TraitementIngredient(temp,false,true);
				cuisiner.cuire(60, temp);
				cuisiner.decouper(temp);
			}
		}
	}

}
