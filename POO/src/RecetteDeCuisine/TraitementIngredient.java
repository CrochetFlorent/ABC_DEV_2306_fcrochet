package RecetteDeCuisine;

public class TraitementIngredient{

	private Ingredient ingredient;
	private boolean estDecoupe;
	private boolean estCuit;

	public TraitementIngredient(Ingredient _ingredient,boolean _estDecoupe,boolean _estCuit)
	{
		this.ingredient = _ingredient;
		this.estDecoupe = _estDecoupe;
		this.estCuit = _estCuit;
	}

	//Cuir un aliment
		public boolean cuire(int _temp,Ingredient _ingredient)
		{
			if(!this.estCuit && _temp ==_ingredient.getTempereatureCuisson())
			{
				_ingredient.setEtat("Cuit");
				this.estCuit = true;
				return true;
			}else
			{
				return false;
			}
		}
		
		//Decouper un aliment
		public boolean decouper(Ingredient _ingredient)
		{
			if(!this.estDecoupe)
			{
				_ingredient.setEtat("Découpé");
				this.estDecoupe=true;
				return true;
			}else
			{
				return false;
			}
		}
	
}
