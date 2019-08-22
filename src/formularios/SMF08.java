package formularios;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import org.jdesktop.swingx.JXDatePicker;

import mantenimientos.GestionSMF08;


public class SMF08 extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumExp;
	private JTextField tfNumCert;
	private JTextField tfNombreAlias;
	private JTextField tfCarpetaInv;
	private JLabel lblCausasDeLa;
	private JLabel lblNewLabel_4;
	private JTextField tfPerito;
	private JLabel lblLugarDeNacimeinto;
	private JTextField tfLugNac;
	private JLabel lblEdad;
	private JTextField tfEdad;
	private JLabel lblEstadoCivil;
	private JTextField tfEstadoCivil;
	private JLabel lblOcupacion;
	private JTextField tfOcupacion;
	private JLabel lblDomicilio;
	private JTextField tfDomicilio;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField tfNomMadre;
	private JTextField tfNomPadre;
	private JLabel lblNewLabel_8;
	private JLabel lblNombreCorrecto;
	private JTextField textField_14;
	private JButton btnNewButton_1;
	private JButton btnSiguiente;
	private JButton btnCancelar;
	private JLabel label;
	private JFrame parent;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private SimpleDateFormat sdfMySQL = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMF08 frame = new SMF08(null);
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
	public SMF08(JFrame parent) {
		setTitle("SMF08");
		setSize(580, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(parent);
		
		this.parent = parent;
		
		contentPane = new JPanel();
		//contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Num Exp:");
		lblNewLabel.setBounds(180, 13, 77, 14);
		
		JLabel lblNewLabel_1 = new JLabel("Num Certificado:");
		lblNewLabel_1.setBounds(180, 38, 107, 14);
		
		JButton btnBusqueda = new JButton("Buscar");
		btnBusqueda.setBounds(460, 36, 80, 20);
		
		tfNumExp = new JTextField();
		tfNumExp.setBounds(310, 11, 127, 20);
		
		tfNumCert = new JTextField();
		tfNumCert.setBounds(310, 36, 127, 20);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de ingreso: ");
		lblNewLabel_2.setBounds(180, 75, 203, 20);
		
		JXDatePicker fechaIngreso = new JXDatePicker();
		fechaIngreso.setFormats(sdf);
		fechaIngreso.setDate(Calendar.getInstance().getTime());
		fechaIngreso.setBounds(320, 75, 130, 20);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre: ");
		lblNewLabel_3.setBounds(150, 109, 56, 20);
		
		tfNombreAlias = new JTextField();
		tfNombreAlias.setBounds(220, 109, 300, 20);
		
		JLabel lblCarpetaDeInvestigacion = new JLabel("Carpeta de Investigacion: ");
		lblCarpetaDeInvestigacion.setBounds(15, 140, 155, 20);
		
		tfCarpetaInv = new JTextField();
		tfCarpetaInv.setBounds(180, 140, 150, 20);
		
		lblCausasDeLa = new JLabel("Causas de muerte: ");
		lblCausasDeLa.setBounds(15, 175, 143, 20);
		
		JTextArea txtCausas= new JTextArea();
		txtCausas.setLineWrap(true);
		
		JScrollPane spCausas = new JScrollPane(txtCausas);
		spCausas.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		spCausas.setBounds(145, 175, 385, 60);
		
		lblNewLabel_4 = new JLabel("Perito que realizo la necropsia: ");
		lblNewLabel_4.setBounds(15, 250, 190, 20);
		
		tfPerito = new JTextField();
		tfPerito.setBounds(220, 250, 310, 20);
		
		JPanel panDatosGenerales = new JPanel();
		panDatosGenerales.setBorder(BorderFactory.createTitledBorder("DATOS GENERALES"));
		panDatosGenerales.setBounds(0, 295, 563, 210);
		panDatosGenerales.setLayout(null);
		
		JPanel panIdentificacion = new JPanel();
		panIdentificacion.setBorder(BorderFactory.createTitledBorder("IDENTIFICACION / ENTREGA DE DOCUMENTOS Y CADAVER"));
		panIdentificacion.setBounds(0, 520, 563, 100);
		panIdentificacion.setLayout(null);
		
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(tfNumExp);
		contentPane.add(tfNumCert);
		contentPane.add(lblNewLabel_2);
		contentPane.add(fechaIngreso);
		contentPane.add(lblNewLabel_3);
		contentPane.add(tfNombreAlias);
		contentPane.add(btnBusqueda);
		contentPane.add(lblCarpetaDeInvestigacion);
		contentPane.add(tfCarpetaInv);
		contentPane.add(lblCausasDeLa);
		contentPane.add(spCausas);
		contentPane.add(lblNewLabel_4);
		contentPane.add(tfPerito);	
		contentPane.add(panDatosGenerales);
		contentPane.add(panIdentificacion);
		
		lblLugarDeNacimeinto = new JLabel("Lugar de Nacimiento: ");
		lblLugarDeNacimeinto.setBounds(13, 30, 143, 20);
		lblLugarDeNacimeinto.setToolTipText("");
		
		tfLugNac = new JTextField();
		tfLugNac.setBounds(155, 30, 260, 20);
		
		lblEdad = new JLabel("Edad: ");
		lblEdad.setBounds(430, 30, 34, 20);
		
		tfEdad = new JTextField();
		tfEdad.setBounds(470, 30, 50, 20);
		
		lblEstadoCivil = new JLabel("Estado Civil: ");
		lblEstadoCivil.setBounds(13, 65, 71, 20);
		
		tfEstadoCivil = new JTextField();
		tfEstadoCivil.setBounds(100, 65, 130, 20);
		
		lblOcupacion = new JLabel("Ocupacion: ");
		lblOcupacion.setBounds(260, 65, 80, 20);
		
		tfOcupacion = new JTextField();
		tfOcupacion.setBounds(340, 65, 160, 20);
		
		lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(13, 100, 56, 20);
		
		tfDomicilio = new JTextField();
		tfDomicilio.setBounds(85, 100, 450, 20);
		
		lblNewLabel_5 = new JLabel("Nombre del Padre:");
		lblNewLabel_5.setBounds(13, 135, 133, 20);
		
		lblNewLabel_6 = new JLabel("Nombre de la Madre:");
		lblNewLabel_6.setBounds(15, 170, 133, 20);
		
		tfNomMadre = new JTextField();
		tfNomMadre.setBounds(158, 135, 377, 20);

		tfNomPadre = new JTextField();
		tfNomPadre.setBounds(158, 170, 377, 20);
		
		panDatosGenerales.add(lblLugarDeNacimeinto);
		panDatosGenerales.add(lblEdad);
		panDatosGenerales.add(lblEstadoCivil);
		panDatosGenerales.add(lblOcupacion);
		panDatosGenerales.add(lblDomicilio);
		panDatosGenerales.add(lblNewLabel_5);
		panDatosGenerales.add(lblNewLabel_6);
		panDatosGenerales.add(tfLugNac);
		panDatosGenerales.add(tfEdad);
		panDatosGenerales.add(tfEstadoCivil);
		panDatosGenerales.add(tfOcupacion);
		panDatosGenerales.add(tfDomicilio);
		panDatosGenerales.add(tfNomMadre);
		panDatosGenerales.add(tfNomPadre);
		
		lblNewLabel_8 = new JLabel("Fecha de Egreso:");
		lblNewLabel_8.setBounds(15, 30, 133, 20);
		
		JXDatePicker dpFechaEgreso = new JXDatePicker(Calendar.getInstance().getTime());
		dpFechaEgreso.setFormats(sdf);
		dpFechaEgreso.setBounds(130, 30, 130, 20);
		
		lblNombreCorrecto = new JLabel("Nombre Correcto:");
		lblNombreCorrecto.setBounds(15, 65, 143, 20);
		
		textField_14 = new JTextField();
		textField_14.setBounds(140, 65, 290, 20);
		
		panIdentificacion.add(lblNewLabel_8);
		panIdentificacion.add(dpFechaEgreso);
		panIdentificacion.add(lblNombreCorrecto);
		panIdentificacion.add(textField_14);
		
		btnNewButton_1 = new JButton("GUARDAR");
		btnNewButton_1.setBounds(440, 625, 111, 25);
		contentPane.add(btnNewButton_1);
		
		btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.setBounds(310, 625, 108, 25);
		contentPane.add(btnSiguiente);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(175, 625, 111, 25);
		contentPane.add(btnCancelar);
		
		btnBusqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numExp = tfNumExp.getText();
				GestionSMF08 dbManager = new GestionSMF08();
				
				if(dbManager.getNumExpExists(numExp)) {
				
					Map<String, String> listaDatos = dbManager.getDatosPage1(numExp);
					
					try {
						
						fechaIngreso.setDate(sdfMySQL.parse(listaDatos.get("fecha_ingreso")));
						tfNombreAlias.setText(listaDatos.get("nom_alias"));
						tfCarpetaInv.setText(listaDatos.get("carpeta_inv"));
						tfLugNac.setText(listaDatos.get("lugar_nac"));
						tfEdad.setText(listaDatos.get("edad"));
						tfEstadoCivil.setText(listaDatos.get("estado_civil"));
						tfOcupacion.setText(listaDatos.get("ocupacion"));
						tfDomicilio.setText(listaDatos.get("domicilio"));
						tfNomPadre.setText(listaDatos.get("nom_padre"));
						tfNomMadre.setText(listaDatos.get("nom_madre"));
						
					} catch(Exception err) {err.printStackTrace();}
				} else {
					JOptionPane.showMessageDialog(null, "No se encontro el expediente!");
				}
			}
		});
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				parent.setVisible(true);
			}
		});
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = (JFrame) SwingUtilities.getRoot(((Component)e.getSource()));
				frame.setVisible(false);
				new SMF081(frame).setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String numExp = tfNumExp.getText();
				GestionSMF08 dbManager = new GestionSMF08();
				
				if(!dbManager.getNumExpExists(numExp)) {
					
					System.out.println("No existe el expediente!");
					
					//Se crea el cadaver y se almacenan los datos nuevos
					
					String nomAlias = tfNombreAlias.getText();
					String carpeta = tfCarpetaInv.getText();
					Date fechaIng = fechaIngreso.getDate();
					String lugarNac = tfLugNac.getText();
					String edad = tfEdad.getText();
					String estCivil = tfEstadoCivil.getText();
					String ocupacion = tfOcupacion.getText();
					String domicilio = tfDomicilio.getText();
					String nomPadre = tfNomPadre.getText();
					String nomMadre = tfNomMadre.getText();
					
					dbManager.newPage1(numExp, nomAlias, carpeta, fechaIng, lugarNac, edad, estCivil, ocupacion, domicilio, nomPadre, nomMadre);
					
				}else {
					
					System.out.println("Ya existe el expediente!");
					
					//Se modifican los datos del cadaver que ya existe
					
					String nomAlias = tfNombreAlias.getText();
					String carpeta = tfCarpetaInv.getText();
					Date fechaIng = fechaIngreso.getDate();
					String lugarNac = tfLugNac.getText();
					String edad = tfEdad.getText();
					String estCivil = tfEstadoCivil.getText();
					String ocupacion = tfOcupacion.getText();
					String domicilio = tfDomicilio.getText();
					String nomPadre = tfNomPadre.getText();
					String nomMadre = tfNomMadre.getText();
					
					dbManager.updatePage1(numExp, nomAlias, carpeta, fechaIng, lugarNac, edad, estCivil, ocupacion, domicilio, nomPadre, nomMadre);
					
				}
			}
		});
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(SMF08.class.getResource("/imagenes/logo_INCIFO.png")));
		label.setBounds(1, 0, 133, 119);
		contentPane.add(label);
	}
	
	public JFrame getParent() {
		return this.parent;
	}
}
