package Robot;
enum Bouton{
	ALLUMER,ETEINDRE,AVANCER,RECULER,TOURNEADROITE,TOURNEAGAUCHE,ARRETER
}
enum Direction{
	GAUCHE,DROITE,HAUT,BAS
}

public class Robot {

	private boolean estAllume;
	private boolean estEnMarche;
	private boolean estEnRecul;
	private Point position;
	private Direction direction;
	private Quadrillage quadrillage;
	private int vitesseAvancer,vitesseReculer;
	
	/**
	 * Constructeur sans paramètres
	 */
	public Robot()
	{
		estAllume = false;
		position = new Point(0,0);
		direction = Direction.HAUT;
		vitesseAvancer = 0;
		vitesseReculer = 0;
		quadrillage = new Quadrillage(10,-10,10,-10);
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
	public Robot(boolean _estAllume,boolean _estEnMarche,boolean _estEnRecul,Point _position,Direction _direction,int _vitesseAvancer,int _vitesseReculer,Quadrillage _quadrillage)
	{
		estAllume = _estAllume;
		estEnMarche = _estEnMarche;
		estEnRecul = _estEnRecul;
		position = _position;
		direction = _direction;
		vitesseAvancer = _vitesseAvancer;
		vitesseReculer = _vitesseReculer;
		quadrillage = _quadrillage;
	}
	/**
	 * Cette méthode allume le robot (en appuyant sur le bouton "allumer"==> ALLUMER dans action()).
	 * @return
	 */
	private boolean allumer()
	{
		if (estAllume == false)
		{
			estAllume =true;
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Cette méthode eteint le robot (en appuyant sur le bouton "éteindre" ==> ETEINDRE dans action()).
	 * @return
	 */
	private boolean eteindre()
	{
		if (estAllume == true)
		{
			vitesseReculer= 0;
			vitesseAvancer = 0;
			estEnMarche = false;
			estAllume = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Cette méthode diminue la vitesse du robot s'il est en marche jusqu'a avoir une vitesse de 0 (a chaque appuie sur le bouton "arrêter"==> ARRETER dans action()) 
	 * ou l'arrête si la vitesse est nulle.
	 * Elle gère la vitesse de recule comme la vitesse d'avancée.
	 */
	private boolean arreter()
	{
		if (estAllume && estEnMarche)
		{
			if (vitesseAvancer <=2 && vitesseAvancer != 0)
			{
				vitesseAvancer -= 1;
				if (vitesseAvancer ==0)
				{
					estEnMarche = false;
				}
				return true;
			}
			else if (vitesseAvancer ==0)
			{
				estEnMarche = false;
				return true;
			}
			else if(vitesseReculer <=2 && vitesseReculer != 0)
			{
				vitesseReculer -= 1;
				if (vitesseReculer ==0)
				{
					estEnMarche = false;
				}
				return true;
			}
			else if (vitesseReculer == 0)
			{
				estEnMarche = false;
				return true;
			}
			else
			{
				return false;
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
	private boolean avancer()
	{
		boolean testButee = this.position.abcisse == this.quadrillage.getAbcisseMax() ||
							this.position.abcisse == this.quadrillage.getAbcisseMin()  ||
							this.position.ordonnee == this.quadrillage.getOrdonneeMax() ||
							this.position.ordonnee == this.quadrillage.getOrdonneeMin();
		if (estAllume)
		{
				vitesseReculer = 0;
				if(testButee)
				{
					this.vitesseAvancer = 0;
					this.estEnMarche = false;
					return false;
				}
				else if(!testButee)
				{
					if(this.vitesseAvancer <=1)
					{
						this.vitesseAvancer += 1;
					}
		
					this.estEnMarche = true;
					
					if(direction == this.direction.HAUT) 
					{
					this.position.setOrdonnee(this.position.ordonnee + vitesseAvancer);
					return true;
					}
					else if(direction == this.direction.DROITE) 
					{
					this.position.setAbcisse(this.position.abcisse+vitesseAvancer);
					return true;
					}
					else if(direction == this.direction.BAS) 
					{
						this.position.setOrdonnee(this.position.ordonnee-vitesseAvancer);
						return true;
					}
					else if (direction == this.direction.GAUCHE)
					{
						this.position.setAbcisse(this.position.abcisse-vitesseAvancer);
						return true;
					}
					else
					{
						return false;
					}		
				}
				else
				{
					return false;
				}
		}
		else
		{
			return false;
		}
	}
	/**
	 * Cette méthode fait reculer le robot s'il est allumé et lui fait prendre de la vitesse (à chaque appuie sur le bouton "reculer"==> RECULER dans action()).
	 * @return
	 */
	private boolean reculer()
	{	
		boolean testButee = this.position.getAbcisse() == this.quadrillage.getAbcisseMax() ||
				this.position.getAbcisse() == this.quadrillage.getAbcisseMin()  ||
				this.position.getOrdonnee() == this.quadrillage.getOrdonneeMax() ||
				this.position.getOrdonnee() == this.quadrillage.getOrdonneeMin();
		
		boolean testRecul = this.position.getAbcisse() >= this.quadrillage.getAbcisseMax()-this.vitesseReculer ||
				this.position.getAbcisse() >= -this.quadrillage.getAbcisseMin() -this.vitesseReculer ||
				this.position.getOrdonnee() >= this.quadrillage.getOrdonneeMax()-this.vitesseReculer ||
				this.position.getOrdonnee() >= -this.quadrillage.getOrdonneeMin() -this.vitesseReculer;
		
		
		if (estAllume && estEnMarche)
		{
			
			vitesseAvancer = 0;
			if(testButee && !testRecul)
			{
				this.vitesseAvancer = 0;
				this.estEnMarche = false;
				return false;
			}
			else if(!testButee && testRecul)
			{
				
				if(vitesseReculer <=1 )
				{
					vitesseReculer += vitesseReculer;
					estEnRecul = true;
				}
				
				this.estEnMarche = true;
				
				if(direction ==this.direction.HAUT) 
				{
				this.position.setOrdonnee(this.position.ordonnee -vitesseReculer);
				return true;
				}
				else if(direction == this.direction.DROITE) 
				{
				this.position.setAbcisse(this.position.abcisse-vitesseReculer);
				return true;
				}
				
				else if (direction == this.direction.BAS)
				{
					this.position.setOrdonnee(this.position.ordonnee+vitesseReculer);
					return true;
				}
				else if(direction == this.direction.GAUCHE) 
				{
					this.position.setAbcisse(this.position.abcisse+vitesseReculer);
					return true;
				}
				else
				{
					return false;
				}
			}else 
			{
				estEnMarche = false;
				return false;
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
			if(direction == this.direction.HAUT )
			{
					this.direction = this.direction.DROITE;
					return true;
			}
			else if(direction == this.direction.DROITE)
			{
					this.direction = this.direction.BAS;
					return true;
			}
			else if (direction == this.direction.BAS)
			{
					this.direction = this.direction.GAUCHE;
					return true;
			}
			else if (direction == this.direction.GAUCHE)
			{
					this.direction = this.direction.HAUT;
					return true;
			}
			else
			{
					return false;
			}
		}
		else
		{
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
			if(direction == this.direction.HAUT )
			{
					direction = this.direction.GAUCHE;
					return true;
			}
			else if(direction == this.direction.GAUCHE)
			{
					direction = this.direction.BAS;
					return true;
			}
			else if (direction == this.direction.BAS)
			{
					direction = this.direction.DROITE;
					return true;
			}
			else if (direction == this.direction.DROITE)
			{
					direction = this.direction.HAUT;
					return true;
			}
			else
			{
					return false;
			}
		}
		else
		{
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
		switch(appuiBouton)
		{
		case ALLUMER:
			this.allumer();
			return true;
		case ETEINDRE:
			this.eteindre();
			return true;
		case AVANCER:
			this.avancer();
			return true;
		case RECULER:
			this.reculer();
			return true;
		case TOURNEADROITE:
			this.tourneADroite();
			return true;
		case TOURNEAGAUCHE:
			this.tourneAGauche();
			return true;
		case ARRETER:
			this.arreter();
			return true;
		default:
			return false;
		}
	}
}
