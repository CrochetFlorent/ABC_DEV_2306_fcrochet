import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.EventHandler;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;



public class Aquarium extends TimerTask{

	private ArrayList<Poisson> poissons = new ArrayList<Poisson>();
	private ArrayList<Algue> algues = new ArrayList<Algue>();
	
	//Constructeur par défaut
	public Aquarium()
	{
		Random rdPoissons = new Random();
		Random rdAlgues = new Random();
		int rd1 =rdPoissons.nextInt(8)+1;
		int rd2 = rdAlgues.nextInt(5)+1;
		for (int i=0;i<rd1;i++) {poissons.add(new Poisson());}
		for (int i=0;i<rd2;i++) {algues.add(new Algue());}
	}

	//Ajouter une algue
	public void ajoutAlgue()
	{
		this.algues.add(new Algue());
	}
	
	//Faire passer le temps par l'appuie sur espace
	public void passerLeTempsPush()
	{
		System.out.println("Il y a "+poissons.size()+" poissons et "+algues.size()+" algues dans l'aquarium");
				int nbAlguesEnVie = 0;
				int nbAlguesMorts = 0;
				int nbPoissonsEnVie = 1;
				int nbPoissonsMorts = 0;
				//Decompte des tours
				for(int i=0;i<algues.size();i++){algues.get(i).setAge(algues.get(i).getAge()+1);}
				for(int i=0;i<poissons.size();i++){poissons.get(i).setAge(poissons.get(i).getAge()+1);}
				//Traitement de la vieillesse
				for(int i=0;i<algues.size();i++){if(algues.get(i).getAge()==20){algues.get(i).setVie(false);}}
				for(int i=0;i<poissons.size();i++){if(poissons.get(i).getAge()==20){poissons.get(i).setVie(false);}}
				//Reproduction
				int nbAlgues = 0;
				int nbPoissons = 0;
				for(int i=0;i<algues.size();i++){nbAlgues +=1;}
				for(int i=0;i<nbAlgues;i++){Algue newAlgue = algues.get(i).reproduction();
				if(newAlgue!=null) {algues.add(newAlgue);}}
				for(int i=0;i<poissons.size();i++){nbPoissons +=1;}
				for(int i=0;i<nbPoissons;i++){
					Random rdRepro= new Random();
					int rd = rdRepro.nextInt(poissons.size());
					while(rd==i) {rd = rdRepro.nextInt(poissons.size());}
					Poisson newPoisson =poissons.get(i).reproduction(poissons.get(rd));
					if(newPoisson != null) {poissons.add(newPoisson);}}
				//La faim des poissons
				for (int i=0;i<poissons.size();i++){poissons.get(i).faim();}
				//On fait manger nos poissons
				for (int i=0;i<poissons.size();i++){
					Random rdAlgue = new Random();
					Random rdPoisson = new Random();
					int rd1=rdAlgue.nextInt(algues.size());
					int rd2=rdPoisson.nextInt(poissons.size());
					if(poissons.get(i).getType()) {while(!algues.get(rd1).getVie()) {rd1=rdAlgue.nextInt(algues.size());}
									poissons.get(i).manger(algues.get(rd1));}
					else  {while(rd2==i) {rd2=rdPoisson.nextInt(poissons.size());}
							while(!poissons.get(rd2).getVie()||rd2==i) {rd2=rdPoisson.nextInt(poissons.size());}			
									poissons.get(i).manger(poissons.get(rd2));}}
				//On récupère la liste des poissons en vie et morts, pareille pour les algues
				nbPoissonsEnVie =0;
				for (int i=0;i<algues.size();i++) {
					if(algues.get(i).getVie()) {nbAlguesEnVie += 1;}
					else {nbAlguesMorts +=1;}}
				for (int i=0;i<poissons.size();i++) {
					if(poissons.get(i).getVie()) {nbPoissonsEnVie += 1;}
					else {nbPoissonsMorts +=1;}}
				System.out.println("Un tour est fait,il y a: "+nbPoissonsEnVie+" poissons en vie et "+nbPoissonsMorts+" poissons morts et "+nbAlguesEnVie+" algues en vie et "+nbAlguesMorts+" algues morts.");
								
	}
	//Faire passer le temps par un timer
	public void passerLeTemps()
	{
		System.out.println("Il y a "+poissons.size()+" poissons et "+algues.size()+" algues dans l'aquarium");
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				int nbAlguesEnVie = 0;
				int nbAlguesMorts = 0;
				int nbPoissonsEnVie = 1;
				int nbPoissonsMorts = 0;
				//Decompte des tours
				for(int i=0;i<algues.size();i++){algues.get(i).setAge(algues.get(i).getAge()+1);}
				for(int i=0;i<poissons.size();i++){poissons.get(i).setAge(poissons.get(i).getAge()+1);}
				//Traitement de la vieillesse
				for(int i=0;i<algues.size();i++){if(algues.get(i).getAge()==20){algues.get(i).setVie(false);}}
				for(int i=0;i<poissons.size();i++){if(poissons.get(i).getAge()==20){poissons.get(i).setVie(false);}}
				//Reproduction
				int nbAlgues = 0;
				int nbPoissons = 0;
				for(int i=0;i<algues.size();i++){nbAlgues +=1;}
				for(int i=0;i<nbAlgues;i++){Algue newAlgue = algues.get(i).reproduction();
				if(newAlgue!=null) {algues.add(newAlgue);}}
				for(int i=0;i<poissons.size();i++){nbPoissons +=1;}
				for(int i=0;i<nbPoissons;i++){
					Random rdRepro= new Random();
					int rd = rdRepro.nextInt(poissons.size());
					while(rd==i) {rd = rdRepro.nextInt(poissons.size());}
					Poisson newPoisson =poissons.get(i).reproduction(poissons.get(rd));
					if(newPoisson != null) {poissons.add(newPoisson);}}
				//La faim des poissons
				for (int i=0;i<poissons.size();i++){poissons.get(i).faim();}
				//On fait manger nos poissons
				for (int i=0;i<poissons.size();i++){
					Random rdAlgue = new Random();
					Random rdPoisson = new Random();
					int rd1=rdAlgue.nextInt(algues.size());
					int rd2=rdPoisson.nextInt(poissons.size());
					if(poissons.get(i).getType()) {while(!algues.get(rd1).getVie()) {rd1=rdAlgue.nextInt(algues.size());}
									poissons.get(i).manger(algues.get(rd1));}
					else  {while(rd2==i) {rd2=rdPoisson.nextInt(poissons.size());}
							while(!poissons.get(rd2).getVie()||rd2==i) {rd2=rdPoisson.nextInt(poissons.size());}			
									poissons.get(i).manger(poissons.get(rd2));}}
				//On récupère la liste des poissons en vie et morts, pareille pour les algues
				nbPoissonsEnVie =0;
				for (int i=0;i<algues.size();i++) {
					if(algues.get(i).getVie()) {nbAlguesEnVie += 1;}
					else {nbAlguesMorts +=1;}}
				for (int i=0;i<poissons.size();i++) {
					if(poissons.get(i).getVie()) {nbPoissonsEnVie += 1;}
					else {nbPoissonsMorts +=1;}}
				System.out.println("Un tour est fait,il y a: "+nbPoissonsEnVie+" poissons en vie et "+nbPoissonsMorts+" poissons morts et "+nbAlguesEnVie+" algues en vie et "+nbAlguesMorts+" algues morts.");
						}		
		}, 1000, 3000);
	}

	@Override
	public void run() {}

	
}


