package src;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Dice {

	public static void main(String[] args) throws IOException, ParseException {
		
		URL url = new URL("https://api.devoldere.net/polls/dice/");
		//Connexion au JSON
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setConnectTimeout(20000);
	    connection.setReadTimeout(20000);
	    connection.setDoInput(true);
	    connection.setRequestProperty ("Accept", "application/json");
		//Scan du JSON
	    String poll = "";
	    Scanner sc = new Scanner(url.openStream());
	    while(sc.hasNext()) {
	    	poll += sc.nextLine();
	    }
	    sc.close();
	    //Création du tableau JSON
	    JSONParser parser = new JSONParser();
	    JSONObject obj = (JSONObject) parser.parse(poll);
	    JSONArray values = (JSONArray) obj.get("results");
	    //Affichage des valeurs du tableau JSON
	    System.out.println(values);
	    gagnant(values);
	}
	
	public static void gagnant(JSONArray _array){	
		int pts1=0,pts2=0,pts3=0;//Variables pour compter les points
		boolean pirate = false;//Variable indiquant si il y a eu piratage
		
		for (int i=0;i<_array.size();i++){
				String values = _array.get(i).toString();
				String[] parts = values.split(" ");
				String part1 = parts[0];
				String part2 = parts[1];
				String part3 = parts[2];
				//Booleens qui testent les valeurs des lancés
				boolean case1 = Integer.parseInt(part2) == Integer.parseInt(part3) ;
				boolean case2 = Integer.parseInt(part2)+Integer.parseInt(part3) <=6 && Integer.parseInt(part1)+Integer.parseInt(part2) <= 10;
				boolean case3 = Integer.parseInt(part3)+Integer.parseInt(part3) < 10;
				//Booleen testant si il y a eu piratage
				boolean test = Integer.parseInt(part1)>3 || Integer.parseInt(part1)<1 || Integer.parseInt(part2)<1 || Integer.parseInt(part2)>6
						|| Integer.parseInt(part3)<1 ||Integer.parseInt(part3)>6;
					//Attribution des points en fonction du score et du numéro de joueur	
					if (case2){
								if(Integer.parseInt(part1)==1){
									pts1 = pts1 +1; 
								}
								else if(Integer.parseInt(part1)==2){
									pts2 = pts2 +1; 
								}
								else if(Integer.parseInt(part1)==3){
									pts3 = pts3 +1;
								}
					}
					else if (case3){	
								if(Integer.parseInt(part1)==1){
									pts1 = pts1 +3; 
								}
								else if(Integer.parseInt(part1)==2){
									pts2 = pts2 +3; 
								}
								else if(Integer.parseInt(part1)==3){
									pts3 = pts3 +3; 
								}
					}else if (case1){
								if(Integer.parseInt(part1)==1){
									pts1 = pts1 -2; 
									if(pts1 < 0)
									{
										pts1 = 0;
									}
								}
								else if(Integer.parseInt(part1)==2){
									pts2 = pts2 -2;
									if(pts2 < 0){
										pts2 = 0;
									}
								}
								else if(Integer.parseInt(part1)==3){
									pts3 = pts3 -2; 
									if(pts3 < 0){
										pts3 = 0;
									}
								}
					}
				//Si piratage on met le booleen à true
				if(test){
					pirate = true;
				}
	    }
		//On renvoie les points si pas piraté et "to investigate" sinon
		if (pirate){
			System.out.println("To investigate");
		}
		else if(!pirate){
			System.out.println(pts1+"/"+pts2+"/"+pts3);
	    }
	  }
}
