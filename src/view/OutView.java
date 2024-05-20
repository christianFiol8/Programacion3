package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controllers.OutController;
import models.OutModel;

public class OutView {

	private JFrame frame;
	private OutController controller;
	private OutModel out;
	
	
	public OutView() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame ();
		frame.setVisible(true);
		frame.setBounds(100, 100, 570, 713);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,1,0,1));
		
		out = new OutModel();
	}
	
	public void login() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#4798AD"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);


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

		
		JTextField textField = new JTextField();
		textField.setBounds(72, 189, 429, 30);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Bookman Old Style" , Font.BOLD , 20));
		lblNewLabel_2.setBounds(72, 256, 168, 13);
		panel.add(lblNewLabel_2);

		JTextField textField_1 = new JTextField();
		textField_1.setBounds(72, 290, 429, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				out.login(textField.getText() , textField_1.getText());

			}
		});
		btnNewButton.setBounds(70, 387, 440, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("¿No tienes cuenta?");
		btnNewButton1.setBounds(70, 450, 440, 30);
		btnNewButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				frame.remove(panel);
				registro();
				
				
				
			}});
		panel.add(btnNewButton1);
		
		frame.add(panel);
		frame.repaint();
		frame.revalidate();
		
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

		JTextField textField_2 = new JTextField();
		textField_2.setBounds(69, 156, 180, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Bookman Old Style" , Font.BOLD , 10));
		lblNewLabel_2.setBounds(288, 133, 73, 13);
		panel_1.add(lblNewLabel_2);

		JTextField textField_3 = new JTextField();
		textField_3.setBounds(69, 222, 435, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Correo Electrónico");
		lblNewLabel_3.setFont(new Font("Bookman Old Style" , Font.BOLD , 10));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(69, 197, 155, 13);
		panel_1.add(lblNewLabel_3);



		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(288, 156, 216, 19);
		panel_1.add(textField_5);

		JLabel lblNewLabel_4 = new JLabel("Contraseña");
		lblNewLabel_4.setFont(new Font("Bookman Old Style" , Font.BOLD , 10));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(69, 268, 155, 13);
		panel_1.add(lblNewLabel_4);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(69, 291, 435, 19);
		panel_1.add(passwordField);

		JLabel lblNewLabel_5 = new JLabel("Confirmar Contraseña");
		lblNewLabel_5.setFont(new Font("Bookman Old Style" , Font.BOLD , 10));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(69, 334, 155, 13);
		panel_1.add(lblNewLabel_5);

		JPasswordField passwordField_1 = new JPasswordField();
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

				
			}
		});
		btnNewButton.setBounds(70, 475, 435, 19);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("¿Ya tienes cuenta?");
		btnNewButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				frame.remove(panel_1);
				login();
				
			}});
		btnNewButton1.setBounds(70, 520, 435, 19);
		panel_1.add(btnNewButton1);
		
		 frame.add(panel_1);
		 frame.getContentPane().repaint();
		 frame.getContentPane().revalidate();
		
	}

}
