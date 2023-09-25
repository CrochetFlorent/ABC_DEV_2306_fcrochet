import java.util.Arrays;
import java.util.Random;

public class Twisted {

	private int[] score = new int[20];
	private String[] colors = new String[5];
	private int[] tabColors = new int[5];
	private int[][] triGagnants = new int[20][2];

	
	public Twisted(String _c1,String _c2,String _c3,String _c4,String _c5)
	{
		for (int i=0;i<score.length;i++) {score[i]=0;}
		colors[0] = _c1;
		colors[1] = _c2;
		colors[2] = _c3;
		colors[3] = _c4;
		colors[4] = _c5;
	}
	//Création du tournoi, génération des lancés de dés en fonction des numéros des joueurs
	public String[][] Tournament()
	{ 
		String[][] tournament = new String[20][20];
		String str = null;
		int nb1,nb2,nb3;

		for (int i=0;i<tournament.length;i++){
			for(int j=0;j<tournament[i].length;j++){
				Random rd1 = new Random();
				Random rd2 = new Random();
				Random rd3 = new Random();
				nb1=rd1.nextInt(6)+1;
				nb2=rd2.nextInt(6)+1;
				nb3=rd3.nextInt(6)+1;
				str =j+1+" "+nb1+" "+nb2+" "+nb3;
				tournament[i][j] = str;}}
		System.out.println(Arrays.deepToString(tournament));
		return tournament;
	}
	
	//Analyse des jets et détéction du gagnant
	public String getWinners(String[][] tournament)
	{
		String strGagnants = "";
		boolean pirate = false;
		int color;
		for (int i=0;i<tournament.length;i++){
			for (int j=0;j<tournament.length;j++){
				//Découpage des chaine de caractères contenant les numéro de joueurs et leurs lancés
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
					else if (case1){Random rd = new Random();
									color = rd.nextInt(5);
									for (int k=0;k<colors.length;k++){tabColors[color]=tabColors[color]+1;}}
				if (test){pirate = true;}
				//Attri
				//Remplissage du tableau des scores avec les numéro des joueurs et le score de chacun
				triGagnants[j][0]=Integer.parseInt(part1);
				triGagnants[j][1]=score[j];}}
		//Appel de la méthode pour trier le tableau des scores : classement des gagnants(ordre croissant)
		//Grace au tri à bulle
		this.triGagnants();
		//Detection d'égalite
		int tmp = 0;
		for(int i=0;i<20;i++){
			//System.out.println(triGagnants[i][0]+" "+triGagnants[i][1]);
			if(triGagnants[i][1]==triGagnants[0][1]){tmp +=1;}}
		//Création de la chaine de caratcère comportant les gagnants
		for (int i=0;i<tmp;i++)
		{	
			if(strGagnants.equals("")) {strGagnants = strGagnants+"Pts:"+triGagnants[i][1]+" Num:"+triGagnants[i][0];}
			else{strGagnants = strGagnants+" Pts:"+triGagnants[i][1]+" Num:"+triGagnants[i][0];}}
//		if (pirate = true)
//		{
//			strGagnants = "To investigate";
//		}
		return strGagnants;
	}
	//Etablissement des prix gagnés par les gagnants
	public String getPrizeValue()
	{
		String strGagnants = "";
		//Detection d'égalite
				int tmp = 0;
				for(int i=0;i<20;i++){
					//System.out.println(triGagnants[i][0]+" "+triGagnants[i][1]);
					if(triGagnants[i][1]==triGagnants[0][1]){tmp +=1;}}
				//Création de la chaine de caratcère comportant les gagnants
				strGagnants = "il(s) gagne(nt) "+6000/tmp+" chacun(s).";
		return strGagnants;
	}
	//Récupération de la couleur gagnante
	public String getColor()
	{
		for (int i=1;i<tabColors.length;i++){
			for(int j=1;j<tabColors.length;j++) {if(tabColors[j]>tabColors[j-1]){colors[j-1]=colors[j];}}}
		return "La couleur qui servira de base pour le designe du logo du nouveau yaourt BioYourt est "+colors[0]+".";
	}	
	//Tri du tableau des scores, tri à bulle
	private void triGagnants()
	{
		for (int i=1;i<triGagnants.length;i++){
			for(int j=1;j<triGagnants.length;j++){
				int tmp;
				if(triGagnants[j][1]>triGagnants[j-1][1]){
					tmp=triGagnants[j-1][0];
					triGagnants[j-1][0]=triGagnants[j][0];
					triGagnants[j][0]=tmp;
					tmp=triGagnants[j-1][1];
					triGagnants[j-1][1]=triGagnants[j][1];
					triGagnants[j][1]=tmp;}}}
	}
}
