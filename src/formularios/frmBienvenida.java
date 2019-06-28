package formularios;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class frmBienvenida extends JFrame {

	private JPanel contentPane;
	final frmRP window2=new frmRP();
	final frmNecro window3=new frmNecro();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBienvenida frame = new frmBienvenida();
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
	public frmBienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 326);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("RELACIONES PUBLICAS");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window2.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(22, 52, 154, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("NECROPSIA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window3.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(22, 86, 154, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("ANTROPOLOGIA");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(22, 120, 154, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("TOXICOLOGIA");
		btnNewButton_3.setBounds(22, 159, 154, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnPatologa = new JButton("PATOLOGIA");
		btnPatologa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPatologa.setBounds(22, 193, 154, 23);
		contentPane.add(btnPatologa);
		
		JButton btnOdontologa = new JButton("ODONTOLOGIA");
		btnOdontologa.setBounds(22, 219, 154, 23);
		contentPane.add(btnOdontologa);
		
		JButton btnGentica = new JButton("GENETICA");
		btnGentica.setBounds(22, 253, 154, 23);
		contentPane.add(btnGentica);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(frmBienvenida.class.getResource("/imagenes/inc8.png")));
		label.setBounds(81, 11, 332, 30);
		contentPane.add(label);
	}
}
