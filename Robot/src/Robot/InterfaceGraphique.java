package Robot;

import java.awt.event.*;
import javax.swing.*;

public class InterfaceGraphique {
	
	
	public void OuvrirInterfaceGraphique()
	{
		
	JFrame fen = new JFrame("Contrôle du robot");
	JPanel pan = new JPanel();
	JButton butAllumer = new JButton("Allumer");
	JButton butEteindre = new JButton("Eteindre");
	JButton butAvancer = new JButton("Avancer vite");
	JButton butArreter = new JButton("Avancer Doucement");
	JButton butTournerD = new JButton("Tourner à droite");
	JButton butTournerG = new JButton("Tourner à gauche");

	
	fen.setSize(400, 150);
	fen.setContentPane(pan);
	fen.getContentPane().add(butAllumer);
	fen.getContentPane().add(butEteindre);
	fen.getContentPane().add(butAvancer);
	fen.getContentPane().add(butTournerD);
	fen.getContentPane().add(butTournerG);
	fen.getContentPane().add(butArreter);
	
	Robot robot1 = new Robot();
	
	butAllumer.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			robot1.action(Bouton.ALLUMER);
		}
	});
	butEteindre.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			robot1.action(Bouton.ETEINDRE);
		}
	});
	butAvancer.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			robot1.action(Bouton.AVANCERVITE);
		}
	});
	butArreter.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			robot1.action(Bouton.AVANCERDOUCEMENT);
		}
	});
	butTournerD.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			robot1.action(Bouton.TOURNEADROITE);
		}
	});
	butTournerG.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			robot1.action(Bouton.TOURNEAGAUCHE);
		}
	});

	fen.setVisible(true);
	}
}
