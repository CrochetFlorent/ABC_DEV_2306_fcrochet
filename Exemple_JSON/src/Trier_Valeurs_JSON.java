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
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setConnectTimeout(20000);
	    connection.setReadTimeout(20000);
	    connection.setDoInput(true);
	    
	    connection.setRequestProperty ("Accept", "application/json");
		
	    String poll = "";
	    Scanner sc = new Scanner(url.openStream());
	    
	    while(sc.hasNext()) {
	    	poll += sc.nextLine();
	    }
	    sc.close();

	    JSONParser parser = new JSONParser();
	    JSONObject obj = (JSONObject) parser.parse(poll);
	    JSONArray values = (JSONArray) obj.get("results");
	    
	    System.out.println(values);
	    prefered(values);    
	}

	public static void prefered(JSONArray _array)
	{
		int[] tabNb = new int[5];
		String[] tabColor = new String[5];
		String color;
		int nb;
		
		String first =  _array.get(0).toString();
		
		tabColor[0] = "Vert";
		tabColor[1] = "Rouge";
		tabColor[2] = "Jaune";
		tabColor[3] = "Bleu";
		tabColor[4] = "Orange";
		
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
		//System.out.println(tabNb[0]+" "+tabNb[1]+" "+tabNb[2]+" "+tabNb[3]+" "+tabNb[4]);
		
		for (int i=0;i<tabNb.length;i++)
		{
			if (i>0)
			{
				for (int j=0;j<tabNb.length;j++)
				{
					if (j>0)
					{
						if(tabNb[j] > tabNb[j-1])
						{
							nb = tabNb[j-1];
							tabNb[j-1] = tabNb[j];
							tabNb[j] = nb;
							color = tabColor[j-1];
							tabColor[j-1] = tabColor[j];
							tabColor[j] = color;
						}
					}
				}
			}
		}
		if(tabColor[0].equals(first) && tabNb[0]==tabNb[1])
		{
			System.out.println(tabColor[0]+" "+tabColor[1]);
		}else if(tabColor[1].equals(first) && tabNb[0]==tabNb[1])
		{
			System.out.println(tabColor[1]+" "+tabColor[0]);
		}
		else
		{	
			System.out.println(tabColor[0]+" "+tabColor[1]);
		}
	}
}
