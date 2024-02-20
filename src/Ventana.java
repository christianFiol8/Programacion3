import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	
	
	//Constructor que define atributos basicos de la ventana
	
	public Ventana() {
		
		this.setTitle("Mi ventana");
		this.setSize(1000,500);
		this.setLocation(200, 200);
		
			
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		
		this.setLayout(null);
		
		this.iniciarComponentes();
		
	}
	
	public void iniciarComponentes() {
		
		JPanel login = new JPanel() ;
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.gray);
		login.setLayout(null);
		
		JPanel back = new JPanel ();
		back.setBounds(50, 130, 400, 300);
		back.setBackground(Color.darkGray);
		back.setLayout(null);
		login.add(back);
		
		
	
		JLabel loginTitle = new JLabel ("ACCEDER" , 0);
		loginTitle.setFont(new Font("Agency FB" , Font.BOLD , 34));
		loginTitle.setForeground(Color.white);
		loginTitle.setLocation(100, 30);
		loginTitle.setSize(300, 90);
		loginTitle.setOpaque(true);
		loginTitle.setBackground(Color.darkGray);
		login.add(loginTitle);
		
		
		
		
		JLabel userName = new JLabel ("Nombre de Usuario: " , 2);
		userName.setBounds(10,5,300,70);
		userName.setForeground(Color.white);
		userName.setFont(new Font("Calibri", Font.BOLD , 20));
		back.add(userName);
		
		
		JTextField user = new JTextField();
		user.setBounds(10, 60, 300, 30);
		back.add(user);
		
		
		JLabel password = new JLabel ("Contraseña: " , 2);
		password.setBounds(10,80,300,70);
		password.setForeground(Color.white);
		password.setFont(new Font("Calibri", Font.BOLD , 20));
		back.add(password);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(10, 135 , 300 , 30);
		back.add(passwordField);
		
		JCheckBox check = new JCheckBox("Recordarme");
		check.setFont(new Font ("Calibri" , Font.BOLD , 15));
		check.setBounds(15,180, 15, 10);
		back.add(check);
			
		JLabel forgotP = new JLabel ("¿Olvidó su constraseña?" , 4);
		forgotP.setBounds(80,150,300,70);
		forgotP.setForeground(Color.white);
		forgotP.setFont(new Font("Calibri", Font.BOLD , 15));
		back.add(forgotP);
		
		
		
		JButton btn = new JButton ("Acceder");
		btn.setBounds(120,230, 150,60);
		back.add(btn);
		
		
		//Siempre tienen size, location, string (constructor)
		
		JPanel registro = new JPanel() ;
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.white);
		registro.setLocation(500,0);
		
		
		
		
		
		
		this.add(login);
		this.add(registro);
		
	}
	
}