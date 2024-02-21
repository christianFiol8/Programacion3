import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	
	
	//Constructor que define atributos basicos de la ventana
	
	public Ventana() {
		
		this.setTitle("Mi ventana");
		this.setSize(1000,700);
		this.setLocation(200, 200);
		
			
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		
		this.setLayout(null);
		
		this.iniciarComponentes();
		
	}
	
	public void iniciarComponentes() {
		
		this.login();
		
		JPanel registro = new JPanel() ;
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.blue);
		registro.setLocation(500,0);
		registro.setLayout(null);
		
		
		JLabel registroTag = new JLabel ("REGISTRO" , 0);
		registroTag.setFont(new Font("Agency FB" , Font.BOLD , 34));
		registroTag.setForeground(Color.white);
		registroTag.setLocation(100, 30);
		registroTag.setSize(300, 70);
		registroTag.setOpaque(true);
		registroTag.setBackground(Color.darkGray);
		registro.add(registroTag);
		
		JLabel userName = new JLabel ("Nombre de Usuario: " , 0);
		userName.setBounds(100,110,300,40);
		userName.setForeground(Color.white);
		userName.setFont(new Font("Calibri", Font.BOLD , 20));
		userName.setOpaque(true);
		userName.setBackground(Color.yellow);
		registro.add(userName);
		
		JTextField user = new JTextField();
		user.setBounds(50, 160, 400, 40);
		user.setHorizontalAlignment(0);
		registro.add(user);
		
		JLabel bio = new JLabel ("BIO" , 0);
		bio.setBounds(100,200,300,30);
		bio.setOpaque(true);
		bio.setBackground(Color.yellow);
		registro.add(bio);
		
		JTextArea bio_tex = new JTextArea();
		bio_tex.setBounds(50, 240, 400, 80);
		registro.add(bio_tex);
		
		JLabel prefer_tag = new JLabel ("Preferencias" , 0);
		
		JCheckBox item_box1 = new JCheckBox ("Dulces");
		item_box1.setBounds(50, 360, 80, 30);
		item_box1.setFont(new Font("Calibri", Font.BOLD , 20));
		item_box1.setOpaque(true);
		registro.add(item_box1);
		
		JCheckBox item_box2 = new JCheckBox ("Salado");
		item_box2.setBounds(140, 360, 80, 30);
		item_box2.setFont(new Font("Calibri", Font.BOLD , 20));
		item_box2.setOpaque(true);
		registro.add(item_box2);
		
		JCheckBox item_box3 = new JCheckBox ("Saludable");
		item_box3.setBounds(240, 360, 110, 30);
		item_box3.setFont(new Font("Calibri", Font.BOLD , 20));
		item_box3.setOpaque(true);
		registro.add(item_box3);
		
		
		JLabel terms_tag = new JLabel ("TERMINOS " , 0);
		terms_tag.setBounds(50,400,400,40);
		terms_tag.setForeground(Color.white);
		terms_tag.setFont(new Font("Calibri", Font.BOLD , 20));
		terms_tag.setOpaque(true);
		terms_tag.setBackground(Color.yellow);
		registro.add(terms_tag);
		
		
		JRadioButton accept_radio = new JRadioButton("Acepto");
		accept_radio.setBounds(50, 440, 100, 40);
		accept_radio.setFont(new Font("Calibri", Font.BOLD , 20));
		
		registro.add(accept_radio);
		
		JRadioButton reject_radio = new JRadioButton("NO Acepto");
		reject_radio.setBounds(250, 440, 100, 40);
		reject_radio.setFont(new Font("Calibri", Font.BOLD , 20));
		registro.add(reject_radio);
		
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_radio);
		terms.add(reject_radio);
		
		
		
		String colonias []= {"Centro" , "Camino Real" , "Pedregal" , "Conchalito" , "Ocho"};
		JComboBox  locations = new JComboBox(colonias);
		locations.setBounds(50, 480, 400, 40);
		locations.setFont(new Font("Calibri" , Font.BOLD , 20));
		registro.add(locations);
		
		JButton rgs_btn = new JButton ("Crear Cuenta");
		rgs_btn.setBounds(50,530, 400,70);
		rgs_btn.setBackground(Color.green);
		registro.add(rgs_btn);
		
		
		

		this.add(registro);
		
		this.repaint();
		this.validate();
		
		
		
	}
		
		
		
	public void login() {
			
			
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
		check.setBounds(15,180, 140, 30);
		check.setBackground(Color.darkGray);
		check.setForeground(Color.white);
		back.add(check);
			
		JLabel forgotP = new JLabel ("¿Olvidó su constraseña?" , 4);
		forgotP.setBounds(80,150,300,70);
		forgotP.setForeground(Color.white);
		forgotP.setFont(new Font("Calibri", Font.BOLD , 15));
		back.add(forgotP);
		
		JButton btn = new JButton ("Acceder");
		btn.setBounds(120,230, 150,60);
		btn.setBackground(Color.green);
		back.add(btn);
		
		
		
	}
}
		
		
	
	
