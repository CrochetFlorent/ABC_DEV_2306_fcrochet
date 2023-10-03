import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class FaireVivreAquarium {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Aquarium monAquarium = new Aquarium();
		Interface monInterface = new Interface();
		monAquarium.passerLeTemps(monInterface);
	}
}
