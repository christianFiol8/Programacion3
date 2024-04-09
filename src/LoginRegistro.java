import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
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
		
		//this.registro();
		this.login();
		
		
		
		
	}
	
	public void registro() {
		JPanel panel_1 = new JPanel();
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 579, 22);
		panel_1.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Usuarios");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem);
		
		
		
		
	}
	
	public void login() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#4798AD"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 579, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Login");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Registro");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Carga");
		mnNewMenu_3.setEnabled(false);
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Ayuda");
		mnNewMenu_4.setEnabled(false);
		menuBar.add(mnNewMenu_4);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesión");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(142, 64, 279, 47);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bookman Old Style" , Font.BOLD , 20));
		lblNewLabel_1.setBounds(72, 156, 262, 13);
		panel.add(lblNewLabel_1);
		
		JLabel logoUser = new JLabel();
		logoUser.setIcon(new ImageIcon(getClass().getResource("user-interface.png")));
		logoUser.setBounds(40, 189, 24, 24);
		panel.add(logoUser);
		
		textField = new JTextField();
		textField.setBounds(72, 189, 429, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Bookman Old Style" , Font.BOLD , 20));
		lblNewLabel_2.setBounds(72, 256, 168, 13);
		panel.add(lblNewLabel_2);
		
		JLabel logoPassword = new JLabel();
		logoPassword.setIcon(new ImageIcon(getClass().getResource("password.png")));
		logoPassword.setBounds(40, 296, 24, 24);
		panel.add(logoPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(72, 290, 429, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Error , No se puede Acceder");
				
			}
		});
		btnNewButton.setBounds(220, 387, 114, 47);
		panel.add(btnNewButton);
	}
}
