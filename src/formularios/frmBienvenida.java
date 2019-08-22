package formularios;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class frmBienvenida extends JFrame {

	private JPanel contentPane;
	final frmRP window2=new frmRP(this);			// TODO Mover instancia al constructor
	final frmNecro window3=new frmNecro(this);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBienvenida frame = new frmBienvenida(null); 
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frmBienvenida(JFrame parent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		setLocationRelativeTo(parent);
		setTitle("INCIFO");
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("RELACIONES PUBLICAS");
		btnNewButton.setBounds(22, 50, 200, 25);
		btnNewButton.setBackground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NECROPSIA");
		btnNewButton_1.setBounds(22, 85, 200, 25);
		btnNewButton_1.setBackground(Color.WHITE);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("ANTROPOLOGIA");
		btnNewButton_2.setBounds(22, 120, 200, 25);
		btnNewButton_2.setBackground(Color.WHITE);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("TOXICOLOGIA");
		btnNewButton_3.setBounds(22, 155, 200, 25);
		btnNewButton_3.setBackground(Color.WHITE);
		contentPane.add(btnNewButton_3);
		
		JButton btnPatologa = new JButton("PATOLOGIA");
		btnPatologa.setBounds(22, 190, 200, 25);
		btnPatologa.setBackground(Color.WHITE);
		contentPane.add(btnPatologa);
		
		JButton btnOdontologa = new JButton("ODONTOLOGIA");
		btnOdontologa.setBounds(22, 225, 200, 25);
		btnOdontologa.setBackground(Color.WHITE);
		contentPane.add(btnOdontologa);
		
		JButton btnGentica = new JButton("GENETICA");
		btnGentica.setBounds(22, 260, 200, 25);
		btnGentica.setBackground(Color.WHITE);
		contentPane.add(btnGentica);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(frmBienvenida.class.getResource("/imagenes/inc8.png")));
		label.setBounds(95, 11, 332, 30);
		contentPane.add(label);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 
				 */
				window2.setVisible(true);
				
				setVisible(false);
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * 
				 */
				window3.setVisible(true);
				
				setVisible(false);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});
		btnPatologa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO
			}
		});
	}
}
