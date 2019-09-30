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

public class Interface_biblAnima extends JFrame {

	private JPanel princialPanel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAltaUsuario = new JMenuItem("Alta Usuario");
		
		mnNewMenu.add(mntmAltaUsuario);
		
		JMenuItem mntmConsultaUsuario = new JMenuItem("Consultar Usuario");
		mnNewMenu.add(mntmConsultaUsuario);
		
		JMenuItem mntmBuscarUsuario = new JMenuItem("Buscar Usuario");
		mnNewMenu.add(mntmBuscarUsuario);
		
		JMenuItem mntmListarUsuariosExistentes = new JMenuItem("Listar Usuarios Existentes");
		mnNewMenu.add(mntmListarUsuariosExistentes);
		
		JMenuItem mntmModificarDatosUsuarios = new JMenuItem("Modificar Datos Usuarios");
		mnNewMenu.add(mntmModificarDatosUsuarios);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Alta prestamos ");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultar prestamos");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Listar Prestamos");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmAltaNotificacion = new JMenuItem("Alta Notificacion");
		mnNewMenu.add(mntmAltaNotificacion);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Alta Libros");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Dar de baja un Prestamo");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem menuItem = new JMenuItem(" ");
		mnNewMenu.add(menuItem);
		princialPanel = new JPanel();
		princialPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(princialPanel);
		princialPanel.setLayout(null);
		
		JPanel altaUsuario = new JPanel();
		altaUsuario.setBounds(0, 0, 440, 388);
		princialPanel.add(altaUsuario);
		altaUsuario.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(145, 88, 70, 14);
		altaUsuario.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApellido.setBounds(145, 121, 46, 14);
		altaUsuario.add(lblApellido);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(136, 175, 55, 14);
		altaUsuario.add(lblPassword);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMail.setBounds(145, 150, 46, 14);
		altaUsuario.add(lblMail);
		
		JLabel lblquEsUsted = new JLabel("\u00BFQu\u00E9 es usted?");
		lblquEsUsted.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblquEsUsted.setBounds(113, 225, 92, 14);
		altaUsuario.add(lblquEsUsted);
		
		Choice opciondeusuario = new Choice();
		opciondeusuario.setBounds(211, 219, 80, 20);
		altaUsuario.add(opciondeusuario);
		opciondeusuario.addItem("TIC");
		opciondeusuario.addItem("TIC&ADM");
		opciondeusuario.addItem("ADM");
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese aqu\u00ED los datos solicitados");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(63, 42, 298, 20);
		altaUsuario.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
					textField.requestFocus();
				};
			}
		});
		
		
		textField.setBounds(205, 86, 86, 20);
		altaUsuario.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 118, 86, 20);
		altaUsuario.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 148, 86, 20);
		altaUsuario.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(205, 173, 86, 20);
		altaUsuario.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 440, 388);
		princialPanel.add(panel);
		
		mntmAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				princialPanel.setVisible(true);
				
			}
		});
	}
}
