package Robot2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Interface() {
		setTitle("Contrôle du robot");
		Robot robot1 = new Robot(new Point(0,0),0,0,false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
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
					if(robot1.getAngle()+15 <= 360)
					{
						robot1.setAngle(robot1.getAngle() + 15);
						textField_3.setText(""+robot1.getAngle());
					}
			}
		});
		btnNewButton.setBounds(62, 127, 104, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("- 15 degrés");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(robot1.getAngle()-15 >= -360)
					{
						robot1.setAngle(robot1.getAngle() - 15);
						textField_3.setText(""+robot1.getAngle());
					}
			}
		});
		btnNewButton_1.setBounds(255, 127, 104, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Vitesse +1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.setVitesse(robot1.getVitesse()+1);
				textField_2.setText(""+robot1.getVitesse());
			}
		});
		btnNewButton_2.setBounds(62, 170, 104, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Vitesse -1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.setVitesse(robot1.getVitesse()-1);
				textField_2.setText(""+robot1.getVitesse());
			}
		});
		btnNewButton_3.setBounds(255, 170, 104, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Déplacement en avant");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.marcher(1);
				textField.setText(""+robot1.getPosX());
				textField_1.setText(""+robot1.getPosY());
			}
		});
		btnNewButton_4.setBounds(23, 208, 151, 42);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("On / Off");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!robot1.getOn()){
					robot1.setOn();
					lblNewLabel.setText("On");
				}else {
					robot1.setOff();
					lblNewLabel.setText("Off");
				}			
			}
		});
		btnNewButton_5.setBounds(165, 11, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Déplacemen en arrière");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.marcher(-1);
				textField.setText(""+robot1.getPosX());
				textField_1.setText(""+robot1.getPosY());
			}
		});
		btnNewButton_6.setBounds(249, 208, 151, 42);
		contentPane.add(btnNewButton_6);
		
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
}
