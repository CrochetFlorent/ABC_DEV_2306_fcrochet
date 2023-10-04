package RecetteDeCuisine;

import java.util.ArrayList;

public class Plat {

	private String nomPlat;
	private ArrayList<Ingredient> listeIngredients = new ArrayList<Ingredient>();
	
	@SuppressWarnings("unchecked")
	public Plat(String _nomPlat,ArrayList<Ingredient> _ingredients)
	{
		this.nomPlat = _nomPlat;
		this.listeIngredients = _ingredients;
	}
	
	//Setters
	public String getNomPlat()
	{
		return nomPlat;
	}
	@SuppressWarnings("rawtypes")
	public ArrayList getIngredients()
	{
		return this.listeIngredients;
	}
	
	//Getters
	public void setNomPlat(String _nomPlat)
	{
		this.nomPlat = _nomPlat;
	}
	@SuppressWarnings("unchecked")
	public void setIngredients(@SuppressWarnings("rawtypes") ArrayList _ingredients)
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
				for(int j=0;i<_plat.getIngredients().size();j++)
				{
					if(this.comparerDeuxPlats(_plat))
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
