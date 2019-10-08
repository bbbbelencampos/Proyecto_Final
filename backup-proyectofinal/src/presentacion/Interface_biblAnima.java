package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.SystemColor;

public class Interface_biblAnima extends JFrame {

	private JPanel princialPanel;
	private JTextField T_nom;
	private JTextField T_ape;
	private JTextField T_mail;
	private JTextField T_pass;
	private JTextField T_ced;
	private JTextField inputSearch;

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
		setBounds(100, 100, 900, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu usuariosContent = new JMenu("Usuarios");
		menuBar.add(usuariosContent);
		
		JMenuItem btnAltaUsuario = new JMenuItem("Dar de alta");
		
		
		usuariosContent.add(btnAltaUsuario);
		
		JMenuItem btnListarUsuariosExistentes = new JMenuItem("Listar Usuarios Existentes");
		
		usuariosContent.add(btnListarUsuariosExistentes);
		
		JMenuItem menuItem = new JMenuItem(" ");
		usuariosContent.add(menuItem);
		
		JMenu librosContent = new JMenu("Libros");
		menuBar.add(librosContent);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Dar de alta un libro ");
		librosContent.add(mntmNewMenuItem_3);
		
		JMenu prestamosContent = new JMenu("Prestamos");
		menuBar.add(prestamosContent);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Dar de alta un prestamo");
		prestamosContent.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Listar Prestamos");
		prestamosContent.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar prestamos");
		prestamosContent.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Dar de baja un Prestamo");
		prestamosContent.add(mntmNewMenuItem_4);
		princialPanel = new JPanel();
		princialPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(princialPanel);
		princialPanel.setLayout(null);
		
		JPanel listadoUsuario = new JPanel();
		listadoUsuario.setToolTipText("");
		listadoUsuario.setBackground(SystemColor.activeCaption);
		listadoUsuario.setBounds(0, 0, 884, 540);
		princialPanel.add(listadoUsuario);
		listadoUsuario.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Listado de usuarios");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(26, 17, 242, 34);
		listadoUsuario.add(lblNewLabel_2);
		
		inputSearch = new JTextField();
		inputSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		inputSearch.setText("Ingrese CI de usuario");
		inputSearch.setToolTipText("");
		inputSearch.setBounds(640, 23, 183, 31);
		listadoUsuario.add(inputSearch);
		inputSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		
		
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\December Labs\\Downloads\\icon (1).png"));
		btnNewButton.setBounds(821, 23, 41, 31);
		listadoUsuario.add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(26, 423, 836, -327);
		listadoUsuario.add(list);
		
		JPanel altaUsuario = new JPanel();
		altaUsuario.setBackground(Color.PINK);
		altaUsuario.setBounds(0, 0, 884, 540);
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
				lblNewLabel_1.setBounds(285, 43, 298, 20);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
				altaUsuario.add(lblNewLabel_1);
				
				T_nom = new JTextField();
				T_nom.setBounds(205, 86, 86, 20);
				altaUsuario.add(T_nom);
				T_nom.setColumns(10);
				
				T_ape = new JTextField();
				T_ape.setBounds(205, 118, 86, 20);
				altaUsuario.add(T_ape);
				T_ape.setColumns(10);
				
				T_mail = new JTextField();
				T_mail.setBounds(205, 173, 86, 20);
				altaUsuario.add(T_mail);
				T_mail.setColumns(10);
				
				T_pass = new JTextField();
				T_pass.setBounds(205, 203, 86, 20);
				altaUsuario.add(T_pass);
				T_pass.setColumns(10);
				
				JButton btnIngresarDatos = new JButton("Ingresar datos");
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
		
		
		//Actions
		
			//Menu
			btnAltaUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					altaUsuario.setVisible(true);
					listadoUsuario.setVisible(false);
				}
			});
			
			btnListarUsuariosExistentes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					listadoUsuario.setVisible(true);
					altaUsuario.setVisible(false);
				}
			});
		
			//Users' list
			inputSearch.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					if(inputSearch.getText().equals("Ingrese CI de usuario...")) {
						inputSearch.setText("");
					}
				}
				@Override
				public void focusLost(FocusEvent e) {
					if(inputSearch.getText().equals("")) {
						inputSearch.setText("Ingrese CI de usuario");
					}
				}
			});
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputSearch.setText("Ingrese CI de usuario...");
					
				}
			});
			
			
		
		
	}
}
