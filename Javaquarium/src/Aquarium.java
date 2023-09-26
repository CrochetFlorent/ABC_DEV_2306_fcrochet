import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Aquarium extends TimerTask{

	private ArrayList<Poisson> poissons = new ArrayList<Poisson>();
	private ArrayList<Algue> algues = new ArrayList<Algue>();
	
	//Constructeur par défaut
	public Aquarium()
	{
		Random rdPoissons = new Random();
		Random rdAlgues = new Random();
		int rd1 =rdPoissons.nextInt(5)+1;
		int rd2 = rdAlgues.nextInt(5)+1;
		for (int i=0;i<rd1;i++) {poissons.add(new Poisson());}
		for (int i=0;i<rd2;i++) {algues.add(new Algue());}
	}
	
	//Ajouter une algue
	public void ajoutAlgue()
	{
		this.algues.add(new Algue());
	}
	//Faire passer le temps dans l'aquarium
	public void passerLeTemps()
	{
		System.out.println("Il y a "+poissons.size()+" poissons et "+algues.size()+" algues dans l'aquarium");
		Timer timer = new Timer();

		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				//La faim des poissons
				for (int i=0;i<poissons.size();i++){poissons.get(i).faim();}
				int nbAlguesEnVie = 0;
				int nbAlguesMorts = 0;
				int nbPoissonsEnVie = 0;
				int nbPoissonsMorts = 0;
				//On fait manger nos poissons
				for (int i=0;i<poissons.size();i++){
					Random rdAlgue = new Random();
					Random rdPoisson = new Random();
					int rd1=rdAlgue.nextInt(algues.size());
					int rd2=rdPoisson.nextInt(poissons.size());
					if(poissons.get(i).getType()==true) {while(!algues.get(rd1).getVie()) {rd1=rdAlgue.nextInt(algues.size());}
									poissons.get(i).manger(algues.get(rd1));}
					else  {while(rd2==i) {rd2=rdPoisson.nextInt(poissons.size());}
							while(!poissons.get(rd2).getVie()||rd2==i) {rd2=rdPoisson.nextInt(poissons.size());}
							poissons.get(i).manger(poissons.get(rd2));}}
				//On récupère la liste des poissons en vie et morts, pareille pour les algues
				for (int i=0;i<algues.size();i++) {
					if(algues.get(i).getVie()) {nbAlguesEnVie += 1;}
					else {nbAlguesMorts +=1;}}
				for (int i=0;i<poissons.size();i++) {
					if(poissons.get(i).getVie()) {nbPoissonsEnVie += 1;}
					else {nbPoissonsMorts +=1;}}
				System.out.println("Un tour est fait,il y a: "+nbPoissonsEnVie+" poissons en vie et "+nbPoissonsMorts+" poisons morts et "+nbAlguesEnVie+" algues en vie et "+nbAlguesMorts+" algues morts.");
			}		
		}, 1000, 5000);
	}		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}


