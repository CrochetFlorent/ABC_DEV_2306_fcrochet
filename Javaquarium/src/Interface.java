import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTable;


public class Interface extends JFrame{

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
					frame.setResizable (false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	public Interface() throws InterruptedException, IOException
	{
		setTitle("Aquarium");

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 487);
		
		
			
			
			
		
			    };
	public void gestionTableau()
	{
		Aquarium monAquarium = new Aquarium();
		Object[][] data = new Object[30][7];
		String strAge;
		String strGeneration;
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
		String title[] = {"Nom","Race","Sexe","Age","Generation","Type","Reproduction"};
		JTable tableauPoissons = new JTable(data,title);
		
		getContentPane().add(tableauPoissons);
	}}

