package RecetteDeCuisine;

public class Ingredient {
	
	private String nomAliment,etat;
	private int quantite;
	private String unite;
	private boolean estCuit;
	private boolean estDecoupe;
	private int temperatureDeCuisson;
	
	public Ingredient(String _aliment,String _etat,int _quantite,String _unite,int _tempCuisson)
	{
		this.nomAliment = _aliment;
		this.etat = _etat;
		this.quantite = _quantite;
		this.unite = _unite;
		this.temperatureDeCuisson =_tempCuisson;
	}
	
	//Getters
	public String getNomAliment()
	{
		return this.nomAliment;
	}
	public String getEtat()
	{
		return this.etat;
	}
	//Setters
	public void setEtat(String _etat)
	{
		this.etat = this.etat+_etat;
	}
	//Comparer nom aliment et etat de deux Ingrédients
	public boolean comparerIngredientSansQuantite(Ingredient _ingredient)
	{
		if(this.nomAliment.equals(_ingredient.getNomAliment()) && this.etat.equals(_ingredient.getEtat()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Cuir un aliment
	public void cuire(Ingredient _ingredient)
	{
		if(!_ingredient.estCuit)
		{
			_ingredient.setEtat("Cuit"); 
		}
	}
	
	//Decouper un aliment
	public void decouper(Ingredient _ingredient)
	{
		if(!_ingredient.estDecoupe)
		{
			_ingredient.setEtat("Decoupé");
		}
	}
}
