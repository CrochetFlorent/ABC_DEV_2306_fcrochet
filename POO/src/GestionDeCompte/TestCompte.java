package GestionDeCompte;

public class TestCompte {

	public static void main(String[] args) {
		
		Compte monCompte = new Compte(2000);
		
		monCompte.Deposer(1000);
		monCompte.Retirer(2000);		
	}

}
