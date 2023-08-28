package MonJeu;

public class Test {

	public static void main(String[] args) {
		
		Weapon sword = new Weapon("Excalibur",50);
		System.out.println("Nom de l'epee : "+sword.getDamage()+"\n Ses degats : "+sword.getDamage()); // Excalibur 50
		
		//Creation des boucliers
		Shield hulkBouclier = new Shield(50);
		Shield olafBouclier = new Shield(50);
		Shield zorgBouclier = new Shield(50);
		
		//Creation du premier barbare
		Barbarian hulk = new Barbarian("Hulk", 100, new Weapon("Dagger", 8), new Weapon("Axe", 12),new Shield(50),hulkBouclier.getDefense());
	    System.out.println("Nom: : "+hulk.getName()+", Points de vie: : "+hulk.getHealth()); // Barbarian Hulk *100*, L : Dagger (8), R : Axe (12)
	    System.out.println(" L : "+hulk.getLeftHand().getName()+" ("+hulk.getRightHand().getDamage()+") R : "+hulk.getRightHand().getName()+" ("+hulk.getLeftHand().getDamage()+")");
	    
	    //Creation de deux autres barbares
	    Barbarian olaf = new Barbarian("Olaf", 80, new Weapon("Mace", 5), new Weapon("Pique", 15),new Shield(50),olafBouclier.getDefense());
	    System.out.println(olaf.attack()); // 20
	    Barbarian zorg = new Barbarian("Zorg", 75, new Weapon("Sword", 9), new Weapon("Sword", 9),new Shield(50),zorgBouclier.getDefense());
	    System.out.println(zorg.attack()); // 20
	    
	    //Combat   
	    hulk.fight(olaf);
	    olaf.fight(zorg);
	    
	    System.out.println(new Shield(50).getDefense());
	}

}
