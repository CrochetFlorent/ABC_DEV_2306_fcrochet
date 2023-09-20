package src;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
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
	    
	    
	}
	
	public void gagnant(JSONArray _array)
	{
		tab
		for (int i=0;i<_array.size();i++)
	    {
			for (int j=1;i<=3;j++)
			{
				_array.get(i).toString();
				
	    }
	}

}
