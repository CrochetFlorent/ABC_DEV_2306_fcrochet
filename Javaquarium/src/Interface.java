import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JTable;


public class Interface extends JFrame{

	static Aquarium monAquarium; 
	static String[][] data = new String[30][7];
	static String strAge;
	static String strGeneration;

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();

					while(monAquarium.getArrayPoisson().size()>0 )
					{
						TimeUnit.SECONDS.sleep(2);
						monAquarium.passerLeTemps();
						gestionTableau();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	@SuppressWarnings("static-access")
	public Interface() throws InterruptedException, IOException
	{	
		JFrame fen = new JFrame("Aquarium");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setSize(600, 600);
		fen.setVisible(true);
		fen.setResizable (true);

		String title[] = {"Nom","Race","Sexe","Age","Generation","Type","Reproduction"};
		JTable tableauPoissons = new JTable(data,title);
		monAquarium = new Aquarium();
		fen.getContentPane().add(tableauPoissons, BorderLayout.CENTER);
	}
	
	public static void gestionTableau()
	{
		for (int i=0;i<monAquarium.getArrayPoisson().size();i++)
		{
				data[i][0]=monAquarium.getArrayPoisson().get(i).getNom();
				data[i][1]=monAquarium.getArrayPoisson().get(i).getRace();
				data[i][2]=monAquarium.getArrayPoisson().get(i).getSexe();
				strAge= ""+monAquarium.getArrayPoisson().get(i).getAge();
				data[i][3]=strAge;
				strGeneration =""+monAquarium.getArrayPoisson().get(i).getGeneration();
				data[i][4]=strGeneration;
				data[i][5] =monAquarium.getArrayPoisson().get(i).getType();
				if(monAquarium.getArrayPoisson().get(i).getReproduction())
				{
					data[i][6] ="Reproduit";
				}else
				{
					data[i][6] ="Pas reproduit";
				}
		}	

	}
}

