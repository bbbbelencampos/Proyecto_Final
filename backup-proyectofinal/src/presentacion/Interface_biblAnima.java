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
import javax.swing.JPasswordField;

public class Interface_biblAnima extends JFrame {

	private JPanel princialPanel;
	private JTextField T_nom;
	private JTextField inputSearch;
	private JTextField txtApellido;
	private JTextField txtMailDeLa;
	private JPasswordField pwdSdad;
	private JTextField txtCiDelUsuario;

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
		
		JPanel altaUsuario = new JPanel();
		altaUsuario.setBackground(Color.PINK);
		altaUsuario.setBounds(0, 0, 884, 540);
		princialPanel.add(altaUsuario);
		altaUsuario.setLayout(null);
				
				Choice opciondeusuario = new Choice();
				opciondeusuario.setBounds(633, 463, 80, 20);
				altaUsuario.add(opciondeusuario);
				opciondeusuario.addItem("TIC");
				opciondeusuario.addItem("TIC&ADM");
				opciondeusuario.addItem("ADM");
				
				JLabel lblNewLabel_1 = new JLabel("Ingrese aqu\u00ED los datos solicitados");
				lblNewLabel_1.setBounds(468, 70, 338, 32);
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
				altaUsuario.add(lblNewLabel_1);
				
				T_nom = new JTextField();
				T_nom.setFont(new Font("Tahoma", Font.PLAIN, 15));
				T_nom.setText("Nombre");
				T_nom.setBounds(468, 140, 160, 23);
				altaUsuario.add(T_nom);
				T_nom.setColumns(10);
				
				JButton btnIngresarDatos = new JButton("Ingresar datos");
				btnIngresarDatos.setBounds(703, 433, 103, 23);
				altaUsuario.add(btnIngresarDatos);
				
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setBounds(438, 495, 89, 23);
				altaUsuario.add(btnCancelar);
				
				txtApellido = new JTextField();
				txtApellido.setFont(new Font("Tahoma", Font.PLAIN, 15));
				txtApellido.setText("Apellido");
				txtApellido.setColumns(10);
				txtApellido.setBounds(646, 140, 160, 23);
				altaUsuario.add(txtApellido);
				
				txtMailDeLa = new JTextField();
				txtMailDeLa.setText("Ej. usuario@anima.edu.uy");
				txtMailDeLa.setFont(new Font("Tahoma", Font.PLAIN, 15));
				txtMailDeLa.setColumns(10);
				txtMailDeLa.setBounds(468, 248, 338, 23);
				altaUsuario.add(txtMailDeLa);
				
				pwdSdad = new JPasswordField();
				pwdSdad.setText("sdad");
				pwdSdad.setBounds(468, 298, 338, 23);
				altaUsuario.add(pwdSdad);
				
				txtCiDelUsuario = new JTextField();
				txtCiDelUsuario.setText("CI del usuario");
				txtCiDelUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
				txtCiDelUsuario.setColumns(10);
				txtCiDelUsuario.setBounds(468, 186, 338, 23);
				altaUsuario.add(txtCiDelUsuario);
				
				JLabel lblEmail = new JLabel("E-mail");
				lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblEmail.setBounds(468, 232, 46, 14);
				altaUsuario.add(lblEmail);
				
				JLabel lblPassword = new JLabel("Password");
				lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblPassword.setBounds(468, 282, 74, 14);
				altaUsuario.add(lblPassword);
		
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
		
		inputSearch.setText("Ingrese CI de usuario...");
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
