import java.util.Arrays;
import java.util.Random;

public class Twisted {

	int[] score = new int[20];
	String[] colors = new String[5];
	
	public Twisted(String _c1,String _c2,String _c3,String _c4,String _c5)
	{
		for (int i=0;i<score.length;i++) {score[i]=0;}
		colors[0] = _c1;
		colors[1] = _c2;
		colors[2] = _c3;
		colors[3] = _c4;
		colors[4] = _c5;
	}
	public String[][] Tournament()
	{
		String[][] tournament = new String[20][20];
		String str = null;
		int nb1,nb2,nb3;

		for (int i=0;i<tournament.length;i++)
		{
			for(int j=0;j<tournament[i].length;j++)
			{
				Random rd1 = new Random();
				Random rd2 = new Random();
				Random rd3 = new Random();
				nb1=rd1.nextInt(6)+1;
				nb2=rd2.nextInt(6)+1;
				nb3=rd3.nextInt(6)+1;
				str =j+1+" "+nb1+" "+nb2+" "+nb3;
				tournament[i][j] = str;
			}
		}
		System.out.println(Arrays.deepToString(tournament));
		return tournament;
	}
	
	public String getWinners(String[][] tournament)
	{
		String strGagnants = null;
		boolean pirate = false;

		for (int i=0;i<tournament.length;i++)
		{
			for (int j=0;j<tournament.length;j++)
			{
				String values = tournament[i][j].toString();
				String[] parts = values.split(" ");
				String part1=parts[0],part2=parts[1],part3=parts[2],part4=parts[3];
				
				//Booleens qui testent les valeurs des lancés
				boolean case1 = Integer.parseInt(part2) == Integer.parseInt(part3)||Integer.parseInt(part2) == Integer.parseInt(part4)||Integer.parseInt(part4) == Integer.parseInt(part3);//parseInt prend les valeures entière d'une string
				boolean case4 = Integer.parseInt(part2)+Integer.parseInt(part3)+Integer.parseInt(part4) == 3 || Integer.parseInt(part2)+Integer.parseInt(part3)+Integer.parseInt(part4) == 18;
				boolean case3 = Integer.parseInt(part2)+Integer.parseInt(part3)+Integer.parseInt(part4) >= 12;
				boolean case2 = Integer.parseInt(part2)+Integer.parseInt(part3)+Integer.parseInt(part4) <=6 ;
				//Booleen testant si il y a eu piratage : si un numéro de joeurs dépasse trois ou si un dé vaut moins que 1 ou plus que 6
				boolean test = Integer.parseInt(part1)>20 || Integer.parseInt(part1)<1 || Integer.parseInt(part2)<1 || Integer.parseInt(part2)>6
						|| Integer.parseInt(part3)<1 ||Integer.parseInt(part3)>6 ||Integer.parseInt(part4)<1 ||Integer.parseInt(part4)>6;
						//Attribution des points en fonction du score et du numéro de joueur, selon les cas(case1,case2,case3) déclarés plus haut
						if(case3) {for (int h=0;h<score.length;h++){	
											if(Integer.parseInt(part1)==h+1){score[h] = score[h] +2;}}}
					else if (case2){for (int h=0;h<score.length;h++){	
											if(Integer.parseInt(part1)==h+1){score[h] = score[h] +1;}}}
					else if (case4){for (int h=0;h<score.length;h++){	
											if(Integer.parseInt(part1)==h+1){score[h] = score[h] +3;}}}
				if (test)
				{
					pirate = true;
				}
			}
		}
		//Triage du tableau des scores
		int[] trigagnants = new int[20];
		for(int i=0;i<score.length;i++){trigagnants[i]=score[i];}
		for (int i=1;i<trigagnants.length;i++)
		{
			for(int j=1;j<trigagnants.length;j++)
			{
				int tmp;
				if(trigagnants[j]>trigagnants[j-1]){
					tmp=trigagnants[j-1];
					trigagnants[j-1]=trigagnants[j];
					trigagnants[j]=tmp;
				}
			}
		}
//		for (int i=1;i<trigagnants.length;i++)
//		{
//			System.out.print("\t"+trigagnants[i]);
//		}
		//Detection d'égalité
		int[] gagnants = new int[20];
		for (int i=1;i<trigagnants.length;i++)
		{
			if(trigagnants[i] == trigagnants[0])
			{
				gagnants[i] = trigagnants[i];
				System.out.print("\t"+gagnants[i]);
			}
			
		}
		strGagnants = 
//		if (pirate = true)
//		{
//			strGagnants = "To investigate";
//		}
		return strGagnants;
	}
}
