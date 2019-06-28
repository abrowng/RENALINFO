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

public class ICF24 extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ICF24 frame = new ICF24();
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
	public ICF24() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 510);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExpIncifoNum = new JLabel("Exp. INCIFO Num.:");
		lblExpIncifoNum.setBounds(177, 11, 111, 14);
		contentPane.add(lblExpIncifoNum);
		
		textField = new JTextField();
		textField.setBounds(298, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMxicoDfA = new JLabel("M\u00E9xico D.F. a");
		lblMxicoDfA.setBounds(77, 34, 86, 14);
		contentPane.add(lblMxicoDfA);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 31, 211, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombreDelTitular = new JLabel("NOMBRE DEL TITULAR");
		lblNombreDelTitular.setBounds(23, 58, 140, 14);
		contentPane.add(lblNombreDelTitular);
		
		JLabel lblDirectorDelInstituto = new JLabel("DIRECTOR DEL INSTITUTO DE CIENCIAS FORENSES");
		lblDirectorDelInstituto.setBounds(23, 76, 323, 14);
		contentPane.add(lblDirectorDelInstituto);
		
		JLabel lblDelTribunalSuperior = new JLabel("DEL TRIBUNAL SUPERIOR DE JUSTICIA DEL");
		lblDelTribunalSuperior.setBounds(23, 93, 247, 14);
		contentPane.add(lblDelTribunalSuperior);
		
		JLabel lblDistritoFederal = new JLabel("DISTRITO FEDERAL.");
		lblDistritoFederal.setBounds(23, 112, 195, 14);
		contentPane.add(lblDistritoFederal);
		
		JLabel lblPresente = new JLabel("PRESENTE.");
		lblPresente.setBounds(23, 128, 163, 14);
		contentPane.add(lblPresente);
		
		JLabel lblConFundamentoEn = new JLabel("Con fundamento en el convenio para la utilizacion de cadaveres de personas desconocidas con fines de ense\u00F1anza, me permito con toda atencion informar a usted que el cadaver correspondiente a:");
		lblConFundamentoEn.setBounds(23, 170, 542, 14);
		contentPane.add(lblConFundamentoEn);
		
		textField_2 = new JTextField();
		textField_2.setBounds(23, 182, 361, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblConCarpetaDe = new JLabel("con Carpeta de Investigacion No.:");
		lblConCarpetaDe.setBounds(23, 207, 211, 14);
		contentPane.add(lblConCarpetaDe);
		
		textField_3 = new JTextField();
		textField_3.setBounds(260, 204, 186, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCuyaNecropsiaSe = new JLabel("cuya necropsia se practico el dia:");
		lblCuyaNecropsiaSe.setBounds(23, 232, 227, 14);
		contentPane.add(lblCuyaNecropsiaSe);
		
		textField_4 = new JTextField();
		textField_4.setBounds(260, 229, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblLoRequiero = new JLabel("lo requiero");
		lblLoRequiero.setBounds(23, 260, 89, 14);
		contentPane.add(lblLoRequiero);
		
		textField_5 = new JTextField();
		textField_5.setBounds(162, 257, 284, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(23, 285, 361, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblConCarpetaDe_1 = new JLabel("el dia");
		lblConCarpetaDe_1.setBounds(23, 316, 70, 14);
		contentPane.add(lblConCarpetaDe_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(66, 316, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblConRegNum = new JLabel("con Reg. Num.:");
		lblConRegNum.setBounds(162, 316, 86, 14);
		contentPane.add(lblConRegNum);
		
		textField_8 = new JTextField();
		textField_8.setBounds(259, 316, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblSinOtroParticular = new JLabel("Sin otro particular, reitero a usted la seguridad de mi atenta y distinguida consideracion.");
		lblSinOtroParticular.setBounds(23, 347, 513, 14);
		contentPane.add(lblSinOtroParticular);
		
		JLabel lblNombreYFirma = new JLabel("Nombre ");
		lblNombreYFirma.setBounds(23, 390, 116, 14);
		contentPane.add(lblNombreYFirma);
		
		textField_9 = new JTextField();
		textField_9.setBounds(190, 387, 155, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton = new JButton("GUARDAR");
		btnNewButton.setBounds(330, 437, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setBounds(199, 437, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
