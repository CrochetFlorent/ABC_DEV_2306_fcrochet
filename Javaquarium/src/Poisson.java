import java.util.Random;

public class Poisson {

	protected String nom;
	protected String sexe;
	
	public Poisson()
	{
		this.nom="Un poisson Lambda";
		Random rdSexe = new Random();
		int sexe = rdSexe.nextInt(2);
		if(sexe==0){this.sexe = "Male";}
		else {this.sexe = "Femelle";}		
	}

	public Poisson(String _nom,String _sexe)
	{
		this.nom = _nom;
		this.sexe = _sexe;
	}
	
}
