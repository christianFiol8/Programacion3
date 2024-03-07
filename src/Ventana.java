import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	
	
	//Constructor que define atributos basicos de la ventana
	
	public Ventana() {
		
		this.setTitle("Mi ventana");
		this.setSize(800,600);
		this.setLocation(300, 50);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.iniciarComponentes();
		
	}
	
	@Override
	public void paint (Graphics g) {
		super.paint(g);
		
		
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.decode("#2092CB"));
		g2d.fillRect(1, 1,800, 500);
		
		
		//Nubes
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(200,400, 150, 30,50,50);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(550,180, 150, 30,50,50);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(630,130, 130, 30,50,50);
		
		//Tubos grises
		g2d.setColor(Color.decode("#BAD9D8"));
		g2d.drawRoundRect(80, 150, 140, 400, 150, 150);
		g2d.setColor(Color.decode("#BAD9D8"));
		g2d.fillRoundRect(80, 150, 140, 400,150,150);
		
		g2d.setColor(Color.decode("#BAD9D8"));
		g2d.drawRoundRect(350, 150, 140, 400, 150, 150);
		
		g2d.setColor(Color.decode("#BAD9D8"));
		g2d.fillRoundRect(350, 150, 140, 400 ,150,150);
		
		g2d.setColor(Color.decode("#BAD9D8"));
		g2d.drawRoundRect(470, 50, 140, 400, 150, 150);
		g2d.setColor(Color.decode("#BAD9D8"));
		g2d.fillRoundRect(470, 50, 140,400 ,150,150);
		
		//Nube
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(0, 250, 150, 40,50,50);
				
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(150, 180, 20, 40,20,20);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(430, 180, 20, 40,20,20);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(380, 250, 20, 40,20,20);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(430, 180, 20, 40,20,20);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(380, 250, 20, 40,20,20);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(150, 300, 20, 40,20,20);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(560, 90, 20, 40,20,20);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(500, 150, 20, 40,20,20);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(220,300, 150, 30,50,50);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(280,360, 150, 30,50,50);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(280,440, 150, 30,50,50);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(380,400, 150, 30,50,50);
		
		//Tubos azules
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#107089"));
		g2d.drawRoundRect(0, 350, 140, 200, 100, 100);
		g2d.setColor(Color.decode("#3E9FB9"));
		g2d.fillRoundRect(0, 350, 140,200,100,100);
	
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#107089"));
		g2d.drawRoundRect(350, 350, 190, 200, 150, 150);
		g2d.setColor(Color.decode("#3E9FB9"));
		g2d.fillRoundRect(350, 350, 190,200,150,150);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#107089"));
		g2d.drawRoundRect(470, 200, 180, 400, 150, 150);
		g2d.setColor(Color.decode("#3E9FB9"));
		g2d.fillRoundRect(470, 200, 180,400,150,150);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(500, 250, 20, 40,20,20);
		
		g2d.setColor(Color.decode("#FCFCFC"));
		g2d.fillRoundRect(600, 400, 20, 40,20,20);
		
		//Tuberias moradas
		
		//Primera
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawRoundRect(370,400, 70, 100, 0, 10);
		
		g2d.setColor(Color.decode("#7D19CB"));
		g2d.fillRoundRect(370,400, 70, 100, 0, 10);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawRoundRect(360,370, 90, 40, 10, 10);
		
		g2d.setColor(Color.decode("#7D19CB"));
		g2d.fillRoundRect(360,370, 90, 40, 10, 10);
		//Segunda
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawRoundRect(740,430, 60, 50, 0, 10);
		
		g2d.setColor(Color.decode("#7D19CB"));
		g2d.fillRoundRect(740,430, 60, 50, 0, 10);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawRoundRect(735,400, 65, 30, 10, 10);
		
		g2d.setColor(Color.decode("#7D19CB"));
		g2d.fillRoundRect(735,400, 65, 30, 10, 10);
		
		
		//Cuadritos
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawRoundRect(735, 310, 60, 40, 20, 20);
		g2d.setColor(Color.decode("#E6E618"));
		g2d.fillRoundRect(735, 310, 60, 40, 20, 20);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawRoundRect(690, 310, 40, 40, 20, 20);
		g2d.setColor(Color.decode("#CBCBCB"));
		g2d.fillRoundRect(690, 310, 40, 40, 20, 20);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawRoundRect(690, 355, 40, 40, 20, 20);
		g2d.setColor(Color.decode("#CBCBCB"));
		g2d.fillRoundRect(690, 355, 40, 40, 20, 20);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawRoundRect(690, 400, 40, 40, 20, 20);
		g2d.setColor(Color.decode("#CBCBCB"));
		g2d.fillRoundRect(690, 400, 40, 40, 20, 20);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawRoundRect(690, 445, 40, 40, 20, 20);
		g2d.setColor(Color.decode("#CBCBCB"));
		g2d.fillRoundRect(690, 445, 40, 40, 20, 20);
		
		//Lineas
		
		g2d.setStroke(new BasicStroke(7));
		g2d.setColor(Color.decode("#F9F9F9"));
		g2d.drawLine(385, 373, 385, 405);
		
		g2d.setStroke(new BasicStroke(7));
		g2d.setColor(Color.decode("#F9F9F9"));
		g2d.drawLine(395, 415, 395, 475);
		
		g2d.setStroke(new BasicStroke(7));
		g2d.setColor(Color.decode("#F9F9F9"));
		g2d.drawLine(756, 404, 756, 425);
		
		g2d.setStroke(new BasicStroke(7));
		g2d.setColor(Color.decode("#F9F9F9"));
		g2d.drawLine(765, 435, 765, 550);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawLine(756, 320, 756, 330);
		
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.decode("#000000"));
		g2d.drawLine(776, 320, 776, 330);
		
		//Mario
		
		
		
		
		//Piso
		g2d.setColor(Color.decode("#F1C373"));
		g2d.fillRect(2, 500, 800, 100);
		
		g2d.setColor(Color.decode("#000000"));
		g2d.setStroke(new BasicStroke(6));
		g2d.drawRoundRect(2, 480, 800,20, 10, 10);
		g2d.setColor(Color.decode("#30AE1A"));
		g2d.fillRect(2, 480, 800,20);
		
		
	}	
	
	
	
	public void iniciarComponentes() {
		
		//this.login();		
		//this.registro();
		//this.admin();
		//this.tareaCalculadora();
		//this.calculadora();
		//this.calculoInteres();
				
		
		this.repaint();
		this.validate();
		
	}
	
	
	public void registro() {
		JPanel registro = new JPanel() ;
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.magenta);
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
		userName.setBounds(100,100,300,40);
		userName.setForeground(Color.white);
		userName.setFont(new Font("Calibri", Font.BOLD , 20));
		userName.setOpaque(true);
		userName.setBackground(Color.darkGray);
		registro.add(userName);
		
		JTextField user = new JTextField();
		user.setBounds(50, 150, 400, 40);
		user.setHorizontalAlignment(0);
		registro.add(user);
		
		JLabel bio = new JLabel ("BIO" , 0);
		bio.setBounds(100,200,300,30);
		bio.setForeground(Color.white);
		bio.setOpaque(true);
		bio.setBackground(Color.darkGray);
		registro.add(bio);
		
		JTextArea bio_tex = new JTextArea();
		bio_tex.setBounds(50, 240, 400, 80);
		registro.add(bio_tex);
		
		JLabel prefer_tag = new JLabel ("Preferencias" , 0);
		
		JCheckBox item_box1 = new JCheckBox ("Dulces");
		item_box1.setBounds(50, 360, 80, 30);
		item_box1.setFont(new Font("Calibri", Font.BOLD , 20));
		item_box1.setOpaque(false);
		registro.add(item_box1);
		
		JCheckBox item_box2 = new JCheckBox ("Salado");
		item_box2.setBounds(140, 360, 80, 30);
		item_box2.setFont(new Font("Calibri", Font.BOLD , 20));
		item_box2.setOpaque(false);
		registro.add(item_box2);
		
		JCheckBox item_box3 = new JCheckBox ("Saludable");
		item_box3.setBounds(240, 360, 110, 30);
		item_box3.setFont(new Font("Calibri", Font.BOLD , 20));
		item_box3.setOpaque(false);
		registro.add(item_box3);
		
		
		JLabel terms_tag = new JLabel ("TERMINOS " , 0);
		terms_tag.setBounds(50,400,400,40);
		terms_tag.setForeground(Color.white);
		terms_tag.setFont(new Font("Calibri", Font.BOLD , 20));
		terms_tag.setOpaque(true);
		terms_tag.setBackground(Color.darkGray);
		registro.add(terms_tag);
		
		
		JRadioButton accept_radio = new JRadioButton("Acepto");
		accept_radio.setBounds(50, 440, 100, 40);
		accept_radio.setFont(new Font("Calibri", Font.BOLD , 20));
		accept_radio.setOpaque(false);
		registro.add(accept_radio);
		
		JRadioButton reject_radio = new JRadioButton("NO Acepto");
		reject_radio.setBounds(250, 440, 100, 40);
		reject_radio.setFont(new Font("Calibri", Font.BOLD , 15));
		reject_radio.setOpaque(false);
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
	}
		
		
		
	public void login() {
			
			
		JPanel login = new JPanel() ;
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(Color.decode("#185CA4"));
		login.setLayout(null);
		
		JPanel back = new JPanel ();
		back.setBounds(70, 90, 650, 350);
		back.setBackground(Color.decode("#144981"));
		back.setLayout(null);
		login.add(back);
	
		JLabel loginTitle = new JLabel ("User Login" , 0);
		loginTitle.setFont(new Font("Bookman Old Style" , Font.BOLD , 40));
		loginTitle.setForeground(Color.white);
		loginTitle.setBounds(10, 30, 800, 40);
		loginTitle.setOpaque(false);
		loginTitle.setBackground(Color.darkGray);
		login.add(loginTitle);
		
		JLabel miCuenta = new JLabel ("My Account" , 0);
		miCuenta.setFont(new Font("Cambria" , Font.BOLD , 30));
		miCuenta.setForeground(Color.yellow);
		miCuenta.setBounds(230, 20, 200, 40);
		back.add(miCuenta);
		
		JLabel userName = new JLabel ("Username: " , 2);
		userName.setBounds(180,60,300,70);
		userName.setForeground(Color.white);
		userName.setFont(new Font("Bookman Old Style", Font.BOLD , 20));
		back.add(userName);
		
		JLabel logoUser = new JLabel();
		logoUser.setIcon(new ImageIcon(getClass().getResource("user-interface.png")));
		logoUser.setBounds(150, 120, 24, 24);
		back.add(logoUser);
		
		
		JTextField user = new JTextField();
		user.setBounds(180,120, 300, 30);
		back.add(user);
		
		/*JLabel logo = new JLabel ();
		logo.setIcon(new ImageIcon(getClass().getResource("rain.png")));
		logo.setBounds(100,450,200,200);
		login.add(logo);*/
		
		
		JLabel password = new JLabel ("Password: " , 2);
		password.setBounds(180,150,300,70);
		password.setForeground(Color.white);
		password.setFont(new Font("Bookman Old Style", Font.BOLD , 20));
		back.add(password);
		
		JLabel logoPassword = new JLabel();
		logoPassword.setIcon(new ImageIcon(getClass().getResource("password.png")));
		logoPassword.setBounds(150, 200, 24, 24);
		back.add(logoPassword);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(180, 200 , 300 , 30);
		back.add(passwordField);
		
		JCheckBox check = new JCheckBox("Remember me");
		check.setFont(new Font ("Calibri" , Font.BOLD , 15));
		check.setBounds(400,240, 140, 30);
		check.setOpaque(false);
		check.setBackground(Color.darkGray);
		check.setForeground(Color.white);
		back.add(check);
			
		/*JLabel forgotP = new JLabel ("¿Olvidó su constraseña?" , 4);
		forgotP.setBounds(80,150,300,70);
		forgotP.setForeground(Color.white);
		forgotP.setFont(new Font("Calibri", Font.BOLD , 15));
		back.add(forgotP);*/
		
		JButton btn = new JButton ("Login");
		btn.setBounds(250,280, 150,60);
		btn.setFont(new Font("Bookman Old Style" , Font.BOLD , 20));
		btn.setBackground(Color.yellow);
		back.add(btn);
		
		
		JLabel noAccount = new JLabel ("¿Don't have an account?");
		noAccount.setBounds(330, 400, 300, 150);
		noAccount.setForeground(Color.white);
		noAccount.setFont(new Font("Bookman Old Style" , Font.BOLD , 10));
		login.add(noAccount);
		
		JButton signUp = new JButton ("Sign Up");
		signUp.setBounds(320,500, 150,50);
		signUp.setFont(new Font("Bookman Old Style" , Font.BOLD , 20));
		signUp.setBackground(Color.yellow);
		login.add(signUp);
		
		this.add(login);
		
	}
	
	public void admin() {
		
		JPanel adminPanel = new JPanel() ;
		adminPanel.setSize(this.getWidth(), this.getHeight());
		adminPanel.setLocation(0, 0);
		adminPanel.setBackground(Color.gray);
		adminPanel.setLayout(null);
		
		
		JMenuBar barra = new JMenuBar();
		JMenu menuFile = new JMenu("Archivo");
		JMenuItem openItem = new JMenuItem("Abrir archivo...");
		JMenuItem crearItem = new JMenuItem("Crear archivo...");
		
		barra.add(menuFile);
		menuFile.add(openItem);
		menuFile.add(crearItem);
		this.setJMenuBar(barra);
		
		JLabel usersTag = new JLabel ("Usuarios" , 0);
		usersTag.setFont(new Font("Agency FB" , Font.BOLD , 34));
		usersTag.setForeground(Color.white);
		usersTag.setLocation(350, 30);
		usersTag.setSize(300, 70);
		usersTag.setOpaque(true);
		usersTag.setBackground(Color.darkGray);
		adminPanel.add(usersTag);
		
		
		JLabel titleWidget = new JLabel("Total de Usuarios" , 0);
		titleWidget.setBounds(40, 120, 300, 40);
		titleWidget.setFont(new Font("Agency FB" , Font.BOLD , 24));
		titleWidget.setForeground(Color.white);
		adminPanel.add(titleWidget);
		
		JLabel contentWidget = new JLabel("100" , 0);
		contentWidget.setBounds(40, 150, 300, 40);
		contentWidget.setFont(new Font("Agency FB" , Font.BOLD , 14));
		contentWidget.setForeground(Color.white);
		adminPanel.add(contentWidget);
		
		JLabel widget = new JLabel();
		widget.setBounds(40, 120, 300, 80);
		widget.setOpaque(true);
		widget.setBackground(Color.black);
		adminPanel.add(widget);
		
		JButton download = new JButton ("Exportar");
		download.setBounds(700, 230, 100, 40);
		download.setOpaque(true);
		download.setBackground(Color.magenta);
		adminPanel.add(download);
		
		JButton addUser = new JButton ("Añadir");
		addUser.setBounds(840, 230, 100, 40);
		addUser.setOpaque(true);
		addUser.setBackground(Color.magenta);
		adminPanel.add(addUser);
		
		String titles[]= {"NO.control" , "Nombre" , "Apellidos" , "Semestre" , "Promedio" , "Acciones"};
		String tableData [][] = {
				{"NO.control" , "Nombre" , "Apellidos" , "Semestre" , "Promedio" , "Acciones"},
				{"NO.control" , "Nombre" , "Apellidos" , "Semestre" , "Promedio" , "Acciones"},
				{"NO.control" , "Nombre" , "Apellidos" , "Semestre" , "Promedio" , "Acciones"},
				{"NO.control" , "Nombre" , "Apellidos" , "Semestre" , "Promedio" , "Acciones"},
				{"NO.control" , "Nombre" , "Apellidos" , "Semestre" , "Promedio" , "Acciones"},
				{"NO.control" , "Nombre" , "Apellidos" , "Semestre" , "Promedio" , "Acciones"},
				{"NO.control" , "Nombre" , "Apellidos" , "Semestre" , "Promedio" , "Acciones"},
		};
		
		JTable tablaUsuarios = new JTable (tableData, titles);
		//tablaUsuarios.setBounds(40,280,920,300);
		JScrollPane tableScroll = new JScrollPane (tablaUsuarios);
		tableScroll.setBounds(40,280,920,300);
		adminPanel.add(tableScroll);
		
		
		
		this.add(adminPanel);
		
	}
	
	public void tareaCalculadora() {

		
		JPanel calculadoraPanel = new JPanel() ;
		calculadoraPanel.setSize(this.getWidth(), this.getHeight());
		calculadoraPanel.setLocation(0, 0);
		
		//calculadoraPanel.setBounds(300, 50, 400, 550);
		calculadoraPanel.setBackground(Color.black);
		calculadoraPanel.setLayout(null);
		
		
		JLabel resultadoBtn = new JLabel ();
		resultadoBtn.setBounds(20, 30, 350, 40);
		resultadoBtn.setBackground(Color.white);
		resultadoBtn.setOpaque(true);
		calculadoraPanel.add(resultadoBtn);
		
		JButton clearBtn = new JButton("CE");
		clearBtn.setBounds(20, 90, 70, 40);
		clearBtn.setBackground(Color.darkGray);
		clearBtn.setForeground(Color.white);
		clearBtn.setOpaque(true);
		calculadoraPanel.add(clearBtn);
		
		JButton borrarBtn = new JButton("Borrar");
		borrarBtn.setBounds(100, 90, 270, 40);
		borrarBtn.setBackground(Color.gray);
		borrarBtn.setForeground(Color.white);
		borrarBtn.setOpaque(true);
		calculadoraPanel.add(borrarBtn);
		
		JButton sieteBtn = new JButton("7");
		sieteBtn.setBounds(20, 150, 70, 40);
		sieteBtn.setBackground(Color.darkGray);
		sieteBtn.setForeground(Color.white);
		sieteBtn.setOpaque(true);
		calculadoraPanel.add(sieteBtn);
		
		JButton ochoBtn = new JButton("8");
		ochoBtn.setBounds(110, 150, 70, 40);
		ochoBtn.setBackground(Color.darkGray);
		ochoBtn.setForeground(Color.white);
		ochoBtn.setOpaque(true);
		calculadoraPanel.add(ochoBtn);
		
		JButton nueveBtn = new JButton("9");
		nueveBtn.setBounds(200, 150, 70, 40);
		nueveBtn.setBackground(Color.darkGray);
		nueveBtn.setForeground(Color.white);
		nueveBtn.setOpaque(true);
		calculadoraPanel.add(nueveBtn);
		
		JButton divisionBtn = new JButton("/");
		divisionBtn.setBounds(290, 150, 80, 40);
		divisionBtn.setBackground(Color.darkGray);
		divisionBtn.setForeground(Color.white);
		divisionBtn.setOpaque(true);
		calculadoraPanel.add(divisionBtn);
		
		JButton cuatroBtn = new JButton("4");
		cuatroBtn.setBounds(20, 210, 70, 40);
		cuatroBtn.setBackground(Color.darkGray);
		cuatroBtn.setForeground(Color.white);
		cuatroBtn.setOpaque(true);
		calculadoraPanel.add(cuatroBtn);
		
		JButton cincoBtn = new JButton("5");
		cincoBtn.setBounds(110, 210, 70, 40);
		cincoBtn.setBackground(Color.darkGray);
		cincoBtn.setForeground(Color.white);
		cincoBtn.setOpaque(true);
		calculadoraPanel.add(cincoBtn);
		
		JButton seisBtn = new JButton("6");
		seisBtn.setBounds(200, 210, 70, 40);
		seisBtn.setBackground(Color.darkGray);
		seisBtn.setForeground(Color.white);
		seisBtn.setOpaque(true);
		calculadoraPanel.add(seisBtn);
		
		JButton multiplicacionBtn = new JButton("*");
		multiplicacionBtn.setBounds(290, 210, 80, 40);
		multiplicacionBtn.setBackground(Color.darkGray);
		multiplicacionBtn.setForeground(Color.white);
		multiplicacionBtn.setOpaque(true);
		calculadoraPanel.add(multiplicacionBtn);
		
		
		JButton unoBtn = new JButton ("1");
		unoBtn.setBounds(20, 270, 70, 40);
		unoBtn.setBackground(Color.darkGray);
		unoBtn.setForeground(Color.white);
		unoBtn.setOpaque(true);
		calculadoraPanel.add(unoBtn);
		
		JButton dosBtn = new JButton ("2");
		dosBtn.setBounds(110, 270, 70, 40);
		dosBtn.setBackground(Color.darkGray);
		dosBtn.setForeground(Color.white);
		dosBtn.setOpaque(true);
		calculadoraPanel.add(dosBtn);
		
		JButton tresBtn = new JButton ("2");
		tresBtn.setBounds(200, 270, 70, 40);
		tresBtn.setBackground(Color.darkGray);
		tresBtn.setForeground(Color.white);
		tresBtn.setOpaque(true);
		calculadoraPanel.add(tresBtn);
		
		JButton restaBtn = new JButton("-");
		restaBtn.setBounds(290, 270, 80, 40);
		restaBtn.setBackground(Color.darkGray);
		restaBtn.setForeground(Color.white);
		restaBtn.setOpaque(true);
		calculadoraPanel.add(restaBtn);
		
		
		JButton ceroBtn = new JButton ("0");
		ceroBtn.setBounds(20, 330, 70, 40);
		ceroBtn.setBackground(Color.darkGray);
		ceroBtn.setForeground(Color.white);
		ceroBtn.setOpaque(true);
		calculadoraPanel.add(ceroBtn);
		
		JButton puntoBtn = new JButton (".");
		puntoBtn.setBounds(110, 330, 70, 40);
		puntoBtn.setBackground(Color.darkGray);
		puntoBtn.setForeground(Color.white);
		puntoBtn.setOpaque(true);
		calculadoraPanel.add(puntoBtn);
		
		JButton igualBtn = new JButton ("=");
		igualBtn.setBounds(200, 330, 70, 40);
		igualBtn.setBackground(Color.darkGray);
		igualBtn.setForeground(Color.white);
		igualBtn.setOpaque(true);
		calculadoraPanel.add(igualBtn);
		
		JButton sumaBtn = new JButton("+");
		sumaBtn.setBounds(290, 330, 80, 40);
		sumaBtn.setBackground(Color.darkGray);
		sumaBtn.setForeground(Color.white);
		sumaBtn.setOpaque(true);
		calculadoraPanel.add(sumaBtn);
		

		
		this.add(calculadoraPanel);
		
	}
	
	public void calculadora() {
		
		this.setSize(480,650);
		
		JPanel panel = new JPanel() ;
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setBackground(Color.decode("#18A2A4"));
		panel.setLayout(new BorderLayout());
		
		JLabel text = new JLabel("100.00",4);
		text.setOpaque(true);
		text.setBackground(Color.white);
		text.setFont(new Font("Bookman Old Style" , Font.BOLD ,40));
		panel.add(text , BorderLayout.NORTH);
		
		JPanel centro = new JPanel ();
		centro.setBackground(Color.gray);
		centro.setLayout(new GridLayout(4,3));
		panel.add(centro , BorderLayout.CENTER);
		
		String btns[] = {"7","8","9","6","5","4","3","2","1","0",".","/"};
		
		for(int i = 0 ; i<12 ; i++) {
			JButton boton = new JButton(btns[i]);
			centro.add(boton);		
		}
		
		JPanel east = new JPanel();
		east.setBackground(Color.gray);
		east.setLayout(new GridLayout(3,1));
		panel.add(east , BorderLayout.EAST);
		
		String btns2[]= {"+" ,"-" , "="};
		
		for(int i = 0 ; i<3 ; i++) {
			JButton boton = new JButton(btns2[i]);
			east.add(boton);		
		}
		
		JPanel west = new JPanel();
		west.setBackground(Color.gray);
		west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
		panel.add(west , BorderLayout.WEST);
		
		String btns3[] = {"MC","M+","*"};
		
		for(int i = 0 ; i<3 ; i++) {
			JButton boton = new JButton(btns3[i]);
			west.add(boton);		
		}
		
		
		
		
		this.add(panel);
		
	}
	
	
	public void calculoInteres() {
		
		this.setSize(650,550);
		
		//Primer panel null
		
		JPanel panel = new JPanel() ;
		panel.setSize(this.getWidth(), this.getHeight());
		//panel.setBackground(Color.decode("#18A2A4"));
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
				
		JLabel titulo = new JLabel ("Interés");
		titulo.setBounds(80,10,150,40);
		titulo.setForeground(Color.red);
		titulo.setFont(new Font("Bookman Old Style" , Font.BOLD ,30));
		panel.add(titulo);
		
		JPanel verde = new JPanel ();
		verde.setBounds(80,80, 460, 200);
		verde.setBackground(Color.decode("#66DF57"));
		verde.setLayout(new BorderLayout());
		panel.add(verde);
		
		JLabel calcular = new JLabel ("Calcular Interés");
		calcular.setFont(new Font("Bookman Old Style" , Font.BOLD ,20));
		calcular.setForeground(Color.black);
		verde.add(calcular , BorderLayout.NORTH);
		
		//panel que se pone en el centro del BorderLayout y gridlayout para poner las etiquetas
		
		JPanel info = new JPanel ();
		info.setBackground(Color.decode("#66DF57"));
		info.setLayout(new GridLayout(3,2,1,20));
		verde.add(info, BorderLayout.CENTER);
		
		JLabel capital = new JLabel ("Capital:");
		capital.setFont(new Font("Bookman Old Style" , Font.BOLD ,10));
		info.add(capital);
		JTextField capitalEspacio = new JTextField();
		info.add(capitalEspacio);
		
		JLabel tiempo = new JLabel ("Tiempo:");
		tiempo.setFont(new Font("Bookman Old Style" , Font.BOLD ,10));
		info.add(tiempo);
		JTextField tiempoEspacio = new JTextField();
		info.add(tiempoEspacio);
		
		JLabel tasa = new JLabel ("Tasa:");
		tasa.setFont(new Font("Bookman Old Style" , Font.BOLD ,10));
		info.add(tasa);
		JTextField tasaEspacio = new JTextField();
		info.add(tasaEspacio);
		
		// Se agregan los botones con un flowlayout en la parte sur del BorderLayout
		
		JPanel botones = new JPanel ();
		botones.setLayout(new FlowLayout());
		botones.setOpaque(false);
		verde.add(botones , BorderLayout.SOUTH);
		
		JButton btn1 = new JButton ("Calcular");
		btn1.setFont(new Font("Bookman Old Style" , Font.BOLD ,10));
		btn1.setBackground(Color.black);
		btn1.setForeground(Color.white);
		
		JButton btn2 = new JButton ("Cancelar");
		btn2.setFont(new Font("Bookman Old Style" , Font.BOLD ,10));
		btn2.setForeground(Color.white);
		btn2.setBackground(Color.black);
		
		botones.add(btn1);
		botones.add(btn2);
		

		JPanel rojo = new JPanel ();
		rojo.setBounds(80,300, 460, 150);
		rojo.setBackground(Color.decode("#DF6757"));
		rojo.setLayout(new BorderLayout());
		panel.add(rojo);
		
		JPanel resultado = new JPanel ();
		resultado.setBackground(Color.decode("#DF6757"));
		resultado.setLayout(new GridLayout(2,2,1,70));
		rojo.add(resultado,BorderLayout.CENTER);
		
		JLabel interes = new JLabel ("Interés:");
		interes.setFont(new Font("Bookman Old Style" , Font.BOLD ,10));
		resultado.add(interes);
		JTextField interesEspacio = new JTextField();
		resultado.add(interesEspacio);
		
		JLabel monto = new JLabel ("Monto:");
		monto.setFont(new Font("Bookman Old Style" , Font.BOLD ,10));
		resultado.add(monto);
		JTextField montoEspacio = new JTextField();
		resultado.add(montoEspacio);
		
		
		
		

		this.add(panel);
		
	}
		
	
}
		
		
	
	
