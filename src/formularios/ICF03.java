package formularios;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;

public class ICF03 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ICF03 frame = new ICF03();
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
	public ICF03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 551);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExpIncifoNum = new JLabel("Exp. INCIFO Num.:");
		lblExpIncifoNum.setBounds(137, 11, 128, 14);
		contentPane.add(lblExpIncifoNum);
		
		JLabel lblRegistroEscuelaNum = new JLabel("Registro Escuela Num.:");
		lblRegistroEscuelaNum.setBounds(133, 36, 155, 14);
		contentPane.add(lblRegistroEscuelaNum);
		
		JLabel lblRecibiDeLa = new JLabel("Recibi de la Jefatura de la Unidad Departamental de Relaciones Publicas del Instituto de Ciencias Forenses; en base al convenio para utilizacion de cadaveres con fines de ense\u00F1anza correspondiente, el cadaver de:");
		lblRecibiDeLa.setBounds(10, 72, 414, 14);
		contentPane.add(lblRecibiDeLa);
		
		textField = new JTextField();
		textField.setBounds(10, 113, 414, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblQueIngresoA = new JLabel("que ingreso a esta Institucion el dia");
		lblQueIngresoA.setBounds(10, 152, 216, 14);
		contentPane.add(lblQueIngresoA);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 149, 233, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRelacionadoConLa = new JLabel("relacionado con la Carpeta de Investigacion num.:");
		lblRelacionadoConLa.setBounds(10, 173, 327, 14);
		contentPane.add(lblRelacionadoConLa);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 187, 414, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblYElExpediente = new JLabel("y el expediente INCIFO citado al rubro.");
		lblYElExpediente.setBounds(10, 211, 250, 14);
		contentPane.add(lblYElExpediente);
		
		JLabel lblExpongoQueRecibo = new JLabel("Expongo que recibo el citado cadaver en representacion de  ");
		lblExpongoQueRecibo.setBounds(10, 236, 369, 14);
		contentPane.add(lblExpongoQueRecibo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 252, 414, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblConDomicilioEn = new JLabel("con domicilio en");
		lblConDomicilioEn.setBounds(10, 277, 114, 14);
		contentPane.add(lblConDomicilioEn);
		
		textField_4 = new JTextField();
		textField_4.setBounds(208, 274, 327, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAsiComoLa = new JLabel("asi como la documentacion correspondiente para efectuar los tramites de inhumacion en caso de no ser identificados en el termino establecido.");
		lblAsiComoLa.setBackground(SystemColor.inactiveCaptionBorder);
		lblAsiComoLa.setBounds(10, 298, 560, 14);
		contentPane.add(lblAsiComoLa);
		
		JLabel lblCiudadDeMexico = new JLabel("Ciudad de Mexico, a");
		lblCiudadDeMexico.setBounds(85, 323, 114, 14);
		contentPane.add(lblCiudadDeMexico);
		
		textField_5 = new JTextField();
		textField_5.setBounds(236, 323, 233, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblRecibiauxiliarForense = new JLabel("RECIBI (AUXILIAR FORENSE)");
		lblRecibiauxiliarForense.setBounds(10, 376, 189, 14);
		contentPane.add(lblRecibiauxiliarForense);
		
		JLabel lblPersonalDeLa = new JLabel("PERSONAL DE LA INSTITUCION EDUCATIVA");
		lblPersonalDeLa.setBounds(10, 407, 255, 14);
		contentPane.add(lblPersonalDeLa);
		
		JLabel lblPersonalDeLa_1 = new JLabel("PERSONAL DE LA OFICINA DE RELACIONES PUBLICAS");
		lblPersonalDeLa_1.setBounds(10, 439, 302, 14);
		contentPane.add(lblPersonalDeLa_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(354, 404, 219, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(354, 436, 219, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(354, 373, 164, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(270, 6, 131, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(291, 33, 133, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(380, 489, 114, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(237, 489, 114, 23);
		contentPane.add(btnCancelar);
	}

}
