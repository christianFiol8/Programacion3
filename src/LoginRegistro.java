import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginRegistro {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	JPanel loginPanel;
	JPanel panel_1;
	JPanel panel_2;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginRegistro window = new LoginRegistro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 593, 659);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 579, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cuenta");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Iniciar Sesión");
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Component[] elementos = frame.getContentPane().getComponents();
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
						
						JPanel panel = ((JPanel) elementos[i]);
						
						frame.remove(panel);
						
					}
				}
				login(frame);
				frame.revalidate();
				frame.repaint();
			}});
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registro");
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Component[] elementos = frame.getContentPane().getComponents();
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
						
						JPanel panel = ((JPanel) elementos[i]);
						
						frame.remove(panel);
						
					}
				}
				registro(frame);
				frame.revalidate();
				frame.repaint();
				
				
				
			}});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Recuperacion de Cuenta");
		mnNewMenu.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
				Component[] elementos = frame.getContentPane().getComponents();
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
						
						JPanel panel = ((JPanel) elementos[i]);
						
						frame.remove(panel);
						
					}
				}
				recuperarCuenta(frame);
				frame.revalidate();
				frame.repaint();
				
				
				
				
			}});
		
		JMenu mnNewMenu_1 = new JMenu("Usuarios");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Alta");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Component[] elementos = frame.getContentPane().getComponents();
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
						
						JPanel panel = ((JPanel) elementos[i]);
						
						frame.remove(panel);
						
					}
				}
				alta(frame);
				frame.revalidate();
				frame.repaint();
				
				
			}});
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Baja");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Component[] elementos = frame.getContentPane().getComponents();
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
						
						JPanel panel = ((JPanel) elementos[i]);
						
						frame.remove(panel);
						
					}
				}
				baja(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		mntmNewMenuItem_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Component[] elementos = frame.getContentPane().getComponents();
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
						
						JPanel panel = ((JPanel) elementos[i]);
						
						frame.remove(panel);
						
					}
				}
				consultar(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("¿Cómo crear un usuario?");
		mnNewMenu_2.add(mntmNewMenuItem_6);
		mntmNewMenuItem_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Component[] elementos = frame.getContentPane().getComponents();
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
						
						JPanel panel = ((JPanel) elementos[i]);
						
						frame.remove(panel);
						
					}
				}
				crearUsuario(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("¿Cómo acceder al sistema?");
		mnNewMenu_2.add(mntmNewMenuItem_7);
		mntmNewMenuItem_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Component[] elementos = frame.getContentPane().getComponents();
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
						
						JPanel panel = ((JPanel) elementos[i]);
						
						frame.remove(panel);
						
					}
				}
				accederSistema(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		mnNewMenu_2.add(mntmNewMenuItem_8);
		mntmNewMenuItem_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Component[] elementos = frame.getContentPane().getComponents();
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
						
						JPanel panel = ((JPanel) elementos[i]);
						
						frame.remove(panel);
						
					}
				}
				olvideContraseña(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		
		this.login(frame);
		
		
		
		
		
		
		
	}
	
	public void registro(JFrame frame) {

		panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#255B69"));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(208, 66, 155, 30);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bookman Old Style" , Font.BOLD , 10));
		lblNewLabel_1.setBounds(69, 133, 45, 13);
		panel_1.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(69, 156, 180, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Bookman Old Style" , Font.BOLD , 10));
		lblNewLabel_2.setBounds(288, 133, 73, 13);
		panel_1.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(69, 222, 435, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Correo Electrónico");
		lblNewLabel_3.setFont(new Font("Bookman Old Style" , Font.BOLD , 10));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(69, 197, 155, 13);
		panel_1.add(lblNewLabel_3);
		
		
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(288, 156, 216, 19);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña");
		lblNewLabel_4.setFont(new Font("Bookman Old Style" , Font.BOLD , 10));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(69, 268, 155, 13);
		panel_1.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(69, 291, 435, 19);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("Confirmar Contraseña");
		lblNewLabel_5.setFont(new Font("Bookman Old Style" , Font.BOLD , 10));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(69, 334, 155, 13);
		panel_1.add(lblNewLabel_5);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(69, 357, 435, 19);
		panel_1.add(passwordField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(69, 417, 286, 21);
		panel_1.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(passwordField.getText().equals(passwordField_1.getText())) {
					JOptionPane.showMessageDialog(null, "Registro Exitoso");
				}else {
					JOptionPane.showMessageDialog(null, "Confirma contraseña");
				}
				
			}
		});
		btnNewButton.setBounds(225, 475, 107, 30);
		panel_1.add(btnNewButton);
		
	
		
		JButton btnNewButton_2 = new JButton("¿Ya tienes cuenta? Inicia Sesion");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.remove(panel_1);
				login(frame);
				frame.revalidate();
				frame.repaint();
			}
		});
		btnNewButton_2.setBounds(69, 546, 244, 21);
		panel_1.add(btnNewButton_2);
		
		
		
		
	}
	
	public void login(JFrame frame) {
		
		loginPanel = new JPanel();
		loginPanel.setBackground(Color.decode("#5F7E87"));
		frame.getContentPane().add(loginPanel, BorderLayout.CENTER);
		loginPanel.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesión");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 64, 279, 47);
		loginPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bookman Old Style" , Font.BOLD , 20));
		lblNewLabel_1.setBounds(72, 156, 262, 13);
		loginPanel.add(lblNewLabel_1);
		
		JLabel logoUser = new JLabel();
		logoUser.setIcon(new ImageIcon(getClass().getResource("user-interface.png")));
		logoUser.setBounds(40, 189, 24, 24);
		loginPanel.add(logoUser);
		
		textField = new JTextField();
		textField.setBounds(72, 189, 429, 30);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Bookman Old Style" , Font.BOLD , 20));
		lblNewLabel_2.setBounds(72, 256, 168, 13);
		loginPanel.add(lblNewLabel_2);
		
		JLabel logoPassword = new JLabel();
		logoPassword.setIcon(new ImageIcon(getClass().getResource("password.png")));
		logoPassword.setBounds(40, 296, 24, 24);
		loginPanel.add(logoPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(72, 290, 429, 30);
		loginPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Error , No se puede Acceder");
				
			}
		});
		btnNewButton.setBounds(72, 387, 429, 47);
		loginPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("¿Aun no tienes cuenta? Registrate Aqui");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.remove(loginPanel);
				registro(frame);
				frame.revalidate();
				frame.repaint();
				
			}
		});
		btnNewButton_1.setBounds(72, 484, 429, 21);
		loginPanel.add(btnNewButton_1);
	}
	
	public void recuperarCuenta(JFrame frame) {
		
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#44D491"));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(42, 120, 490, 379);
		panel_3.setBackground(Color.decode("#30B276"));
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recuperación de Cuenta");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(42, 63, 466, 47);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("Correo Electronico");
		lblNewLabel_6.setBounds(32, 44, 240, 13);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Bookman Old Style" , Font.BOLD , 20));
		panel_3.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(31, 67, 423, 28);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Enviar correo de recuperación");
		btnNewButton_3.setBounds(31, 156, 423, 21);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Regresar al login");
		btnNewButton_4.setBounds(32, 212, 422, 21);
		panel_3.add(btnNewButton_4);
		
		
		
		
	}
	
	public void alta(JFrame frame) {
		
		frame.getContentPane().revalidate();
		frame.getContentPane().repaint();
		
		
		JPanel alta = new JPanel();
		alta.setBackground(Color.decode("#D06CE0"));
		frame.getContentPane().add(alta, BorderLayout.CENTER);
		alta.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Alta");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 64, 279, 47);
		alta.add(lblNewLabel);
	}
	
	public void baja(JFrame frame) {
		JPanel baja = new JPanel();
		baja.setBackground(Color.decode("#A64FB4"));
		frame.getContentPane().add(baja, BorderLayout.CENTER);
		baja.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Baja");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 64, 279, 47);
		baja.add(lblNewLabel);
	}
	
	public void consultar(JFrame frame) {
		JPanel consultar = new JPanel();
		consultar.setBackground(Color.decode("#7D278A"));
		frame.getContentPane().add(consultar, BorderLayout.CENTER);
		consultar.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Consultar");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 64, 279, 47);
		consultar.add(lblNewLabel);
	}
	
	public void crearUsuario(JFrame frame) {
		JPanel crearUsuario = new JPanel();
		crearUsuario.setBackground(Color.decode("#60D4E1"));
		frame.getContentPane().add(crearUsuario, BorderLayout.CENTER);
		crearUsuario.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("¿Cómo crear usuario?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 64, 413, 47);
		crearUsuario.add(lblNewLabel);
	}
	
	public void accederSistema(JFrame frame) {
		JPanel accederSistema = new JPanel();
		accederSistema.setBackground(Color.decode("#33A55E"));
		frame.getContentPane().add(accederSistema, BorderLayout.CENTER);
		accederSistema.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("¿Cómo acceder al sistema?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(53, 64, 457, 47);
		accederSistema.add(lblNewLabel);
	}
	
	public void olvideContraseña(JFrame frame) {
		JPanel olvideContraseña = new JPanel();
		olvideContraseña.setBackground(Color.decode("#7EB994"));
		frame.getContentPane().add(olvideContraseña, BorderLayout.CENTER);
		olvideContraseña.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("¿Que pasa si olvidé mi contraseña?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 65, 569, 47);
		olvideContraseña.add(lblNewLabel);
	}
	
	
}
