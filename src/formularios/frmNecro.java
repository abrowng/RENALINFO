package formularios;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class frmNecro extends JFrame {

	private JPanel contentPane;
	final Incifo7 window9=new Incifo7();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmNecro frame = new frmNecro(null);
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
	public frmNecro(JFrame parent) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(parent);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIncifo = new JButton("formato INCIFO-7");
		btnIncifo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window9.setVisible(true);
				dispose();
				
				
			}
		});
		btnIncifo.setBounds(28, 56, 168, 30);
		contentPane.add(btnIncifo);
		
		JButton btnAmpliacionDeNecropsia = new JButton("Ampliacion de Necropsia");
		btnAmpliacionDeNecropsia.setBounds(28, 97, 168, 30);
		contentPane.add(btnAmpliacionDeNecropsia);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				parent.setVisible(true);
		 
			}
		});
		btnRegresar.setBounds(321, 212, 89, 23);
		contentPane.add(btnRegresar);
	}
}
