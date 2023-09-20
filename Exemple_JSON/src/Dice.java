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
		
		URL url = new URL("https://api.devoldere.net/polls/dice/");//Création d'une url de type url
//Try/catch permet de tester s'il y a une erreur de manière à ce que le programme ne plante pas
		try {//Connexion au JSON(puisque c'est une page web)
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(20000);
		    connection.setReadTimeout(20000);
		    connection.setDoInput(true);
		    connection.setRequestProperty ("Accept", "application/json");}
	    catch (Error e){System.out.println("Problème de connexion");}
		//Scan du JSON
	    String poll = "";
	    Scanner sc = new Scanner(url.openStream());
	    while(sc.hasNext()) {poll += sc.nextLine();}
	    sc.close();
//Création du tableau JSON
	    JSONParser parser = new JSONParser();
	    JSONObject obj = (JSONObject) parser.parse(poll);
	    JSONArray values = (JSONArray) obj.get("results");
//Affichage des valeurs du tableau JSON
	    System.out.println(values);
	    gagnant(values);}
	
	public static void gagnant(JSONArray _array){	
		int pts1=0,pts2=0,pts3=0;//Variables pour compter les points
		boolean pirate = false;//Variable indiquant si il y a eu piratage
		
		for (int i=0;i<_array.size();i++){
				String values = _array.get(i).toString();//Une variable String prend les valeur de chaque lancé(de deux dés) 1 par 1 et du numéro du joueur
				String[] parts = values.split(" ");//On la casse en trois parties : numéro , dé 1 , dé 2, délimitées de base par des espaces
				String part1 = parts[0];//Voila
				String part2 = parts[1];//les
				String part3 = parts[2];//3 parties
		//Booleens qui testent les valeurs des lancés
				boolean case1 = Integer.parseInt(part2) == Integer.parseInt(part3) ;//parseInt prend les valeures entière d'une string
				boolean case2 = Integer.parseInt(part2)+Integer.parseInt(part3) <=6 && Integer.parseInt(part1)+Integer.parseInt(part2) <= 10;
				boolean case3 = Integer.parseInt(part3)+Integer.parseInt(part3) < 10;
		//Booleen testant si il y a eu piratage : si un numéro de joeurs dépasse trois ou si un dé vaut moins que 1 ou plus que 6
				boolean test = Integer.parseInt(part1)>3 || Integer.parseInt(part1)<1 || Integer.parseInt(part2)<1 || Integer.parseInt(part2)>6
						|| Integer.parseInt(part3)<1 ||Integer.parseInt(part3)>6;
		//Attribution des points en fonction du score et du numéro de joueur, selon les cas(case1,case2,case3) déclarés plus haut	
						 if (case2){if(Integer.parseInt(part1)==1){pts1 = pts1 +1; }
									else if(Integer.parseInt(part1)==2){pts2 = pts2 +1; }
									else if(Integer.parseInt(part1)==3){pts3 = pts3 +1;}}
					else if (case3){if(Integer.parseInt(part1)==1){pts1 = pts1 +3; }
									else if(Integer.parseInt(part1)==2){pts2 = pts2 +3; }
									else if(Integer.parseInt(part1)==3){pts3 = pts3 +3; }}
					else if (case1){if(Integer.parseInt(part1)==1){pts1 = pts1 -2; 
										if(pts1 < 0){pts1 = 0;}}
									else if(Integer.parseInt(part1)==2){pts2 = pts2 -2;
										if(pts2 < 0){pts2 = 0;}}
									else if(Integer.parseInt(part1)==3){pts3 = pts3 -2; 
										if(pts3 < 0){pts3 = 0;}}}
				//Si piratage on met le booleen à true
				if(test){pirate = true;}}
		//On renvoie "to investigate" si piraté et les points des joueurs sinon
		if (pirate){System.out.println("To investigate");}
		else if(!pirate){System.out.println(pts1+"/"+pts2+"/"+pts3);}}}