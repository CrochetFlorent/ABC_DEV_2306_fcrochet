package src;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.*;
import java.util.Scanner;

public class Trier_Valeurs_JSON {

	public static void main(String[] args) throws IOException, org.json.simple.parser.ParseException {
		
		URL url = new URL("https://api.devoldere.net/polls/yoghurts/");
		
		//Connexion au JSON
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setConnectTimeout(20000);
	    connection.setReadTimeout(20000);
	    connection.setDoInput(true);
	    connection.setRequestProperty ("Accept", "application/json");
	    //Scan de l'array
	    String poll = "";
	    Scanner sc = new Scanner(url.openStream());
	    while(sc.hasNext()) {
	    	poll += sc.nextLine();
	    }
	    sc.close();
	    //Création du tableau JSON qui récupère les données
	    JSONParser parser = new JSONParser();
	    JSONObject obj = (JSONObject) parser.parse(poll);
	    JSONArray values = (JSONArray) obj.get("results");
	    //Affichage des données du json et lancement du tri
	    System.out.println(values);
	    prefered(values);    
	}

	public static void prefered(JSONArray _array)
	{
		int[] tabNb = new int[5];
		String[] tabColor = new String[5];
		String color;
		int nb;
		
		tabColor[0] = "Vert";
		tabColor[1] = "Rouge";
		tabColor[2] = "Jaune";
		tabColor[3] = "Bleu";
		tabColor[4] = "Orange";
		//Comptage du nombre de fois que chaque couleur est réprésentée en incrémentant une valeur dans un tableau à un indice propre à chaque couleur
		for (int i=0;i<_array.size();i++)
		{	
			if(_array.get(i).equals("green"))
			{
				tabNb[0] = tabNb[0]+1; 
			}else if (_array.get(i).equals("red"))
			{
				tabNb[1] = tabNb[1]+1; 
			}else if (_array.get(i).equals("yellow"))
			{
				tabNb[2] = tabNb[2]+1; 
			}else if (_array.get(i).equals("blue"))
			{
				tabNb[3] = tabNb[3]+1; 
			}else 
			{
				tabNb[4] = tabNb[4]+1; 
			}

		}
		//Placement des deux couleurs les plus représentées en première et deuxième place grâce à une organisation des couleurs par parcours des tableaux
		for (int i=1;i<tabNb.length;i++)
		{
				for (int j=1;j<tabNb.length;j++)
				{
						if(tabNb[j] > tabNb[j-1])
						{
							color = tabColor[j-1];
							tabColor[j-1] = tabColor[j];
							tabColor[j] = color;
						}
				}
		}
		//On met en valeur de deux tableaux l'indice deu JSON array ou la couleur est placée.
		int[] tab1 = new int[_array.size()];
		int[] tab2 = new int[_array.size()];
		for (int h=0;h <_array.size();h++)
		{
			if (_array.get(h).toString().equals(tabColor[0]))
			{
				tab1[h] = h;
			}
			else if (_array.get(h).toString().equals(tabColor[1]))
			{
				tab2[h] = h;
			}
		}
		//Si le tableau représentant une couleur a un indice supérieur à celui de l'autre alors l'autre(arrivée avant dans le json array) en placée en première
		if (tab1[0] > tab2[1] && tabNb[0] == tabNb[1])
		{
			tabColor[0]=tabColor[1];
		}
		System.out.println(tabColor[0]+" "+tabColor[1]);
	}
}
