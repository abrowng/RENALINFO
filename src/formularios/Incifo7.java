package formularios;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Incifo7 extends JFrame {

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
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Incifo7 frame = new Incifo7();
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
	public Incifo7() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 653, 843);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProtocoloDeNecropsia = new JLabel("Protocolo de Necropsia expediente INCIFO");
		lblProtocoloDeNecropsia.setBackground(SystemColor.inactiveCaptionBorder);
		lblProtocoloDeNecropsia.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtocoloDeNecropsia.setBounds(23, 11, 533, 14);
		contentPane.add(lblProtocoloDeNecropsia);
		
		JLabel lblDelCadverDe = new JLabel("Del Cad\u00E1ver de:");
		lblDelCadverDe.setBounds(10, 47, 88, 14);
		contentPane.add(lblDelCadverDe);
		
		textField = new JTextField();
		textField.setBounds(105, 44, 290, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblRelacionadoConLa = new JLabel("relacionado con la ");
		lblRelacionadoConLa.setBounds(405, 47, 132, 14);
		contentPane.add(lblRelacionadoConLa);
		
		JLabel lblCarpetaDeInvestigacion = new JLabel("Carpeta de Investigacion numero");
		lblCarpetaDeInvestigacion.setBounds(10, 72, 211, 14);
		contentPane.add(lblCarpetaDeInvestigacion);
		
		textField_1 = new JTextField();
		textField_1.setBounds(231, 69, 206, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEdadAproximada = new JLabel("Edad aproximada");
		lblEdadAproximada.setBounds(447, 72, 116, 14);
		contentPane.add(lblEdadAproximada);
		
		textField_2 = new JTextField();
		textField_2.setBounds(566, 69, 54, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEstatura = new JLabel("Estatura:");
		lblEstatura.setBounds(10, 97, 62, 14);
		contentPane.add(lblEstatura);
		
		textField_3 = new JTextField();
		textField_3.setBounds(64, 94, 62, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPerimetroToracico = new JLabel("Perimetro Toracico:");
		lblPerimetroToracico.setBounds(159, 97, 134, 14);
		contentPane.add(lblPerimetroToracico);
		
		JLabel label = new JLabel("");
		label.setBounds(303, 97, 46, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("Perimetro Abdominal");
		lblNewLabel.setBounds(370, 97, 167, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Otras Medidas");
		lblNewLabel_1.setBounds(135, 122, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(289, 94, 62, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2 = new JLabel("Peso");
		lblNewLabel_2.setBounds(10, 122, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(566, 94, 54, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(53, 119, 62, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_3 = new JLabel("Hora de Inicio de la Necropsia");
		lblNewLabel_3.setBounds(350, 122, 172, 14);
		contentPane.add(lblNewLabel_3);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(231, 122, 106, 20);
		contentPane.add(editorPane);
		
		textField_7 = new JTextField();
		textField_7.setBounds(534, 119, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblSignosCadavericos = new JLabel("Signos Cadavericos");
		lblSignosCadavericos.setBounds(10, 160, 143, 14);
		contentPane.add(lblSignosCadavericos);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(166, 153, 454, 39);
		contentPane.add(editorPane_1);
		
		JLabel lblOtrosHallazgos = new JLabel("Otros Hallazgos");
		lblOtrosHallazgos.setBounds(10, 203, 95, 14);
		contentPane.add(lblOtrosHallazgos);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(144, 203, 476, 20);
		contentPane.add(editorPane_2);
		
		JLabel lblLesionesExternas = new JLabel("Lesiones Externas");
		lblLesionesExternas.setBounds(10, 228, 132, 14);
		contentPane.add(lblLesionesExternas);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBounds(144, 228, 476, 20);
		contentPane.add(editorPane_3);
		
		JLabel lblCraneo = new JLabel("Craneo");
		lblCraneo.setBounds(10, 260, 46, 14);
		contentPane.add(lblCraneo);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setBounds(83, 259, 537, 20);
		contentPane.add(editorPane_4);
		
		JLabel lblCuello = new JLabel("Cuello");
		lblCuello.setBounds(10, 285, 46, 14);
		contentPane.add(lblCuello);
		
		JEditorPane editorPane_5 = new JEditorPane();
		editorPane_5.setBounds(92, 285, 528, 20);
		contentPane.add(editorPane_5);
		
		JLabel lblTorax = new JLabel("Torax");
		lblTorax.setBounds(10, 327, 46, 14);
		contentPane.add(lblTorax);
		
		JEditorPane editorPane_6 = new JEditorPane();
		editorPane_6.setBounds(92, 310, 528, 63);
		contentPane.add(editorPane_6);
		
		JLabel lblAbdomen = new JLabel("Abdomen");
		lblAbdomen.setBounds(10, 401, 63, 14);
		contentPane.add(lblAbdomen);
		
		JEditorPane editorPane_7 = new JEditorPane();
		editorPane_7.setBounds(102, 384, 518, 51);
		contentPane.add(editorPane_7);
		
		JLabel lblPelvis = new JLabel("Pelvis");
		lblPelvis.setBounds(10, 450, 46, 14);
		contentPane.add(lblPelvis);
		
		JEditorPane editorPane_8 = new JEditorPane();
		editorPane_8.setBounds(92, 446, 528, 51);
		contentPane.add(editorPane_8);
		
		JLabel lblEstudioSolicitado = new JLabel("Estudio Solicitado");
		lblEstudioSolicitado.setBounds(10, 520, 106, 14);
		contentPane.add(lblEstudioSolicitado);
		
		JEditorPane editorPane_9 = new JEditorPane();
		editorPane_9.setBounds(122, 508, 498, 48);
		contentPane.add(editorPane_9);
		
		JLabel lblCausaDeMuerte = new JLabel("Causa de Muerte (Conclusiones)");
		lblCausaDeMuerte.setBounds(10, 567, 194, 14);
		contentPane.add(lblCausaDeMuerte);
		
		JEditorPane editorPane_10 = new JEditorPane();
		editorPane_10.setBounds(205, 561, 415, 48);
		contentPane.add(editorPane_10);
		
		JLabel lblHoraDeConclusion = new JLabel("Hora de  Conclusion de la Necropsia");
		lblHoraDeConclusion.setBounds(10, 620, 199, 14);
		contentPane.add(lblHoraDeConclusion);
		
		textField_8 = new JTextField();
		textField_8.setBounds(215, 620, 106, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha necropsia");
		lblNewLabel_4.setBounds(331, 620, 122, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre de los medicos firmantes");
		lblNewLabel_5.setBounds(10, 648, 194, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre del tecnico de la necropsia");
		lblNewLabel_6.setBounds(10, 673, 224, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_9 = new JTextField();
		textField_9.setBounds(457, 617, 152, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(235, 645, 385, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(235, 670, 385, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(531, 715, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("CANCELAR ");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(422, 715, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Incifo7.class.getResource("/imagenes/inc4.PNG")));
		label_1.setBounds(548, 11, 46, 50);
		contentPane.add(label_1);
	}
}
