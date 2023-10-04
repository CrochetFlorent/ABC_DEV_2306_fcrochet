package Robot2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Interface extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	static Robot robot;
	private Image image;
	private Graphics graphics;
	private JFrame frame;
	private JFrame move;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

					Interface frame = new Interface();
	}
	/**
	 * Create the frames.
	 */
	public Interface() {
		move = new JFrame();
		move.setBounds(100,100,450,300);
		move.setVisible(true);
		move.setBackground(Color.cyan);
		move.setTitle("Déplacements du robot");
		move.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		robot = new Robot(new Point(200,200),50,50,false,new Box(200,200,0,0,Color.green,0));
		
		frame = new JFrame();
		frame.setTitle("Contrôle du robot");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		frame.setResizable (false);
		
		JPanel contentPane = new JPanel();
		frame.setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(null);
		
		textField = new JTextField("x");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(102, 55, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("y");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(236, 55, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField("Vitesse");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(102, 96, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField("Angle");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBounds(236, 96, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Off");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(199, 148, 24, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("+15 Degrés");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(robot.getAngle()+15 <= 360)
					{
						robot.setAngle(robot.getAngle() + 15);
						textField_3.setText(""+robot.getAngle());
					}
			}
		});
		btnNewButton.setBounds(62, 127, 104, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("- 15 degrés");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(robot.getAngle()-15 >= -360)
					{
						robot.setAngle(robot.getAngle() - 15);
						textField_3.setText(""+robot.getAngle());
					}
			}
		});
		btnNewButton_1.setBounds(255, 127, 104, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Vitesse +1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot.setVitesse(robot.getVitesse()+1);
				textField_2.setText(""+robot.getVitesse());
			}
		});
		btnNewButton_2.setBounds(62, 170, 104, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Vitesse -1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot.setVitesse(robot.getVitesse()-1);
				textField_2.setText(""+robot.getVitesse());
			}
		});
		btnNewButton_3.setBounds(255, 170, 104, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Déplacement en avant");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot.marcher(1);
//				textField.setText(""+robot1.getPosX());
//				textField.setText(""+robot1.getPosY());
				textField.setText(""+robot.getPosX());
				textField_1.setText(""+robot.getPosY());
			}
		});
		btnNewButton_4.setBounds(23, 208, 176, 42);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Déplacement en arrière");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot.marcher(-1);
//				textField.setText(""+robot1.getPosX());
//				textField_1.setText(""+robot1.getPosY());
				textField.setText(""+robot.getPosX());
				textField_1.setText(""+robot.getPosY());
			}
		});
		btnNewButton_6.setBounds(224, 208, 176, 42);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Replacer");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot.marcher(0);
			}
		});
		btnNewButton_7.setBounds(318, 11, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_5 = new JButton("On / Off");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!robot.getOn()){
					robot.setOn();
					lblNewLabel.setText("On");
				}else {
					robot.setOff();
					lblNewLabel.setText("Off");
				}			
			}
		});
		btnNewButton_5.setBounds(165, 11, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("Abcisse");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(122, 40, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ordonnee");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBounds(254, 40, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vitesse");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBounds(129, 76, 59, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Angle");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setBounds(262, 79, 39, 14);
		contentPane.add(lblNewLabel_4);
		

	}

//	public void paint()
//	{
//		Graphics g = move.getGraphics();
//		image = createImage(this.getWidth(),this.getHeight());
//		graphics = image.getGraphics();
//		g.drawImage(image,0,0,this);
//
//		robot.draw(g);
//	}
//	public void paintComponent(Graphics g) {
//	    super.paintComponents(g);
//	    g.drawRect(200, 200, 50, 50);
//	}
	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar())
		{
		case 'z' : robot.setPos(robot.getPosX(),robot.getPosY()-5);repaint();
			break;
		case 'q' : robot.setPos(robot.getPosX()-5, robot.getPosY());repaint();
			break;
		case 'd' : robot.setPos(robot.getPosX()+5, robot.getPosY());repaint();
			break;
		case 's' : robot.setPos(robot.getPosX(), robot.getPosY()+5);repaint();
			break;
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
