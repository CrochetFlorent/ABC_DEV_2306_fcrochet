import java.net.HttpURLConnection;
import java.net.URL;
import org.json.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.*;
import java.util.Scanner;

public class Lire {

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

	    JSONParser parser = JSONParser();
	    JSONObject obj = (JSONObject) parser.parse(poll);
	    JSONArray values = (JSONArray) obj.get("results");
	    
	    System.out.println(values);
	    

	}

	private static JSONParser JSONParser() {
		// TODO Auto-generated method stub
		return null;
	}



}
