package Robot2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InterfaceGraphique {


	public void OuvrirInterfaceGraphique()
	{
		Robot robot1 = new Robot(new Point (0,0),0);
		
		JFrame fen = new JFrame("Contrôle du robot");
		JPanel pan = new JPanel();
		
		JLabel posX = new JLabel("x = "+robot1.getPosX()+",");
		JLabel posY = new JLabel("y = "+robot1.getPosY()+",");
		JLabel angle = new JLabel("Angle : " + robot1.getAngle()+",");
		JLabel vitesse = new JLabel("Vitesse : "+robot1.getVitesse());
		
		JRadioButton On = new JRadioButton("ON", false);
		JButton marcher = new JButton("Marcher");
		JButton setAnglePlus = new JButton("+ 15 dégrés");
		JButton setAngleMoins = new JButton("- 15 dégrés");
		JButton setVitessePlus= new JButton("Augmenter vitesse");
		JButton setVitesseMoins= new JButton("Diminuer vitesse");
		
		
		fen.setSize(350, 200);
		fen.setContentPane(pan);
		fen.getContentPane().add(posX);
		fen.getContentPane().add(posY);
		fen.getContentPane().add(angle);
		fen.getContentPane().add(vitesse);
		fen.getContentPane().add(setAnglePlus);
		fen.getContentPane().add(setAngleMoins);
		fen.getContentPane().add(marcher);
		fen.getContentPane().add(On);
		fen.getContentPane().add(setVitessePlus);
		fen.getContentPane().add(setVitesseMoins);

	setAnglePlus.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(robot1.getAngle()>=0 && robot1.getAngle() <= 360)
			{
			robot1.setAngle(robot1.getAngle()+15);
			angle.setText("Angle : " + robot1.getAngle());
			}
		}
	});
	setAngleMoins.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(robot1.getAngle()>=0 && robot1.getAngle() <= 360)
			{
			robot1.setAngle(robot1.getAngle()-15);
			angle.setText("Angle : " + robot1.getAngle());
			}
		}
	});
	marcher.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			robot1.marcher(robot1.getAngle());
			posX.setText("X : " + robot1.getPosX());
			posY.setText("Y : " + robot1.getPosY());
			
		}
	});
	On.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(On.isSelected())
			{
				robot1.setOn();
			}
			else if(!On.isSelected())
			{
				robot1.setOff();
			}
		}
	});
	setVitessePlus.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			robot1.setVitesse(robot1.getVitesse()+1);
		}
	});
	setVitesseMoins.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			robot1.setVitesse(robot1.getVitesse()-1);
		}
	});
	fen.setVisible(true);
	}
}
