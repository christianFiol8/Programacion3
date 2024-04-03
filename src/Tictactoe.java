import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class Tictactoe {

	private JFrame frame;
	private static boolean turno;
	private static int contX =0 , contO=0;
	
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	JButton btnNewButton_9;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		turno=true;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tictactoe window = new Tictactoe();
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
	public Tictactoe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 3, 20, 10));
		
		 btnNewButton_1 = new JButton("");
		 btnNewButton_2 = new JButton("");
		 btnNewButton_3 = new JButton("");
		 btnNewButton_4 = new JButton("");
		 btnNewButton_5 = new JButton("");
		 btnNewButton_6 = new JButton("");
		 btnNewButton_8 = new JButton("");
		 btnNewButton_7 = new JButton("");
		 btnNewButton_9= new JButton("");
		
		btnNewButton_1.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					JButton btn= (JButton)e.getSource();
					click(btn);
					
					
			}});
		panel.add(btnNewButton_1);
		
		
		btnNewButton_2.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					JButton btn= (JButton)e.getSource();
					click(btn);
			}});
		panel.add(btnNewButton_2);
		
		btnNewButton_3.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					JButton btn= (JButton)e.getSource();
					click(btn);
			}});
		panel.add(btnNewButton_3);
		
		btnNewButton_6.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					JButton btn= (JButton)e.getSource();
					click(btn);
			}});
		panel.add(btnNewButton_6);
		
		
		btnNewButton_4.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					JButton btn= (JButton)e.getSource();
					click(btn);
			}});
		panel.add(btnNewButton_4);
		
		
		btnNewButton_9.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					JButton btn= (JButton)e.getSource();
					click(btn);
			}});
		panel.add(btnNewButton_9);
		
		btnNewButton_5.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					JButton btn= (JButton)e.getSource();
					click(btn);
			}});
		panel.add(btnNewButton_5);
		
		
		btnNewButton_7.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					JButton btn= (JButton)e.getSource();
					click(btn);
			}});
		panel.add(btnNewButton_7);
		
		btnNewButton_8.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					JButton btn= (JButton)e.getSource();
					click(btn);
			}});
		panel.add(btnNewButton_8);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 128));
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		//Boton reiniciar
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Component[] elementos = panel.getComponents();
				
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) {
						JButton btn = ((JButton) elementos[i]);
						
						btn.setText("");
					}
				}
				
			}
		});
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 192));
		frame.getContentPane().add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel("Victorias X =");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel_2.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Victorias O =");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_2.add(lblNewLabel_1);
	
	}
	
	
	
	public void click(JButton btn) {
		
		if(btn.getText().equals("")) {
			if(turno) {
				btn.setText("X");
				turno=false;
			}else {
				btn.setText("O");
				turno=true;
			}
		}
		
		 // Victoria
	    // Filas
	    if (btnNewButton_1.getText().equals(btnNewButton_2.getText()) && btnNewButton_2.getText().equals(btnNewButton_3.getText()) && !btnNewButton_1.getText().equals("")) {
	    	
	    	
	    	if(btnNewButton_1.getText().equals("X")&& btnNewButton_2.getText().equals("X") && btnNewButton_3.getText().equals("X")) {
	    		contX++;
		    	lblNewLabel.setText("Victorias X=" + contX);
		    	JOptionPane.showMessageDialog(null," Ganó el jugador X!");
	    	}
	    	else {
	    		contO++;
	    		lblNewLabel_1.setText("Victorias O=" + contO);
	    		JOptionPane.showMessageDialog(null," Ganó el jugador O!");
	    	}
	        
	    }
	    if (btnNewButton_6.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_9.getText()) && !btnNewButton_4.getText().equals("")) {
	    
	    	
	    	if(btnNewButton_6.getText().equals("X")&& btnNewButton_4.getText().equals("X") && btnNewButton_9.getText().equals("X")) {
	    		contX++;
		    	lblNewLabel.setText("Victorias X=" + contX);
		    	JOptionPane.showMessageDialog(null," Ganó el jugador X!");
	    	}
	    	else {
	    		contO++;
	    		lblNewLabel_1.setText("Victorias O=" + contO);
	    		JOptionPane.showMessageDialog(null," Ganó el jugador O!");
	    	}
	        
	    }
	    if (btnNewButton_5.getText().equals(btnNewButton_7.getText()) && btnNewButton_7.getText().equals(btnNewButton_8.getText()) && !btnNewButton_5.getText().equals("")) {
	        
	        if(btnNewButton_5.getText().equals("X")&& btnNewButton_7.getText().equals("X") && btnNewButton_8.getText().equals("X")) {
	    		contX++;
		    	lblNewLabel.setText("Victorias X=" + contX);
		    	JOptionPane.showMessageDialog(null," Ganó el jugador X!");
	    	}
	    	else {
	    		contO++;
	    		lblNewLabel_1.setText("Victorias O=" + contO);
	    		JOptionPane.showMessageDialog(null," Ganó el jugador O!");
	    	}
	        
	    }

	    // Columnas
	    if (btnNewButton_1.getText().equals(btnNewButton_6.getText()) && btnNewButton_6.getText().equals(btnNewButton_5.getText()) && !btnNewButton_1.getText().equals("")) {
	        
	        if(btnNewButton_1.getText().equals("X")&& btnNewButton_6.getText().equals("X") && btnNewButton_5.getText().equals("X")) {
	    		contX++;
		    	lblNewLabel.setText("Victorias X=" + contX);
		    	JOptionPane.showMessageDialog(null," Ganó el jugador X!");
	    	}
	    	else {
	    		contO++;
	    		lblNewLabel_1.setText("Victorias O=" + contO);
	    		JOptionPane.showMessageDialog(null," Ganó el jugador O!");
	    	}
	        
	    }
	    if (btnNewButton_2.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_7.getText()) && !btnNewButton_2.getText().equals("")) {
	        
	        if(btnNewButton_2.getText().equals("X")&& btnNewButton_4.getText().equals("X") && btnNewButton_7.getText().equals("X")) {
	    		contX++;
		    	lblNewLabel.setText("Victorias X=" + contX);
		    	JOptionPane.showMessageDialog(null," Ganó el jugador X!");
	    	}
	    	else {
	    		contO++;
	    		lblNewLabel_1.setText("Victorias O=" + contO);
	    		JOptionPane.showMessageDialog(null," Ganó el jugador O!");
	    	}
	        
	    }
	    if (btnNewButton_3.getText().equals(btnNewButton_9.getText()) && btnNewButton_9.getText().equals(btnNewButton_8.getText()) && !btnNewButton_3.getText().equals("")) {
	        
	        if(btnNewButton_3.getText().equals("X")&& btnNewButton_9.getText().equals("X") && btnNewButton_8.getText().equals("X")) {
	    		contX++;
		    	lblNewLabel.setText("Victorias X=" + contX);
		    	JOptionPane.showMessageDialog(null," Ganó el jugador X!");
	    	}
	    	else {
	    		contO++;
	    		lblNewLabel_1.setText("Victorias O=" + contO);
	    		JOptionPane.showMessageDialog(null," Ganó el jugador O!");
	    	}
	        
	    }

	    // Diagonales
	    if (btnNewButton_1.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_8.getText()) && !btnNewButton_1.getText().equals("")) {
	        
	        if(btnNewButton_1.getText().equals("X")&& btnNewButton_4.getText().equals("X") && btnNewButton_8.getText().equals("X")) {
	    		contX++;
		    	lblNewLabel.setText("Victorias X=" + contX);
		    	JOptionPane.showMessageDialog(null," Ganó el jugador X!");
	    	}
	    	else {
	    		contO++;
	    		lblNewLabel_1.setText("Victorias O=" + contO);
	    		JOptionPane.showMessageDialog(null," Ganó el jugador O!");
	    	}
	        
	    }
	    if (btnNewButton_3.getText().equals(btnNewButton_4.getText()) && btnNewButton_4.getText().equals(btnNewButton_5.getText()) && !btnNewButton_3.getText().equals("")) {
	        
	        if(btnNewButton_3.getText().equals("X")&& btnNewButton_4.getText().equals("X") && btnNewButton_5.getText().equals("X")) {
	    		contX++;
		    	lblNewLabel.setText("Victorias X=" + contX);
		    	JOptionPane.showMessageDialog(null," Ganó el jugador X!");
	    	}
	    	else {
	    		contO++;
	    		lblNewLabel_1.setText("Victorias O=" + contO);
	    		JOptionPane.showMessageDialog(null," Ganó el jugador O!");
	    	}
	    }
		
	    
	    
	    
		
		
		
			
	}
		
}
