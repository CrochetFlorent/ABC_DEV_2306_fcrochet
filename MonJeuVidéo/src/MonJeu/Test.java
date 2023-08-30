package MonJeu;

public class Test {

	public static void main(String[] args) {
			

		//Creation de trois barbares
		Barbarian hulk = new Barbarian("Hulk", 50, new Weapon("Dagger", 8), new Weapon("Axe", 12),5,new Armor(20,"Heavy","Armure1"));
	    Barbarian olaf = new Barbarian("Olaf", 50, new Weapon("Mace", 5), new Weapon("Pique", 15),5,new Armor(20,"Heavy","Armure1"));
	    Barbarian zorg = new Barbarian("Zorg", 50, new Weapon("Sword", 9), new Weapon("Sword", 9),5,new Armor(20,"Heavy","Armure1"));

	    // Ils ramassent chacuns deux armes/bouclier et armure
	    olaf.ramasseArme();
	    olaf.ramasseArmure();
	    
	    hulk.ramasseArme();
	    hulk.ramasseArmure();
	    
	    zorg.ramasseArme();
	    zorg.ramasseArmure();
	    
	    //test d'affichage
	    //System.out.println(hulk);
	    //System.out.println(olaf);
	    //System.out.println(zorg);
	    
	    //Combat 
	    hulk.fight(olaf);
	    olaf.fight(zorg);
	    zorg.fight(hulk);
	}

}
