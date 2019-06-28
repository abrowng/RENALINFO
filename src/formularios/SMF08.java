package formularios;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class SMF08 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblCausasDeLa;
	private JLabel lblNewLabel_4;
	private JTextField textField_5;
	private JLabel lblDatosGenerales;
	private JLabel lblLugarDeNacimeinto;
	private JTextField textField_6;
	private JLabel lblEdad;
	private JTextField textField_7;
	private JLabel lblEstadoCivil;
	private JTextField textField_8;
	private JLabel lblOcupacion;
	private JTextField textField_9;
	private JLabel lblDomicilio;
	private JTextField textField_10;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField textField_13;
	private JLabel lblNombreCorrecto;
	private JTextField textField_14;
	private JButton btnNewButton_1;
	private JButton btnSiguiente;
	private JButton btnCancelar;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMF08 frame = new SMF08();
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
	public SMF08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 597);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Num Exp:");
		lblNewLabel.setBounds(230, 14, 77, 14);
		
		JLabel lblNewLabel_1 = new JLabel("Num Certificado:");
		lblNewLabel_1.setBounds(230, 39, 107, 14);
		
		textField = new JTextField();
		textField.setBounds(408, 11, 127, 20);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(408, 36, 127, 20);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de ingreso del cadaver: ");
		lblNewLabel_2.setBounds(134, 65, 203, 14);
		
		textField_2 = new JTextField();
		textField_2.setBounds(347, 62, 188, 20);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setBounds(144, 90, 56, 20);
		
		textField_3 = new JTextField();
		textField_3.setBounds(248, 90, 287, 20);
		textField_3.setColumns(10);
		
		JLabel lblCarpetaDeInvestigacion = new JLabel("Carpeta de Investigacion:");
		lblCarpetaDeInvestigacion.setBounds(15, 124, 155, 14);
		
		textField_4 = new JTextField();
		textField_4.setBounds(257, 121, 205, 20);
		textField_4.setText("");
		textField_4.setColumns(10);
		
		lblCausasDeLa = new JLabel("Causas de la muerte");
		lblCausasDeLa.setBounds(15, 164, 143, 14);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(199, 149, 336, 39);
		
		lblNewLabel_4 = new JLabel("Perito que realizo la necropsia");
		lblNewLabel_4.setBounds(15, 199, 175, 14);
		
		textField_5 = new JTextField();
		textField_5.setBounds(200, 199, 335, 20);
		textField_5.setColumns(10);
		
		lblDatosGenerales = new JLabel("DATOS GENERALES");
		lblDatosGenerales.setBounds(230, 230, 138, 14);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textField);
		contentPane.add(textField_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(textField_2);
		contentPane.add(lblNewLabel_3);
		contentPane.add(textField_3);
		contentPane.add(lblCarpetaDeInvestigacion);
		contentPane.add(textField_4);
		contentPane.add(lblCausasDeLa);
		contentPane.add(editorPane);
		contentPane.add(lblNewLabel_4);
		contentPane.add(textField_5);
		contentPane.add(lblDatosGenerales);
		
		lblLugarDeNacimeinto = new JLabel("Lugar de Nacimiento");
		lblLugarDeNacimeinto.setBounds(15, 248, 143, 14);
		lblLugarDeNacimeinto.setToolTipText("");
		contentPane.add(lblLugarDeNacimeinto);
		
		textField_6 = new JTextField();
		textField_6.setBounds(158, 245, 377, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(15, 284, 34, 14);
		contentPane.add(lblEdad);
		
		textField_7 = new JTextField();
		textField_7.setBounds(53, 281, 71, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		lblEstadoCivil = new JLabel("Estado Civil");
		lblEstadoCivil.setBounds(134, 284, 71, 14);
		contentPane.add(lblEstadoCivil);
		
		textField_8 = new JTextField();
		textField_8.setBounds(221, 281, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		lblOcupacion = new JLabel("Ocupacion");
		lblOcupacion.setBounds(312, 284, 77, 14);
		contentPane.add(lblOcupacion);
		
		textField_9 = new JTextField();
		textField_9.setBounds(392, 276, 143, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setBounds(15, 309, 56, 14);
		contentPane.add(lblDomicilio);
		
		textField_10 = new JTextField();
		textField_10.setBounds(117, 306, 418, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Nombre Padre");
		lblNewLabel_5.setBounds(15, 348, 133, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Nombre Madre");
		lblNewLabel_6.setBounds(15, 383, 133, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_11 = new JTextField();
		textField_11.setBounds(158, 345, 377, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(158, 380, 377, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		lblNewLabel_7 = new JLabel("IDENTIFICACION");
		lblNewLabel_7.setBounds(257, 411, 107, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Fecha Egreso");
		lblNewLabel_8.setBounds(15, 439, 133, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_13 = new JTextField();
		textField_13.setBounds(162, 436, 202, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		lblNombreCorrecto = new JLabel("Nombre Correcto");
		lblNombreCorrecto.setBounds(15, 474, 143, 14);
		contentPane.add(lblNombreCorrecto);
		
		textField_14 = new JTextField();
		textField_14.setBounds(166, 467, 202, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		btnNewButton_1 = new JButton("GUARDAR");
		btnNewButton_1.setBounds(295, 510, 111, 23);
		contentPane.add(btnNewButton_1);
		
		btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setBounds(427, 510, 108, 23);
		contentPane.add(btnSiguiente);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
				new frmRP().setVisible(true);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnCancelar.setBounds(144, 510, 111, 23);
		contentPane.add(btnCancelar);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(SMF08.class.getResource("/imagenes/logo_INCIFO.png")));
		label.setBounds(1, 0, 133, 119);
		contentPane.add(label);
	}
}
