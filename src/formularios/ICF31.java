package formularios;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class ICF31 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblEntregaDeExpediente;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ICF31 frame = new ICF31();
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
	public ICF31() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 848);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(5, 5, 69, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(55, 2, 266, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNoDeExpediente = new JLabel("No. de Expediente:");
		lblNoDeExpediente.setBounds(331, 5, 106, 14);
		contentPane.add(lblNoDeExpediente);
		
		textField_1 = new JTextField();
		textField_1.setBounds(447, 2, 112, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombreCorrecto = new JLabel("Nombre Correcto:");
		lblNombreCorrecto.setBounds(5, 33, 148, 14);
		contentPane.add(lblNombreCorrecto);
		
		textField_2 = new JTextField();
		textField_2.setBounds(163, 33, 445, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxFormatoSmfContenido = new JCheckBox("Formato SMF-31 Contenido de Expediente.");
		chckbxFormatoSmfContenido.setBounds(5, 57, 289, 23);
		contentPane.add(chckbxFormatoSmfContenido);
		
		JCheckBox chckbxSolicitudDePrctica = new JCheckBox("Solicitud de pr\u00E1ctica de la necropsia");
		chckbxSolicitudDePrctica.setBounds(5, 83, 230, 23);
		contentPane.add(chckbxSolicitudDePrctica);
		
		JCheckBox chckbxOficioDeEntrega = new JCheckBox("Oficio de entrega de cadaver a los familiares, girado por el Ministerio Publico (en su caso).");
		chckbxOficioDeEntrega.setBounds(5, 109, 489, 23);
		contentPane.add(chckbxOficioDeEntrega);
		
		JCheckBox chckbxCopiaCertificadaDe = new JCheckBox("Copia certificada de las actuaciones de la averiguacion previa.");
		chckbxCopiaCertificadaDe.setBounds(5, 135, 445, 23);
		contentPane.add(chckbxCopiaCertificadaDe);
		
		JCheckBox chckbxActaMedicaExpedida = new JCheckBox("Acta medica expedida por el medico lesgista de la agencia del ministerio publico correspndiente.");
		chckbxActaMedicaExpedida.setBounds(5, 161, 500, 23);
		contentPane.add(chckbxActaMedicaExpedida);
		
		JCheckBox chckbxHistoriaClinicaen = new JCheckBox("Historia clinica (en su caso).");
		chckbxHistoriaClinicaen.setBounds(5, 187, 199, 23);
		contentPane.add(chckbxHistoriaClinicaen);
		
		lblEntregaDeExpediente = new JLabel("ENTREGA DE EXPEDIENTE AL PERITO MEDICO PRACTICANTE DE LA NECROPSIA");
		lblEntregaDeExpediente.setBackground(Color.BLUE);
		lblEntregaDeExpediente.setForeground(Color.BLUE);
		lblEntregaDeExpediente.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntregaDeExpediente.setBounds(5, 217, 549, 28);
		contentPane.add(lblEntregaDeExpediente);
		
		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setBounds(15, 256, 40, 14);
		contentPane.add(lblFecha);
		
		JLabel lblFechaYHora = new JLabel("FECHA Y HORA DE RECEPCION DEL PERSONAL PARA TRANSCRIPCION");
		lblFechaYHora.setBounds(15, 284, 394, 14);
		contentPane.add(lblFechaYHora);
		
		JLabel lblNombreYFirma_1 = new JLabel("NOMBRE Y FIRMA DE RECIBO");
		lblNombreYFirma_1.setBounds(15, 309, 176, 14);
		contentPane.add(lblNombreYFirma_1);
		
		JCheckBox chckbxF = new JCheckBox("Formato SMF-07 Manuscrito del protocolo de la necropsia.");
		chckbxF.setBounds(5, 362, 316, 23);
		contentPane.add(chckbxF);
		
		JCheckBox chckbxProtocoloDeNecropsia = new JCheckBox("Protocolo de necropsia capturado, revisado y firmado por los peritos medicos.");
		chckbxProtocoloDeNecropsia.setBounds(5, 388, 404, 23);
		contentPane.add(chckbxProtocoloDeNecropsia);
		
		JCheckBox chckbxResultadosDeLos = new JCheckBox("Resultados de los estudios de laboratorio (en su caso, al reverso).");
		chckbxResultadosDeLos.setBounds(5, 414, 392, 23);
		contentPane.add(chckbxResultadosDeLos);
		
		JCheckBox chckbxFormatoSmfAmpliacion = new JCheckBox("Formato SMF-35 Ampliacion de Necropsia (en su caso).");
		chckbxFormatoSmfAmpliacion.setBounds(5, 440, 392, 23);
		contentPane.add(chckbxFormatoSmfAmpliacion);
		
		JCheckBox chckbxFormatoSmfRecibo = new JCheckBox("Formato SMF-08 Recibo de cadaver (en su caso).");
		chckbxFormatoSmfRecibo.setBounds(5, 466, 401, 23);
		contentPane.add(chckbxFormatoSmfRecibo);
		
		JCheckBox chckbxCopiaFotostaticaSimple = new JCheckBox("Copia fotostatica simple de las identificaciones de los familiares.");
		chckbxCopiaFotostaticaSimple.setBounds(5, 492, 401, 23);
		contentPane.add(chckbxCopiaFotostaticaSimple);
		
		JCheckBox chckbxCopiaDelCertificado = new JCheckBox("Copia del certificado de defuncion.");
		chckbxCopiaDelCertificado.setBounds(5, 518, 348, 23);
		contentPane.add(chckbxCopiaDelCertificado);
		
		JCheckBox chckbxFichaDecadactilarCedula = new JCheckBox("Ficha decadactilar, cedula somatologica, odontograma,  ficha fotografica de se\u00F1as particulares (en su caso).");
		chckbxFichaDecadactilarCedula.setBounds(5, 544, 560, 23);
		contentPane.add(chckbxFichaDecadactilarCedula);
		
		JCheckBox chckbxEnElCaso = new JCheckBox("En el caso de cadaveres desconocidos, que hayan sido identificados, oficio de identificacion dirigido al Ministerio Publico por parte de la JUD de identificacion, para autorizar la entrega  del cadaver:");
		chckbxEnElCaso.setBounds(5, 570, 584, 23);
		contentPane.add(chckbxEnElCaso);
		
		JCheckBox chckbxReciboDeEnvio = new JCheckBox("Recibo de envio al panteon civil de Dolores en el caso de cadaveres no identificados o no reclamados por sus familiares.");
		chckbxReciboDeEnvio.setToolTipText("");
		chckbxReciboDeEnvio.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbxReciboDeEnvio.setBounds(5, 596, 584, 23);
		contentPane.add(chckbxReciboDeEnvio);
		
		JCheckBox chckbxFormatoSmfEnvio = new JCheckBox("Formato SMF-24 Envio de cadaver a las escuelas de medicina (en caso de haberlo requerido con fines de docencia).");
		chckbxFormatoSmfEnvio.setBounds(5, 622, 584, 23);
		contentPane.add(chckbxFormatoSmfEnvio);
		
		JCheckBox chckbxFormatoSmfRecibo_1 = new JCheckBox("Formato SMF-03 Recibo de cadaver (Universidades) a la escuela que lo requirio.");
		chckbxFormatoSmfRecibo_1.setBounds(5, 648, 584, 23);
		contentPane.add(chckbxFormatoSmfRecibo_1);
		
		JLabel lblNewLabel = new JLabel("Nombre de recepcion del perito");
		lblNewLabel.setBounds(189, 256, 178, 14);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(65, 253, 114, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(377, 250, 241, 20);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(429, 278, 167, 20);
		contentPane.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(227, 303, 207, 20);
		contentPane.add(textPane_2);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de entrega definitiva");
		lblNewLabel_1.setBounds(15, 333, 150, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(180, 330, 249, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(331, 703, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("GUARDAR");
		btnNewButton_1.setBounds(465, 703, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(ICF31.class.getResource("/imagenes/inc5.PNG")));
		label.setBounds(500, 61, 108, 131);
		contentPane.add(label);
	}
}
