package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import persistencia.conn;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Color;

public class Interface_biblAnima extends JFrame {

	private JPanel princialPanel;
	private JTextField T_nom;
	private JTextField T_ape;
	private JTextField T_mail;
	private JTextField T_pass;
	private JTextField T_ced;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_biblAnima frame = new Interface_biblAnima();
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
	public Interface_biblAnima() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 448);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Accion");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAltaUsuario = new JMenuItem("Dar de alta un usuario");
		
		mnNewMenu.add(mntmAltaUsuario);
		
		JMenuItem mntmConsultaUsuario = new JMenuItem("Consultar Usuario");
		mnNewMenu.add(mntmConsultaUsuario);
		
		JMenuItem mntmBuscarUsuario = new JMenuItem("Buscar Usuario");
		mnNewMenu.add(mntmBuscarUsuario);
		
		JMenuItem mntmListarUsuariosExistentes = new JMenuItem("Listar Usuarios Existentes");
		mnNewMenu.add(mntmListarUsuariosExistentes);
		
		JMenuItem mntmModificarDatosUsuarios = new JMenuItem("Modificar Datos Usuarios");
		mnNewMenu.add(mntmModificarDatosUsuarios);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Dar de alta un prestamo");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar prestamos");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Listar Prestamos");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmAltaNotificacion = new JMenuItem("Alta Notificacion");
		mnNewMenu.add(mntmAltaNotificacion);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Dar de alta un libro ");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Dar de baja un Prestamo");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem menuItem = new JMenuItem(" ");
		mnNewMenu.add(menuItem);
		princialPanel = new JPanel();
		princialPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(princialPanel);
		princialPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 440, 388);
		princialPanel.add(panel);
		panel.setLayout(null);
		
		JPanel altaUsuario = new JPanel();
		altaUsuario.setBackground(Color.PINK);
		altaUsuario.setBounds(0, 0, 440, 388);
		princialPanel.add(altaUsuario);
		altaUsuario.setLayout(null);
		
	
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(145, 88, 70, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		altaUsuario.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(145, 121, 46, 14);
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		altaUsuario.add(lblApellido);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(133, 205, 55, 14);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		altaUsuario.add(lblPassword);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setBounds(145, 175, 46, 14);
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		altaUsuario.add(lblMail);
		
		JLabel lblquEsUsted = new JLabel("Tipo de usuario");
		lblquEsUsted.setBounds(102, 237, 89, 14);
		lblquEsUsted.setFont(new Font("Tahoma", Font.PLAIN, 13));
		altaUsuario.add(lblquEsUsted);
		
		Choice opciondeusuario = new Choice();
		opciondeusuario.setBounds(205, 237, 80, 20);
		altaUsuario.add(opciondeusuario);
		opciondeusuario.addItem("TIC");
		opciondeusuario.addItem("TIC&ADM");
		opciondeusuario.addItem("ADM");
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese aqu\u00ED los datos solicitados");
		lblNewLabel_1.setBounds(63, 42, 298, 20);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		altaUsuario.add(lblNewLabel_1);
		
		T_nom = new JTextField();
		T_nom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T_nom.transferFocus();
			}
		});
		T_nom.setBounds(205, 86, 86, 20);
		altaUsuario.add(T_nom);
		T_nom.setColumns(10);
		
		T_ape = new JTextField();
		T_ape.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			T_ape.transferFocus();
			}
		});
		T_ape.setBounds(205, 118, 86, 20);
		altaUsuario.add(T_ape);
		T_ape.setColumns(10);
		
		T_mail = new JTextField();
		T_mail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T_mail.transferFocus();
			}
		});
		T_mail.setBounds(205, 173, 86, 20);
		altaUsuario.add(T_mail);
		T_mail.setColumns(10);
		
		T_pass = new JTextField();
		T_pass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T_pass.transferFocus();
			}
		});
		T_pass.setBounds(205, 203, 86, 20);
		altaUsuario.add(T_pass);
		T_pass.setColumns(10);
		
		JButton btnIngresarDatos = new JButton("Ingresar datos");
		btnIngresarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conn cc = new Conn();
				Connection cn = cc.conectarMySQL();
				String NombreCompleto, Curso;
				int Edad, CI;
				String sql="";
				nombre = T_nom.getText();
				ci = Integer.parseInt(T_ced.getText());
				apellido = T_ape.getText();
				mail = T_mail.getText();
				password = T_pass.getText();
				sql= "INSERT INTO usuarios(id,ci,nombre,apellido,mail,password)";	
			}
		});
		btnIngresarDatos.setBounds(258, 291, 103, 23);
		altaUsuario.add(btnIngresarDatos);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(102, 291, 89, 23);
		altaUsuario.add(btnCancelar);
		
		T_ced = new JTextField();
		T_ced.setBounds(205, 142, 86, 20);
		altaUsuario.add(T_ced);
		T_ced.setColumns(10);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setBounds(145, 150, 46, 14);
		altaUsuario.add(lblCedula);
		
		JPanel consultaUsuario = new JPanel();
		consultaUsuario.setBackground(Color.PINK);
		consultaUsuario.setBounds(0, 0, 440, 388);
		princialPanel.add(consultaUsuario);
		consultaUsuario.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(172, 119, 81, 20);
		consultaUsuario.add(comboBox);
		
		JLabel lblConsultaDeUsuario = new JLabel("Consulta de usuario");
		lblConsultaDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblConsultaDeUsuario.setBounds(136, 30, 181, 20);
		consultaUsuario.add(lblConsultaDeUsuario);
		
		JLabel lblSeleccioneUsuarioA = new JLabel("Seleccione Usuario a consultar");
		lblSeleccioneUsuarioA.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSeleccioneUsuarioA.setBounds(122, 94, 195, 14);
		consultaUsuario.add(lblSeleccioneUsuarioA);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(105, 199, 89, 23);
		consultaUsuario.add(btnNewButton);
		
		JButton btnIniciarConsulta = new JButton("Iniciar consulta");
		btnIniciarConsulta.setBounds(257, 199, 105, 23);
		consultaUsuario.add(btnIniciarConsulta);
		
		mntmAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				princialPanel.setVisible(true);
				
			}
		});
	}
}
