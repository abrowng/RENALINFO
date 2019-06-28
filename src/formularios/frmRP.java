package formularios;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmRP extends JFrame {

	private JPanel contentPane;
	final SMF08 window5=new SMF08();
	final ICF31 window6=new ICF31();
	final ICF03 window7=new ICF03();
	final ICF24 window8=new ICF24();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRP frame = new frmRP();
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
	public frmRP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Llenar Formato SMF-08");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window5.setVisible(true);
				dispose();
				
			}
			
		});
		btnNewButton.setBounds(36, 45, 180, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Llenar Formato ICF-31");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window6.setVisible(true);
				dispose();	
			}
			});
		
		btnNewButton_1.setBounds(36, 96, 180, 23);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("Generar Formato ICF-24");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window8.setVisible(true);
				dispose();	
			}
		});
		btnNewButton_2.setBounds(36, 149, 180, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Generar Formato ICF-03");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window7.setVisible(true);
				dispose();	
			}
		});
		
		btnNewButton_3.setBounds(36, 208, 180, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Regresar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
				new frmBienvenida().setVisible(true);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_4.setBounds(318, 241, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
