package formularios;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class SMF081 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMF081 frame = new SMF081();
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
	public SMF081() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 666);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(101, 257, 289, 20);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(511, 257, 134, 20);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(101, 288, 390, 20);
		contentPane.add(textPane_3);
		
		JCheckBox chckbxSi = new JCheckBox("si");
		chckbxSi.setBounds(227, 32, 37, 23);
		contentPane.add(chckbxSi);
		
		JCheckBox chckbxNo = new JCheckBox("no");
		chckbxNo.setBounds(266, 32, 51, 23);
		contentPane.add(chckbxNo);
		
		JCheckBox checkBox = new JCheckBox("si");
		checkBox.setBounds(225, 58, 37, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("si");
		checkBox_1.setBounds(227, 84, 37, 23);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("si");
		checkBox_2.setBounds(227, 108, 37, 23);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("si");
		checkBox_3.setBounds(227, 132, 37, 23);
		contentPane.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("si");
		checkBox_4.setBounds(227, 158, 37, 23);
		contentPane.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("no");
		checkBox_5.setBounds(266, 58, 51, 23);
		contentPane.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("no");
		checkBox_6.setBounds(266, 84, 51, 23);
		contentPane.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("no");
		checkBox_7.setBounds(266, 108, 51, 23);
		contentPane.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("no");
		checkBox_8.setBounds(266, 132, 51, 23);
		contentPane.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("no");
		checkBox_9.setBounds(266, 158, 51, 23);
		contentPane.add(checkBox_9);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(101, 319, 289, 20);
		contentPane.add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(511, 319, 134, 20);
		contentPane.add(textPane_5);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6.setBounds(101, 350, 390, 20);
		contentPane.add(textPane_6);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setBounds(101, 409, 400, 20);
		contentPane.add(textPane_7);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setBounds(149, 471, 289, 20);
		contentPane.add(textPane_8);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setBounds(539, 471, 106, 20);
		contentPane.add(textPane_9);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setBounds(146, 502, 486, 20);
		contentPane.add(textPane_10);
		
		JLabel lblDocumentosEntregadosA = new JLabel("Documentos Entregados a los Testigos de Identidad");
		lblDocumentosEntregadosA.setBounds(15, 11, 630, 14);
		lblDocumentosEntregadosA.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDocumentosEntregadosA);
		
		JLabel lblDocumentosEntregados = new JLabel("Documentos Entregados:");
		lblDocumentosEntregados.setBounds(0, 34, 219, 14);
		contentPane.add(lblDocumentosEntregados);
		
		JLabel lblSolicitudDePrctica = new JLabel("Solicitud de Pr\u00E1ctica de Necropsia:");
		lblSolicitudDePrctica.setBounds(0, 60, 219, 14);
		contentPane.add(lblSolicitudDePrctica);
		
		JLabel lblOficioDeEntrega = new JLabel("Oficio de Entrega de Cad\u00E1ver:");
		lblOficioDeEntrega.setBounds(5, 88, 219, 14);
		contentPane.add(lblOficioDeEntrega);
		
		JLabel lblActaMdica = new JLabel("Acta M\u00E9dica:");
		lblActaMdica.setBounds(0, 112, 219, 14);
		contentPane.add(lblActaMdica);
		
		JLabel lblCertificadoDeDefuncin = new JLabel("Certificado de defunci\u00F3n:");
		lblCertificadoDeDefuncin.setBounds(5, 136, 214, 14);
		contentPane.add(lblCertificadoDeDefuncin);
		
		JLabel lblConstanciaDeRefrigeracin = new JLabel("Constancia de Refrigeraci\u00F3n (en su caso):");
		lblConstanciaDeRefrigeracin.setBounds(5, 162, 219, 14);
		contentPane.add(lblConstanciaDeRefrigeracin);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(6, 191, 119, 14);
		contentPane.add(lblObservaciones);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(5, 257, 86, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(5, 288, 86, 14);
		contentPane.add(lblDomicilio);
		
		JLabel lblParentesco = new JLabel("Parentesco");
		lblParentesco.setBounds(400, 263, 101, 14);
		contentPane.add(lblParentesco);
		
		JLabel lblParentesco_1 = new JLabel("Parentesco:");
		lblParentesco_1.setBounds(400, 322, 101, 14);
		contentPane.add(lblParentesco_1);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(5, 322, 86, 14);
		contentPane.add(lblNombre_1);
		
		JLabel lblDomicilio_1 = new JLabel("Domicilio:");
		lblDomicilio_1.setBounds(5, 356, 86, 14);
		contentPane.add(lblDomicilio_1);
		
		JLabel lblPersonalDelIncifo = new JLabel("Personal del INCIFO Responsable de la Entrega");
		lblPersonalDelIncifo.setBounds(5, 381, 593, 14);
		contentPane.add(lblPersonalDelIncifo);
		
		JLabel lblFuneraria = new JLabel("Funeraria ");
		lblFuneraria.setBounds(5, 446, 640, 14);
		lblFuneraria.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblFuneraria);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la Funeraria:");
		lblNombreDeLa.setBounds(0, 477, 149, 14);
		contentPane.add(lblNombreDeLa);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(455, 471, 79, 14);
		contentPane.add(lblTelfono);
		
		JLabel lblDomicilio_2 = new JLabel("Domicilio:");
		lblDomicilio_2.setBounds(0, 508, 125, 14);
		contentPane.add(lblDomicilio_2);
		
		JLabel lblNombreDelGestor = new JLabel("Nombre del Gestor:");
		lblNombreDelGestor.setBounds(0, 538, 125, 14);
		contentPane.add(lblNombreDelGestor);
		
		textField = new JTextField();
		textField.setBounds(149, 533, 254, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(440, 162, -50, 11);
		contentPane.add(editorPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(135, 415, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setBounds(5, 415, 86, 14);
		contentPane.add(lblTurno);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(311, 593, 112, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(477, 593, 121, 23);
		contentPane.add(btnGuardar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(SMF081.class.getResource("/imagenes/inc3.PNG")));
		label.setBounds(475, 6, 170, 246);
		contentPane.add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(129, 187, 309, 59);
		contentPane.add(textPane);
	}
}
