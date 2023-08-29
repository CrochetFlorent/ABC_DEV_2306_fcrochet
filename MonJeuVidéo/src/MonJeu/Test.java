package MonJeu;

public class Test {

	public static void main(String[] args) {
			

		//Creation de trois barbares
		Barbarian hulk = new Barbarian("Hulk", 100, new Weapon("Dagger", 8), new Weapon("Axe", 12));
	    Barbarian olaf = new Barbarian("Olaf", 100, new Weapon("Mace", 5), new Weapon("Pique", 15));
	    Barbarian zorg = new Barbarian("Zorg", 100, new Weapon("Sword", 9), new Weapon("Sword", 9));

	    
	    
	    // Ils ramassent chacuns deux armes/bouclier
	    olaf.ramasseArme();
	    hulk.ramasseArme();
	    zorg.ramasseArme();
	    
	    //test d'affichage
	    System.out.println(hulk);
	    System.out.println(olaf);
	    System.out.println(zorg);
	    
	    //Combat 
	    hulk.fight(olaf);
	    olaf.fight(zorg);
	    zorg.fight(hulk);
	}

}
