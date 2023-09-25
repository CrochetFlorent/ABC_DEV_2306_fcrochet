import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Aquarium extends TimerTask{

	private ArrayList<Poisson> poissons = new ArrayList<Poisson>();
	private ArrayList<Algue> algues = new ArrayList<Algue>();
	
	public Aquarium()
	{
		Random rdPoissons = new Random();
		Random rdAlgues = new Random();
		int rd1 =rdPoissons.nextInt(3)+1;
		int rd2 = rdAlgues.nextInt(5)+1;
		for (int i=0;i<rd1;i++){poissons.add(new Poisson());}
		for (int j=0;j<rd2;j++){algues.add(new Algue());}
	}
	
	public void ajoutPoisson(String _nom,String _sexe)
	{
		this.poissons.add(new Poisson(_nom,_sexe));
	}
	
	public void ajoutAlgue()
	{
		this.algues.add(new Algue());
	}
	
	public void passerLeTemps()
	{
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				System.out.println("Un tour est fait,il y a: "+poissons.size()+" poissons et "+algues.size()+" algues.");
			}		
		}, 1000, 5000);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
