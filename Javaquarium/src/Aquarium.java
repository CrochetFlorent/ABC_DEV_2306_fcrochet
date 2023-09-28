import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Aquarium{

	private ArrayList<Poisson> poissons = new ArrayList<Poisson>();
	private ArrayList<Algue> algues = new ArrayList<Algue>();
	private int tours = 1;
		
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
	
	//Faire passer le temps par un timer
	public void passerLeTemps() throws InterruptedException
	{
		
		System.out.println("Il y a "+poissons.size()+" poissons et "+algues.size()+" algues dans l'aquarium");
		
			while(tours<=50)
			{	
				TimeUnit.SECONDS.sleep(2);
				Random rd = new Random();
				int nbAlguesMorts = 0;
				int nbPoissonsMorts = 0;
				ArrayList<Integer> remove = new ArrayList<Integer>();
				
				//Decompte des tours
				for(int i=0;i<algues.size();i++){algues.get(i).setAge(algues.get(i).getAge()+1);}
				for(int i=0;i<poissons.size();i++){poissons.get(i).setAge(poissons.get(i).getAge()+1);}
				
				//Traitement de la vieillesse
				for(int i=0;i<algues.size();i++){if(algues.get(i).getAge()==20){algues.remove(i);nbAlguesMorts += 1;}}
				for(int i=0;i<poissons.size();i++){if(poissons.get(i).getAge()==20){poissons.remove(i);nbPoissonsMorts += 1;}}
				
				//La faim des poissons
				for (int i=0;i<poissons.size();i++){poissons.get(i).faim();}
				
				//Reproduction des algues
				for(int i=0;i<algues.size();i++)
				{
					if(algues.size()<20) 
					{
						Algue newAlgue = algues.get(i).reproduction();
						if(newAlgue!=null) {algues.add(newAlgue);}
					}
				}
				//Remise à false de l'attribut sEstRepdroduit des poissons s'étant reproduits au tour précédent
				for (int i=0;i<poissons.size();i++)
				{
					poissons.get(i).setReproduction(false);
				}
				//Reproduction des poissons
				for(int i=0;i<poissons.size();i++)
				{
					int rdRepro = rd.nextInt(poissons.size());
					while(rdRepro==i && poissons.size()!=0) {rdRepro = rd.nextInt(poissons.size());}
					if(poissons.size()<20 || !poissons.get(i).getReproduction()) 
					{
					Poisson newPoisson =poissons.get(i).reproduction(poissons.get(rdRepro));
					if(newPoisson != null) {poissons.add(newPoisson);}
					}
				}
				
				//On fait manger nos poissons
				for (int i=0;i<poissons.size();i++)
				{
					if(algues.size()>0) 
					{
						int rd1=rd.nextInt(algues.size());
						if(poissons.get(i).getType()) 
						{
							poissons.get(i).manger(algues.get(rd1));
							if(!algues.get(rd1).getVie()){nbAlguesMorts += 1;algues.remove(rd1);}
						}
					}
					if(poissons.size()>0) 
					{
						int rd2=rd.nextInt(poissons.size());
						if  (!poissons.get(i).getType())
						{
							while(rd2==i && poissons.size()!=0) {rd2=rd.nextInt(poissons.size());}			
							poissons.get(i).manger(poissons.get(rd2));
							if(!poissons.get(rd2).getVie()){nbPoissonsMorts += 1;remove.add(rd2);}
						}
					}
				}
				//Suppresion des poissons morts de l'arraylist
				for (int i=0;i<remove.size();i++)
				{
					poissons.remove(i);
				}
				
				//Affichage du récapitulatif d'un tour
				System.out.println("\nTour: "+tours+",il y a: "+poissons.size()+" poissons en vie et "+nbPoissonsMorts+" poissons morts et "+algues.size()+" algues en vie et "+nbAlguesMorts+" algues morts.");
				System.out.println(" Le(s) poisson(s) en vie s'apelle(nt): ");
				for (int i=0;i<poissons.size();i++)
				{
					if(i == poissons.size()-1)
					{
						System.out.print(poissons.get(i).getNom().toString()+poissons.get(i).getGeneration()+"("+poissons.get(i).getType()+").\n");
					}
					else
					{
						System.out.print(poissons.get(i).getNom().toString()+poissons.get(i).getGeneration()+"("+poissons.get(i).getType()+"), ");
					}
				}
				
				//Prise d'un tour
				tours +=1;
			}
	}
}


