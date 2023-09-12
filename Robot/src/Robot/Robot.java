package Robot;
enum Bouton{
	ALLUMER,ETEINDRE,AVANCERVITE,AVANCERDOUCEMENT,TOURNEADROITE,TOURNEAGAUCHE
}
enum Direction{
	GAUCHE,DROITE,HAUT,BAS
}

public class Robot {

	private boolean estAllume;
	private boolean seDeplace;
	private Point position;
	private Direction direction;
	private Quadrillage quadrillage;
	private int vitesse;

	/**
	 * Constructeur sans paramètres
	 */
	public Robot()
	{
		estAllume = false;
		seDeplace = false;
		position = new Point(0,0);
		direction = Direction.HAUT;
		vitesse = 0;
		quadrillage = new Quadrillage(5,-5,5,-5);
	}
	/** Constructeur avec paramètres
	 * 
	 * @param _estAllume
	 * @param _estEnMarche
	 * @param _position
	 * @param _direction
	 * @param _vitesse
	 * @param _quadrillage
	 */
	public Robot(boolean _estAllume,boolean _estEnMarche,Point _position,Direction _direction,int _vitesse,Quadrillage _quadrillage)
	{
		estAllume = _estAllume;
		seDeplace = _estEnMarche;

		position = _position;
		direction = _direction;
		vitesse = _vitesse;
		quadrillage = _quadrillage;
	}
	/**
	 * Getter vitesse
	 * @return
	 */
	public int getVitesse()
	{
		return this.vitesse;
	}
	/**
	 * Cette méthode allume le robot (en appuyant sur le bouton "allumer"==> ALLUMER dans action()).
	 * @return
	 */
	private boolean allumer()
	{
		if (!estAllume){
			estAllume =true;
			System.out.println("Le robot s'est allume.");
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * Cette méthode eteint le robot (en appuyant sur le bouton "éteindre" ==> ETEINDRE dans action()).
	 * @return
	 */
	private boolean eteindre()
	{
		if (estAllume){
			vitesse = 0;
			seDeplace = false;
			estAllume = false;
			System.out.println("Le robot s'est eteint.");
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * Cette méthode fait avancer le robot s'il est allumé et lui fait prendre de la vitesse (à chaque appuie sur le bouton "avancer"==> AVANCER dans action()).
	 * S'il bute au bornes du quadrillage, il s'arrête.
	 * @return
	 */
	private boolean avancerDoucement()
	{	
		this.vitesse = 1;
		if (estAllume)
		{
				if(!this.estPositionValide(this.position))
				{
					this.seDeplace = false;
					System.out.println("Le robot à  atteint ses limites de déplacement.");
					return false;
				}
				else
				{
					this.seDeplace = true;
					if(direction == Direction.HAUT) 
					{
						if(this.estPositionValide(new Point(this.position.abcisse,this.position.ordonnee+this.vitesse)))
						{
							this.position.ordonnee += vitesse;
							System.out.println("Le robot a avancé de "+this.getVitesse()+".");
								return true;
						}
						else
						{
							System.out.println("Le robot à  atteint ses limites de déplacement vers le haut.");
							return false;
						}
					}
				
				else if(direction == Direction.DROITE) 
				{
						if(this.estPositionValide(new Point(this.position.abcisse+this.vitesse,this.position.ordonnee)))
						{
							this.position.abcisse += vitesse;
							System.out.println("Le robot a avancé de "+(this.getVitesse())+" .");
							return true;
						}
						else
						{
							System.out.println("Le robot à  atteint ses limites de déplacement vers la droite.");
							return false;
						}
				}
				else if(direction == Direction.BAS) 
				{
						if(this.estPositionValide(new Point(this.position.abcisse,this.position.ordonnee-this.vitesse)))
						{
							this.position.ordonnee -= vitesse;
							System.out.println("Le robot a avancé de "+this.getVitesse()+" .");
							return true;
						}
						else
						{
							System.out.println("Le robot à  atteint ses limites de déplacement vers le bas.");
							return false;
						}
				}
				else if (direction == Direction.GAUCHE)
				{
						if(this.estPositionValide(new Point(this.position.abcisse-vitesse,this.position.ordonnee)))
						{
							this.position.abcisse -= vitesse;
							System.out.println("Le robot a avancé de "+this.getVitesse()+" .");
							return true;
						}else
						{
							System.out.println("Le robot à  atteint ses limites de déplacement vers la gauche.");
							return false;
						}
				}
				return true;
				}
		}
		else
		{
			return false;
		}
				
	}
	/**
	 * Cette méthode fait avancer le robot s'il est allumé et lui fait prendre de la vitesse (à chaque appuie sur le bouton "avancer"==> AVANCER dans action()).
	 * S'il bute au bornes du quadrillage, il s'arrête.
	 * @return
	 */
	private boolean avancerVite()
	{	
		this.vitesse = 2;
		if (estAllume)
		{
				if(!this.estPositionValide(this.position))
				{
					this.seDeplace = false;
					System.out.println("Le robot à  atteint ses limites de déplacement.");
					return false;
				}
				else
				{
					this.seDeplace = true;
					if(direction == Direction.HAUT) 
					{
						if(this.estPositionValide(new Point(this.position.abcisse,this.position.ordonnee+this.vitesse)))
						{
							this.position.ordonnee += vitesse;
							System.out.println("Le robot a avancé de "+this.getVitesse()+".");
								return true;
						}
						else
						{
							System.out.println("Le robot peut encore avancer de : "+(this.quadrillage.getOrdonneeMax()-position.ordonnee)+" et sa vitesse est rapide(2).");
							return false;
						}
					}
				
				else if(direction == Direction.DROITE) 
				{
						if(this.estPositionValide(new Point(this.position.abcisse+this.vitesse,this.position.ordonnee)))
						{
							this.position.abcisse += vitesse;
							System.out.println("Le robot a avancé de "+(this.getVitesse())+" .");
							return true;
						}
						else
						{
							System.out.println("Le robot peut encore avancer de : "+(this.quadrillage.getAbcisseMax()-position.abcisse)+" et sa vitesse est rapide(2)");
							return false;
						}
				}
				else if(direction == Direction.BAS) 
				{
						if(this.estPositionValide(new Point(this.position.abcisse,this.position.ordonnee-this.vitesse)))
						{
							this.position.ordonnee -= vitesse;
							System.out.println("Le robot a avancé de "+this.getVitesse()+" .");
							return true;
						}
						else
						{
							System.out.println("Le robot peut encore avancer de : "+(-(this.quadrillage.getOrdonneeMin()-position.ordonnee))+" et sa vitesse est rapide(2)");
							return false;
						}
				}
				else if (direction == Direction.GAUCHE)
				{
						if(this.estPositionValide(new Point(this.position.abcisse-vitesse,this.position.ordonnee)))
						{
							this.position.abcisse -= vitesse;
							System.out.println("Le robot a avancé de "+this.getVitesse()+" .");
							return true;
						}
						{
							System.out.println("Le robot peut encore avancer de : "+(-(this.quadrillage.getAbcisseMin()-position.abcisse))+" et sa vitesse est rapide(2)");
							return false;
						}
				}
				return true;
				}
		}
		else
		{
			return false;
		}
				
	}
	/**
	 * Cette fonction fait tourner le robot a droite (à chaque appuie sur le bouton "tourner à droite  ==> TOURNEADROITE dans action()). 
	 * IL faudrait définir une vitesse max a laquelle le robot peut tourner, sans quoi il risque d'avoir trop d'inertie dans son virage et tomber.
	 * @return
	 */
	private boolean tourneADroite()
	{
		if (estAllume)
		{
			if(direction == Direction.HAUT ){
					this.direction = Direction.DROITE;
					System.out.println("Le robot a troune a droite.");
					return true;
			}
			else if(direction == Direction.DROITE){
					this.direction = Direction.BAS;
					System.out.println("Le robot a troune a droite.");
					return true;
			}
			else if (direction == Direction.BAS){
					this.direction = Direction.GAUCHE;
					System.out.println("Le robot a troune a droite.");
					return true;
			}
			else if (direction == Direction.GAUCHE){
					this.direction = Direction.HAUT;
					System.out.println("Le robot a troune a droite.");
					return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
	/**
	 * Cette fonction fait tourner à gauche le robot (à chaque appuie sur le bouton "tourner à gauche" ==> TOURNEAGAUCHE dans action()).
	 * IL faudrait définir une vitesse max a laquelle le robot peut tourner, sans quoi il risque d'avoir trop d'inertie dans son virage et tomber.
	 * @return
	 */
	private boolean tourneAGauche()
	{
		if (estAllume)
		{
			if(direction == Direction.HAUT ){
					direction = Direction.GAUCHE;
					System.out.println("Le robot a tourne a gauche.");
					return true;
			}
			else if(direction == Direction.GAUCHE){
					direction = Direction.BAS;
					System.out.println("Le robot a tourne a gauche.");
					return true;
			}
			else if (direction == Direction.BAS){
					direction = Direction.DROITE;
					System.out.println("Le robot a tourne a gauche.");
					return true;
			}
			else if (direction == Direction.DROITE){
					direction = Direction.HAUT;
					System.out.println("Le robot a tourne a gauche.");
					return true;
			}
			else{
					return false;
			}
		}
		else{
			return false;
		}
	}
	/**
	 * Retourne true si la position du robot est valide, false sinon
	 * @param _positionTest
	 * @return
	 */
	private boolean estPositionValide(Point _positionTest) {
		if (_positionTest.getAbcisse() <= quadrillage.getAbcisseMax()
				&& _positionTest.getOrdonnee() <= quadrillage.getOrdonneeMax()
				&& _positionTest.getAbcisse() >= quadrillage.getAbcisseMin()
				&& _positionTest.getOrdonnee() >= quadrillage.getOrdonneeMin()) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Cette fonction exécute une action dépendante de la valeur de l'énumération à laquelle se réferera l'appuie sur un bouton de la télécommande
	 * @param appuiBouton
	 * @return
	 */
	public boolean action(Bouton appuiBouton)
	{
		switch(appuiBouton){
		case ALLUMER:
			this.allumer();
			return true;
		case ETEINDRE:
			this.eteindre();
			return true;
		case AVANCERVITE:
			this.avancerVite();
			return true;
		case TOURNEADROITE:
			this.tourneADroite();
			return true;
		case TOURNEAGAUCHE:
			this.tourneAGauche();
			return true;
		case AVANCERDOUCEMENT:
			this.avancerDoucement();
			return true;
		default:
			return false;
		}
	}
}
