import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.JScrollBar;

public class Builder {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Builder window = new Builder();
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
	public Builder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(new Color(128, 255, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro Usuarios");
		lblNewLabel.setFont(new Font("Cambria Math", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(26, 10, 217, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 0));
		panel.setBounds(26, 49, 522, 491);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 2, 6, 6));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 255, 255));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Datos Generales");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 15));
		panel_2.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(128, 255, 255));
		panel_2.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(new GridLayout(7, 2, 0, 5));
		
		JLabel lblNewLabel_7 = new JLabel("Nombres");
		panel_10.add(lblNewLabel_7);
		
		textField = new JTextField();
		panel_10.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Apellido Paterno");
		panel_10.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		panel_10.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Apellido Materno");
		panel_10.add(lblNewLabel_9);
		
		textField_2 = new JTextField();
		panel_10.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Fecha de Nacimiento");
		panel_10.add(lblNewLabel_10);
		
		textField_3 = new JTextField();
		panel_10.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Sexo");
		panel_10.add(lblNewLabel_11);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBackground(new Color(128, 255, 255));
		panel_10.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Nacionalidad");
		panel_10.add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(new Color(128, 255, 255));
		panel_10.add(rdbtnNewRadioButton);
		
		String[]nacionalidad= {"Perú" , "México" , "Argentina" , "Estados Unidos"};
		
		JComboBox comboBox = new JComboBox(nacionalidad);
		comboBox.setToolTipText("");
		panel_10.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 192));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Peril de Usuario");
		lblNewLabel_2.setBounds(0, 0, 258, 18);
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.BOLD, 15));
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 128, 192));
		panel_11.setBounds(0, 164, 258, 78);
		panel_1.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox_1.setBackground(new Color(255, 128, 192));
		panel_11.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 192));
		panel_11.add(chckbxNewCheckBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 128));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Datos opcionales");
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.BOLD, 15));
		panel_3.add(lblNewLabel_3, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 128, 128));
		panel_3.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 128, 128));
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Descripción");
		lblNewLabel_4.setBounds(30, 30, 65, 16);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_6.add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		panel_6.add(scrollPane);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 56, 96, 36);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 128, 128));
		panel_5.add(panel_7);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_7.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		
		JLabel lblNewLabel_5 = new JLabel("Preferencias");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 1;
		panel_7.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		
		String[] preferencia= {"Dibujar" , "Deportes" , "Peliculas" , "Series" , "Otro"};
		
		
		JComboBox comboBox_1 = new JComboBox(preferencia);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 0;
		gbc_comboBox_1.gridy = 2;
		panel_7.add(comboBox_1, gbc_comboBox_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 255, 255));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(81, 82, 85, 21);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(81, 113, 85, 21);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setBounds(81, 144, 85, 21);
		panel_4.add(btnNewButton_2);
		frame.setBounds(100, 100, 592, 649);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
