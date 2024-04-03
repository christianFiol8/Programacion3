import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;

public class NumberPuzzle {

	private JFrame frame;
	
	
	
	JPanel panel;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	JButton btnNewButton_9;
	JButton btnNewButton_10;
	JButton btnNewButton_11;
	JButton btnNewButton_12;
	JButton btnNewButton_13;
	JButton btnNewButton_14;
	JButton btnNewButton_15;
	JButton btnNewButton_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberPuzzle window = new NumberPuzzle();
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
	public NumberPuzzle() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 753, 692);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 128, 128), 2, true));
		panel.setBackground(new Color(255, 255, 0));
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 20, 10));
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.setText("1");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_2.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_3.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("3");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_5.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_4.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_7.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.setBackground(new Color(255, 255, 255));
		btnNewButton_9.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_9.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("7");
		btnNewButton_10.setBackground(new Color(255, 255, 255));
		btnNewButton_10.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_10.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_1.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_6.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_13 = new JButton("10");
		btnNewButton_13.setBackground(new Color(255, 255, 255));
		btnNewButton_13.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_13.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_8 = new JButton("11");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_8.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_11 = new JButton("12");
		btnNewButton_11.setBackground(new Color(255, 255, 255));
		btnNewButton_11.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_11.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("13");
		btnNewButton_12.setBackground(new Color(255, 255, 255));
		btnNewButton_12.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_12.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton("14");
		btnNewButton_14.setBackground(new Color(255, 255, 255));
		btnNewButton_14.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_14.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("15");
		btnNewButton_15.setBackground(new Color(255, 255, 255));
		btnNewButton_15.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_15.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.setBackground(new Color(255, 255, 255));
		btnNewButton_16.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_16);
		
		
		//Paneles
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 128, 192));
		frame.getContentPane().add(panel_4, BorderLayout.SOUTH);
		
		//Boton reinciar
		
		JButton btnNewButton = new JButton("Reiniciar");
		panel_4.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	public void random() {
		
		/*Random r = new Random();
		
		for(int i =0; i<numeros.length ; i++) {
			numeros[i]=r.nextInt();
		}*/
	}
	
	public void mover(JButton btn) {
		
	}

}
