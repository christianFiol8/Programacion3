package Unidad4;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	
	JPanel loginPanel;
	JPanel bienvenidoPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 564, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.login(frame);
		
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
		
		
		
		textField = new JTextField();
		textField.setBounds(72, 189, 429, 30);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Bookman Old Style" , Font.BOLD , 20));
		lblNewLabel_2.setBounds(72, 256, 168, 13);
		loginPanel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(72, 290, 429, 30);
		loginPanel.add(passwordField);
		passwordField.setColumns(10);
		
	
		
		/*textField_1 = new JTextField();
		textField_1.setBounds(72, 290, 429, 30);
		loginPanel.add(textField_1);
		textField_1.setColumns(10);*/
		
		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText().trim();
		        String password = passwordField.getText().trim();

		        // Leer y analizar el archivo JSON
		        String filePath = "src/users.json";
		        try {
		            JSONParser parser = new JSONParser();
		            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filePath));
		            
		            // Validar usuario y contraseña
		            boolean found = false;
		            for (Object obj : jsonArray) {
		                JSONObject user = (JSONObject) obj;
		                String usuario = (String) user.get("Usuario");
		                String contraseña = (String) user.get("Contraseña");
		                
		                if (username.equals(usuario) && password.equals(contraseña)) {
		                    found = true;
		                    break;
		                }
		            }

		            // Mostrar mensajes según la validación
		            if (found) {
		                JOptionPane.showMessageDialog(null, "¡Bienvenido!");
		                // Cambiar a la pantalla de bienvenida
		                cambiarPantalla();
		                pantallaBienvenido(frame);
		                frame.revalidate();
		                frame.repaint();
		               
		            } else {
		                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
		            }
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
				
			
		});
		btnNewButton.setBounds(72, 387, 429, 47);
		loginPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("¿Aun no tienes cuenta? Registrate Aqui");
		loginPanel.add(btnNewButton_1);
		
		
	}
	
	public void pantallaBienvenido(JFrame frame) {
	
		bienvenidoPanel = new JPanel();
		bienvenidoPanel.setBackground(Color.decode("#66B7A1"));
		frame.getContentPane().add(bienvenidoPanel, BorderLayout.CENTER);
		bienvenidoPanel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Bienvenido");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(222, 63, 100, 13);
		bienvenidoPanel.add(lblNewLabel_3);
		
	}
	
	public void cambiarPantalla() {
		
		Component[] elementos = frame.getContentPane().getComponents();
		for(int i=0 ; i<elementos.length ; i++) {
			if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
				
				JPanel panel = ((JPanel) elementos[i]);
				
				frame.remove(panel);
				
			}
		}
	}

}
