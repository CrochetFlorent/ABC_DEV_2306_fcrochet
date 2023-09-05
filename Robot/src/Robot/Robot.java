package Robot;
enum Bouton{
	ALLUMER,ETEINDRE,AVANCER,RECULER,TOURNEADROITE,TOURNEAGAUCHE,ARRETER
}

public class Robot {

	private boolean estAllume;
	private boolean estEnMarche;
	private Point position;
	private double direction;
	private int vitesse;
	private Quadrillage quadrillage;
	
	/**
	 * Constructeur sans paramètres
	 */
	public Robot()
	{
		estAllume = false;
		position = new Point(0,0);
		direction = 2*Math.PI;
		vitesse = 0;
		quadrillage = new Quadrillage(10,10,10,10);
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
	public Robot(boolean _estAllume,boolean _estEnMarche,Point _position,double _direction,int _vitesse,Quadrillage _quadrillage)
	{
		estAllume = _estAllume;
		estEnMarche = _estEnMarche;
		position = _position;
		direction = _direction;
		vitesse = _vitesse;
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
			estAllume = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Cette méthode diminue la vitesse du robot s'il est en marche jusqu'a avoir une vitesse de 0 (a chaque appuie sur le bouton "arrêter"==> ARRETER dans action()).
	 */
	private boolean arreter()
	{
		if (estAllume && estEnMarche)
		{
			if (vitesse <=2 && vitesse != 0)
			{
				vitesse -= 1;
				return true;
			}
			else if (vitesse ==0)
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
		boolean testButee = this.position.getAbcisse() != this.quadrillage.getAbcisseMax() &&
							this.position.getAbcisse() != this.quadrillage.getAbcisseMin()  &&
							this.position.getOrdonnee() != this.quadrillage.getOrdonneeMax() &&
							this.position.getOrdonnee() != this.quadrillage.getOrdonneeMin();
		if (estAllume)
		{
			
				if(!testButee)
				{
					this.vitesse = 0;
					this.estEnMarche = false;
					return false;
				}
				while(testButee)
				{
					
					if(this.vitesse <=1)
					{
						this.vitesse += 1;
					}
		
					this.estEnMarche = true;
					
					if(direction == Math.PI*2) 
					{
					this.position.setAbcisse(this.position.getAbcisse() + vitesse);
					return true;
					}
					else if(direction == Math.PI/2) 
					{
					this.position.setOrdonne(this.position.getOrdonnee()+vitesse);
					return true;
					}
					else if(direction == Math.PI) 
					{
						this.position.setOrdonne(this.position.getAbcisse()+vitesse);
						return true;
					}
					else if (direction == 3*Math.PI/2)
					{
						this.position.setOrdonne(this.position.getOrdonnee()+vitesse);
						return true;
					}
					else
					{
						return false;
					}		
				}
		}
		else
		{
			return false;
		}
		return false;
	}
	/**
	 * Cette méthode fait reculer le robot s'il est allumé et lui fait prendre de la vitesse (à chaque appuie sur le bouton "reculer"==> RECULER dans action()).
	 * @return
	 */
	private boolean reculer()
	{	
		boolean testButee = this.position.getAbcisse() != this.quadrillage.getAbcisseMax() &&
				this.position.getAbcisse() != this.quadrillage.getAbcisseMin()  &&
				this.position.getOrdonnee() != this.quadrillage.getOrdonneeMax() &&
				this.position.getOrdonnee() != this.quadrillage.getOrdonneeMin();
		
		if (estAllume && !estEnMarche)
		{
			if(testButee)
			{
				if(vitesse <=1)
				{
					vitesse += vitesse;
				}
				
				this.estEnMarche = true;
				
				if(direction ==Math.PI*2) 
				{
				this.position.setAbcisse(this.position.getAbcisse() -vitesse);
				return true;
				}
				else if(direction == Math.PI/2) 
				{
				this.position.setOrdonne(this.position.getOrdonnee()-vitesse);
				return true;
				}
				
				else if (direction == Math.PI)
				{
					this.position.setOrdonne(this.position.getAbcisse()-vitesse);
					return true;
				}
				else if(direction == 3*Math.PI/2) 
				{
					this.position.setOrdonne(this.position.getOrdonnee()-vitesse);
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
	 * @return
	 */
	private boolean tourneADroite()
	{
		if (estAllume)
		{
			if(direction == Math.PI )
			{
					direction = (Math.PI/2);
					return true;
			}
			else if(direction == Math.PI/2)
			{
					direction = (Math.PI*2);
					return true;
			}
			else if (direction == Math.PI*2)
			{
					direction = (3*Math.PI/2);
					return true;
			}
			else if (direction == 3*Math.PI/2)
			{
					direction = Math.PI;
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
	 * @return
	 */
	private boolean tourneAGauche()
	{
		if (estAllume)
		{
			if(direction == Math.PI )
			{
					direction = (3*Math.PI/2);
					return true;
			}
			else if(direction == Math.PI/2)
			{
					direction = (Math.PI);
					return true;
			}
			else if (direction == Math.PI*2)
			{
					direction = (Math.PI/2);
					return true;
			}
			else if (direction == 3*Math.PI/2)
			{
					direction = Math.PI*2;
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
