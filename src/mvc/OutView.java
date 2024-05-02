package mvc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class OutView {

	JPanel panel;
	OutModel model;
	
	
	public OutView() {
		
		panel = new JPanel();
		
		model=new OutModel();
		
	}
	
	public JPanel login() {
		
		panel.setBackground(Color.blue);
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
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(72, 290, 429, 30);
		panel.add(passwordField);
		passwordField.setColumns(10);	
		
		
		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.setBounds(70,400, 430, 20);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(model.login(textField.getText() , passwordField.getText())) {
					JOptionPane.showMessageDialog(null, "Bienvenido");
				}else {
					JOptionPane.showMessageDialog(null, "Verificar Datos");
				}
				
			}});
		panel.add(btnNewButton);
		
		
		return panel;
	}
	
	public JPanel registro() {
		
		panel.setBackground(Color.green);
		return panel;
	}

}
