
public class Algue {

	private boolean estVivant;
	private int pv;
	
	//Constructeur par défaut
	public Algue()
	{
		this.estVivant = true;
		this.pv =10;
	}
	//Getters
	public boolean getVie()
	{
		return this.estVivant;
	}
	public int getPV()
	{
		return this.pv;
	}
	//Setters
	public void setVie(boolean _estVivant)
	{
		this.estVivant = _estVivant;
	}
	public void setPV(int _pv)
	{
		this.pv =_pv;
	}
	public void grandir()
	{
		this.pv = this.pv+1;
	}
}
