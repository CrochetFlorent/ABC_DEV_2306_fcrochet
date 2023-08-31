package MonJeu;

public class Test {

	public static void main(String[] args) {
			

		//Creation de trois barbares
		Barbarian hulk = new Barbarian("Hulk",50,null,null,5,null,0,0,1,false);
	    Barbarian olaf = new Barbarian("Olaf",50,null,null,5,null,0,0,1,false);
	    Barbarian zorg = new Barbarian("Zorg",50,null,null,5,null,0,0,1,false);

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
	    
	    //Combats 
	    // Apparement losqu'il y a égalité un des barbare prend deux niveaux 
	    while (hulk.getLevel()<=3 && olaf.getLevel()<=3 && zorg.getLevel()<=3)
	    {    	
		    hulk.fight(olaf);
		    olaf.fight(zorg);
		    zorg.fight(hulk);
	    
	    }
	}

}
