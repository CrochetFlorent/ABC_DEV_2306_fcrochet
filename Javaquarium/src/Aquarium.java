import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Aquarium{

	private ArrayList<Poisson> poissons = new ArrayList<Poisson>();//liste contenant les poissons
	private ArrayList<Algue> algues = new ArrayList<Algue>();//liste contenant les algues
	int tours = 1;//nombre de tours
		
	//Constructeur par défaut
	public Aquarium()
	{
		Random rd = new Random();
		for (int i=0;i<10;i++) {poissons.add(new Poisson());}
		for (int i=0;i<5;i++) {algues.add(new Algue());}
	}

	//Ajouter une algue
	public void ajoutAlgue()
	{
		this.algues.add(new Algue());
	}
	
	//Getter(servent dans la classe poisson pour definir une taile max avant reproduction)
	public ArrayList<Poisson> getArrayPoisson()
	{
		return poissons;
	}
	public ArrayList<Algue> getArrayAlgues()
	{
		return algues;
	}
	public int getPoissons()
	{
		return poissons.size();
	}
	
	public int getAlgues()
	{
		return algues.size();
	}
	//Faire passer le temps par un timer
	public void passerLeTemps() throws InterruptedException, IOException 
	{
		@SuppressWarnings("resource")
		FileWriter resultats = new FileWriter("C:/Users/fcrochet/OneDrive - CENTRE DE READAPTATION/Documents/Git/ABCDEV_2306_fcrochet/Javaquarium/Javaquarium.txt",false);
		String results;
		int nbAlguesMorts = 0;
		int nbPoissonsMorts = 0;
		int poissonsEnPlus = 0;
		int alguesEnPlus = 0;
		System.out.println("Il y a "+poissons.size()+" poissons et "+algues.size()+" algues dans l'aquarium");
		
				Random rd = new Random();
				nbAlguesMorts =0;
				nbPoissonsMorts =0;
				alguesEnPlus = 0;
				poissonsEnPlus = 0;
				ArrayList<Poisson> remove = new ArrayList<Poisson>();//Liste qui va contenir les poissons à enlever
																	//chaque tour si morts
				ArrayList<Algue> remove2 = new ArrayList<Algue>();//Liste qui va contenir les algues à enlever
																	//chaque tour si morts
		
				//La faim des poissons
				for (int i=0;i<poissons.size();i++)
				{
					poissons.get(i).faim();
					if(!poissons.get(i).getVie()) {remove.add(poissons.get(i));}}
				
				//Reproduction des algues
				for(int i=0;i<algues.size();i++)//Pour tous les algues
				{
					if(algues.size()<20) //Si on à moins de 20 algues
					{
						Algue newAlgue = algues.get(i).reproduction(this);
						if(newAlgue!=null) {algues.add(newAlgue);}
						if(algues.get(i).getReproduction()) {alguesEnPlus +=1;}
					}
				}
				//Remise à false de l'attribut sEstRepdroduit des poissons s'étant reproduits au tour précédent
				for (int i=0;i<poissons.size();i++)//Pour tous les poissons
				{
					poissons.get(i).setReproduction(false);
				}
				//Remise à false de l'attribut sEstRepdroduit des algues s'étant reproduits au tour précédent
				for (int i=0;i<algues.size();i++)//Pour tous les algues
				{
					algues.get(i).setRepdroduction(false);
				}
				//Reproduction des poissons
				for(int i=0;i<poissons.size();i++)
				{
					int rdRepro = rd.nextInt(poissons.size());//On choisit un poisson au hazard
					//Et on le fait essayer de se reproduire avec un autre poisson.
					//Tant que le poissons choisit est lui même et qu'il y a des poissons dans l'aquarium
					//on rechoisit un autre poisson
					while(rdRepro==i && poissons.size()!=0 && poissons.size()!=1) {rdRepro = rd.nextInt(poissons.size());}
					if(poissons.size()<20 && !poissons.get(i).getReproduction())  //Si on à moin de 20 poissons
					// et qu'il ne se sont pas encore reproduit ce tour-ci
					{
					Poisson newPoisson =poissons.get(i).reproduction(poissons.get(rdRepro),this);
					if(newPoisson != null) {poissons.add(newPoisson);}
					if(poissons.get(i).getReproduction()) {poissonsEnPlus +=1;}
					//Ils se reproduisent
					}
				}
				
				//On fait manger nos poissons
				for (int i=0;i<poissons.size();i++)
				{
					int rd1 = 0;
					if(algues.size()>0) //Si : le nombre d'algues est sumérieur à zéro
					{
//						if(algues.size()>0)
//						{
							rd1=rd.nextInt(algues.size()); //On choisit un algue au hazard
//						}else
//							rd1=0;
					
						if(poissons.get(i).getType().equals("Herbivore")) // Si le poissons est herbivore
						{
							poissons.get(i).manger(algues.get(rd1));//On mange l'algue choisit
							if(!algues.get(rd1).getVie()){nbAlguesMorts += 1;remove2.add(algues.get(rd1));}//on incrémente 
							//le nombre d'algues morts et on enleve l'algue de l'arraylist
						}
					}}
					int i = 0;
					if(poissons.size()>0) //Si: le nombre de poissons est supérieur à zéro
					{
						int rd2=rd.nextInt(poissons.size());//On choisit un poisson au hazard
						if  (!poissons.get(i).getType().equals("Carnivore"))//S'il est carnivore
						{
							//Tant que le poissons choisit au hazard est pas lui même on relance le random
							while(rd2==i && poissons.size()!=0) {rd2=rd.nextInt(poissons.size());}
							poissons.get(i).manger(poissons.get(rd2));//Le poissons choisit attaque un autre poisson
							if(!poissons.get(rd2).getVie()){nbPoissonsMorts += 1;//on incrémente le nombre de poissons morts
							if(!poissons.get(rd2).getVie()) {remove.add(poissons.get(rd2));} //et on ajoute à une list de poissons à enlever
							//a chaque tour le poisson attaqué s'il est mort
						}
					}
				}
					
				//Decompte des tours,on incrémente l'age des algues et poissons
				for(int i1=0;i1<algues.size();i1++){algues.get(i1).setAge(algues.get(i1).getAge()+1);}
				for(int i1=0;i1<poissons.size();i1++){poissons.get(i1).setAge(poissons.get(i1).getAge()+1);}
					
				//Traitement de la vieillesse, si  l'algue ou le poissons à passé 20 tours on le range dans les poissons
				//ou algues à remove de leur array list s'ils sont en vie(car sinon c'est qu'il ont été mangés)
				for(int i1=0;i1<algues.size();i1++){if(algues.get(i1).getAge()==20 && poissons.get(i).getVie()){remove2.add(algues.get(i1));nbAlguesMorts += 1;}}
				for(int i1=0;i1<poissons.size();i1++){if(poissons.get(i1).getAge()==20 && poissons.get(i).getVie()){remove.add(poissons.get(i1));nbPoissonsMorts += 1;}}
				
				//Suppresion des poissons morts et les algues morts de leur arraylist
				for (int i1=0;i1<remove.size();i1++)
				{
					poissons.remove(i1);
				}
				for (int i1=0;i1<remove.size();i1++)
				{
					algues.remove(i1);
				}
				
				
				//Affichage du récapitulatif d'un tour
				System.out.println("\nTour: "+tours+",il y a: "+poissons.size()+" poissons en vie et "+nbPoissonsMorts+" poissons morts et "+algues.size()+" algues en vie et "+nbAlguesMorts+" algues morts."+alguesEnPlus+" algues en plus, et "+poissonsEnPlus+" poissons en plus.");
				System.out.println("Le(s) poisson(s) en vie s'apelle(nt): ");
				for (int i1=0;i1<poissons.size();i1++)
				{
					if(i1 == poissons.size()-1)
					{
						System.out.print(poissons.get(i1).getNom().toString()+poissons.get(i1).getGeneration()+"("+poissons.get(i1).getType()+" "+poissons.get(i1).getRace()+").\n");
					}
					else
					{
						System.out.print(poissons.get(i1).getNom().toString()+poissons.get(i1).getGeneration()+"("+poissons.get(i1).getType()+" "+poissons.get(i1).getRace()+"), ");
					}
				}
				
				//Ecriture dans un fichier
				results = "Tour: "+this.tours+"\n";
				String fishes ="";
				for (int i1=0;i1<poissons.size();i1++)
				{
					if(i1==poissons.size()-1)
					{
					fishes = fishes +"Nom: "+poissons.get(i1).getNom()+poissons.get(i1).getGeneration()+"\t\t\t Pv: "+poissons.get(i1).getPV()+"\n\n\n";
					}
					else
					{
						fishes = fishes +"Nom: "+poissons.get(i1).getNom()+poissons.get(i1).getGeneration()+"\t\t\t Pv: "+poissons.get(i1).getPV()+"\n";
					}
				}
				resultats.write(results+fishes);
				
				//Prise d'un tour
				tours +=1;
				
	
			}
	}



