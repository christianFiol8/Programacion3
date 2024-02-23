import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
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
		this.setSize(400,450);
		this.setLocation(300, 50);
		
		
		
			
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		
		this.setLayout(null);
		
		
		this.iniciarComponentes();
		
	}
	
	public void iniciarComponentes() {
		
		//this.login();		
		//this.registro();
		//this.admin();
		this.calculadora();
		
		
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
	
	
	public void calculadora() {
		
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
		
		
		///////////
		
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
}
		
		
	
	
