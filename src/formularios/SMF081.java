package formularios;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class SMF081 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMF081 frame = new SMF081(null);
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
	public SMF081(JFrame parent) {
		setTitle("SMF08-1");
		setSize(670, 675);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(parent);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panEntregados = new JPanel();
		panEntregados.setLayout(null);
		panEntregados.setBorder(BorderFactory.createTitledBorder("DOCUMENTOS ENTREGADOS A LOS TESTIGOS DE IDENTIDAD"));
		panEntregados.setBounds(0, 10, 650, 400);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(SMF081.class.getResource("/imagenes/inc3.PNG")));
		label.setBounds(475, 10, 170, 246);
		panEntregados.add(label);
		
		JLabel labDocsEntregados = new JLabel("Documento:");
		labDocsEntregados.setBounds(15, 30, 100, 20);
		
		JLabel labSi = new JLabel("Si");
		labSi.setBounds(330, 30, 40, 20);
		
		JLabel labNo = new JLabel("No");
		labNo.setBounds(360, 30, 40, 20);
		
		JLabel lblSolicitudDePrctica = new JLabel("Solicitud de Pr\u00E1ctica de Necropsia:");
		lblSolicitudDePrctica.setBounds(15, 60, 219, 20);
		panEntregados.add(lblSolicitudDePrctica);
		
		JLabel lblOficioDeEntrega = new JLabel("Oficio de Entrega de Cad\u00E1ver:");
		lblOficioDeEntrega.setBounds(15, 90, 219, 20);
		panEntregados.add(lblOficioDeEntrega);
		
		JLabel lblActaMdica = new JLabel("Acta M\u00E9dica:");
		lblActaMdica.setBounds(15, 120, 219, 20);
		panEntregados.add(lblActaMdica);
		
		JLabel lblCertificadoDeDefuncin = new JLabel("Certificado de defunci\u00F3n:");
		lblCertificadoDeDefuncin.setBounds(15, 150, 214, 20);
		panEntregados.add(lblCertificadoDeDefuncin);
		
		JLabel lblConstanciaDeRefrigeracin = new JLabel("Constancia de Refrigeraci\u00F3n (en su caso):");
		lblConstanciaDeRefrigeracin.setBounds(15, 180, 240, 20);
		panEntregados.add(lblConstanciaDeRefrigeracin);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(15, 210, 119, 20);
		panEntregados.add(lblObservaciones);
		
		JTextArea txtObservaciones = new JTextArea();
		txtObservaciones.setLineWrap(true);
		
		JScrollPane spObservaciones = new JScrollPane(txtObservaciones);
		spObservaciones.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		spObservaciones.setBounds(130, 210, 300, 40);
		
		JRadioButton rbSi_1 = new JRadioButton();
		rbSi_1.setBounds(330, 60, 30, 20);
		JRadioButton rbSi_2 = new JRadioButton();
		rbSi_2.setBounds(330, 90, 30, 20);
		JRadioButton rbSi_3 = new JRadioButton();
		rbSi_3.setBounds(330, 120, 30, 20);
		JRadioButton rbSi_4 = new JRadioButton();
		rbSi_4.setBounds(330, 150, 30, 20);
		JRadioButton rbSi_5 = new JRadioButton();
		rbSi_5.setBounds(330, 180, 30, 20);
		JRadioButton rbNo_1 = new JRadioButton();
		rbNo_1.setBounds(360, 60, 30, 20);
		JRadioButton rbNo_2 = new JRadioButton();
		rbNo_2.setBounds(360, 90, 30, 20);
		JRadioButton rbNo_3 = new JRadioButton();
		rbNo_3.setBounds(360, 120, 30, 20);
		JRadioButton rbNo_4 = new JRadioButton();
		rbNo_4.setBounds(360, 150, 30, 20);
		JRadioButton rbNo_5 = new JRadioButton();
		rbNo_5.setBounds(360, 180, 30, 20);
		
		ButtonGroup buttonGroup_1 = new ButtonGroup();
		buttonGroup_1.add(rbSi_1);
		buttonGroup_1.add(rbNo_1);
		ButtonGroup buttonGroup_2 = new ButtonGroup();
		buttonGroup_2.add(rbSi_2);
		buttonGroup_2.add(rbNo_2);
		ButtonGroup buttonGroup_3 = new ButtonGroup();
		buttonGroup_3.add(rbSi_3);
		buttonGroup_3.add(rbNo_3);
		ButtonGroup buttonGroup_4 = new ButtonGroup();
		buttonGroup_4.add(rbSi_4);
		buttonGroup_4.add(rbNo_4);
		ButtonGroup buttonGroup_5 = new ButtonGroup();
		buttonGroup_5.add(rbSi_5);
		buttonGroup_5.add(rbNo_5);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(15, 265, 86, 20);
		
		JTextField tfNombre = new JTextField();
		tfNombre.setBounds(90, 265, 280, 20);
		
		JLabel lblParentesco = new JLabel("Parentesco:");
		lblParentesco.setBounds(390, 265, 101, 20);
		
		JTextField tfParentesco = new JTextField();
		tfParentesco.setBounds(480, 265, 120, 20);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(15, 295, 86, 20);
		
		JTextField tfDomicilio = new JTextField();
		tfDomicilio.setBounds(90, 295, 510, 20);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(15, 325, 86, 20);
		
		JTextField tfNombre_1 = new JTextField();
		tfNombre_1.setBounds(90, 325, 280, 20);
		
		JLabel lblParentesco_1 = new JLabel("Parentesco:");
		lblParentesco_1.setBounds(390, 325, 101, 20);
		
		JTextField tfParentesco_1 = new JTextField();
		tfParentesco_1.setBounds(480, 325, 120, 20);
		
		JLabel lblDomicilio_1 = new JLabel("Domicilio:");
		lblDomicilio_1.setBounds(15, 355, 86, 20);	
		
		JTextField tfDomicilio_1 = new JTextField();
		tfDomicilio_1.setBounds(90, 355, 510, 20);
		
		panEntregados.add(labDocsEntregados);
		panEntregados.add(labSi);
		panEntregados.add(labNo);
		panEntregados.add(rbSi_1);
		panEntregados.add(rbSi_2);
		panEntregados.add(rbSi_3);
		panEntregados.add(rbSi_4);
		panEntregados.add(rbSi_5);
		panEntregados.add(rbNo_1);
		panEntregados.add(rbNo_2);
		panEntregados.add(rbNo_3);
		panEntregados.add(rbNo_4);
		panEntregados.add(rbNo_5);
		panEntregados.add(spObservaciones);
		panEntregados.add(lblNombre);
		panEntregados.add(tfNombre);
		panEntregados.add(lblParentesco);
		panEntregados.add(tfParentesco);
		panEntregados.add(lblDomicilio);
		panEntregados.add(tfDomicilio);
		panEntregados.add(lblNombre_1);
		panEntregados.add(tfNombre_1);
		panEntregados.add(lblParentesco_1);
		panEntregados.add(tfParentesco_1);
		panEntregados.add(lblDomicilio_1);
		panEntregados.add(tfDomicilio_1);
		
		JLabel lblPersonalDelIncifo = new JLabel("PERSONAL DEL INCIFO RESPONSABLE DE LA ENTREGA");
		lblPersonalDelIncifo.setBounds(10, 415, 593, 20);		
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setBounds(15, 445, 86, 20);
			
		JTextField tfTurno = new JTextField();
		tfTurno.setBounds(80, 445, 450, 20);
		
		JPanel panFuneraria = new JPanel();
		panFuneraria.setLayout(null);
		panFuneraria.setBounds(1, 475, 650, 115);
		panFuneraria.setBorder(BorderFactory.createTitledBorder("FUNERARIA"));
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la Funeraria:");
		lblNombreDeLa.setBounds(10, 20, 149, 20);
		
		JTextField tfNombreFuneraria = new JTextField();
		tfNombreFuneraria.setBounds(160, 20, 254, 20);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(440, 20, 79, 20);
		
		JTextField tfTelefono = new JTextField();
		tfTelefono.setBounds(510, 20, 100, 20);
		
		JLabel lblDomicilio_2 = new JLabel("Domicilio:");
		lblDomicilio_2.setBounds(10, 50, 125, 20);
		
		JTextField tfDomicilio_2 = new JTextField();
		tfDomicilio_2.setBounds(85, 50, 500, 20);
		
		JLabel lblNombreDelGestor = new JLabel("Nombre del Gestor:");
		lblNombreDelGestor.setBounds(10, 80, 125, 20);
		
		JTextField tfNombreDelGestor = new JTextField();
		tfNombreDelGestor.setBounds(130, 80, 340, 20);
		
		panFuneraria.add(lblNombreDeLa);
		panFuneraria.add(tfNombreFuneraria);
		panFuneraria.add(lblTelfono);
		panFuneraria.add(tfTelefono);
		panFuneraria.add(lblDomicilio_2);
		panFuneraria.add(tfDomicilio_2);
		panFuneraria.add(lblNombreDelGestor);
		panFuneraria.add(tfNombreDelGestor);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(520, 600, 121, 25);		
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(380, 600, 121, 25);	
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(245, 600, 115, 25);
		
		contentPane.add(panEntregados);
		contentPane.add(lblPersonalDelIncifo);
		contentPane.add(lblTurno);
		contentPane.add(tfTurno);
		contentPane.add(panFuneraria);
		contentPane.add(btnGuardar);
		contentPane.add(btnNewButton);
		contentPane.add(btnAtras);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				((JFrame)parent.getParent()).setVisible(true);
			}
		});
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				parent.setVisible(true);
			}
		});
	}
	
	public void paint(Graphics g) {
	    super.paint(g); 
	    Graphics2D g2 = (Graphics2D) g;
	    Line2D lin = new Line2D.Float(22, 95, 400, 95);
	    g2.draw(lin);
	  }
}
