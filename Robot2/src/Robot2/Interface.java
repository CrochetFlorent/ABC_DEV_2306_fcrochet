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
		Robot robot1 = new Robot(new Point(0,0),0);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(62, 45, 123, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 45, 123, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 82, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(225, 82, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("+15 Degrés");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.setAngle(robot1.getAngle() + 15);
				textField_3.setText(""+robot1.getAngle());
			}
		});
		btnNewButton.setBounds(62, 127, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("- 15 degrés");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.setAngle(robot1.getAngle() - 15);
				textField_3.setText(""+robot1.getAngle());
			}
		});
		btnNewButton_1.setBounds(270, 127, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Vitesse +1");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.setVitesse(robot1.getVitesse() +1);
				textField_2.setText(""+robot1.getVitesse());
			}
		});
		btnNewButton_2.setBounds(62, 170, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Vitesse -1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.setVitesse(robot1.getVitesse() -1);
				textField_2.setText(""+robot1.getVitesse());
			}
		});
		btnNewButton_3.setBounds(270, 170, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Déplacement");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.marcher(robot1.getAngle());
				textField.setText(""+robot1.getPosX());
				textField_1.setText(""+robot1.getPosY());
			}
		});
		btnNewButton_4.setBounds(165, 208, 95, 42);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("On / Off");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!robot1.getOn()){
					robot1.setOn();
				}else {
					robot1.setOff();
				}
				
			}
		});
		btnNewButton_5.setBounds(165, 11, 89, 23);
		contentPane.add(btnNewButton_5);
	}
}
