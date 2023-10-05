package RecetteDeCuisine;

import java.util.ArrayList;

public class Plat{

	private String nomPlat;
	private ArrayList<Ingredient> listeIngredients = new ArrayList<Ingredient>();
	
	public Plat(String _nomPlat)
	{
		this.nomPlat = _nomPlat;
		this.listeIngredients = new ArrayList<Ingredient>();
	}
	
	//Setters
	public String getNomPlat()
	{
		return nomPlat;
	}
	public ArrayList getIngredients()
	{
		return this.listeIngredients;
	}
	
	//Getters
	public void setNomPlat(String _nomPlat)
	{
		this.nomPlat = _nomPlat;
	}
	public void setIngredients(ArrayList _ingredients)
	{
		this.listeIngredients =_ingredients;
	}
	
	public void ajouterIngredient(String _aliment,String _etat,int _quantite,String _unite,int _tempCuisson)
	{
		Ingredient _Ingredient = new Ingredient(_aliment,_etat,_quantite,_unite,_tempCuisson);
		this.listeIngredients.add(_Ingredient);
	}
	
	//Comparer deux plats
	public boolean comparerDeuxPlats(Plat _plat)
	{
		int test =0;
		if(this.getIngredients().size() == _plat.getIngredients().size())
		{
			for (int i=0;i<_plat.getIngredients().size();i++)
			{
				for(int j=0;j<_plat.getIngredients().size();j++)
				{
					Ingredient temp1 = (Ingredient) this.getIngredients().get(j);
					Ingredient temp2 = (Ingredient) _plat.getIngredients().get(j);
					if(temp1==temp2)
					{
						test+=1;
					}
				}
			}
			if(this.getIngredients().size()==test)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
	}
}
