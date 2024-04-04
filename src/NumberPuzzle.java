import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Timer;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class NumberPuzzle {

	private JFrame frame;
	
	private JButton[] botones = new JButton[16];
	
	private static boolean ganador;
	
	
	JLabel lblNewLabel;
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
		
		ganador = false;
		
		
		
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
		random();
		
		
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
		botones[0]=btnNewButton_2;
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_3 = new JButton("2");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_3.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_3);
		botones[1]=btnNewButton_3;
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_5 = new JButton("3");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_5.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_5);
		botones[2]=btnNewButton_5;
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_4.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_4);
		botones[3]=btnNewButton_4;
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_7.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_7);
		botones[4]=btnNewButton_7;
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.setBackground(new Color(255, 255, 255));
		btnNewButton_9.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_9.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_9);
		botones[5]=btnNewButton_9;
		btnNewButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_10 = new JButton("7");
		btnNewButton_10.setBackground(new Color(255, 255, 255));
		btnNewButton_10.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_10.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_10);
		botones[6]=btnNewButton_10;
		btnNewButton_10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_1.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_1);
		botones[7]=btnNewButton_1;
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_6.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_6);
		botones[8]=btnNewButton_6;
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_13 = new JButton("10");
		btnNewButton_13.setBackground(new Color(255, 255, 255));
		btnNewButton_13.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_13.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_13);
		botones[9]=btnNewButton_13;
		btnNewButton_13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_8 = new JButton("11");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_8.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_8);
		botones[10]=btnNewButton_8;
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_11 = new JButton("12");
		btnNewButton_11.setBackground(new Color(255, 255, 255));
		btnNewButton_11.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_11.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_11);
		botones[11]=btnNewButton_11;
		btnNewButton_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_12 = new JButton("13");
		btnNewButton_12.setBackground(new Color(255, 255, 255));
		btnNewButton_12.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_12.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_12);
		botones[12]=btnNewButton_12;
		btnNewButton_12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_14 = new JButton("14");
		btnNewButton_14.setBackground(new Color(255, 255, 255));
		btnNewButton_14.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_14.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_14);
		botones[13]=btnNewButton_14;
		btnNewButton_14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_15 = new JButton("15");
		btnNewButton_15.setBackground(new Color(255, 255, 255));
		btnNewButton_15.setFont(new Font("Bookman Old Style" , Font.BOLD , 30));
		btnNewButton_15.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_15);
		botones[14]=btnNewButton_15;
		btnNewButton_15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.setBackground(new Color(255, 255, 255));
		btnNewButton_16.setBorder(new LineBorder(new Color(200, 200, 200), 6, true));
		panel.add(btnNewButton_16);
		botones[15]=btnNewButton_16;
		btnNewButton_16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn= (JButton)e.getSource();
				mover(btn);
			}
			
		});
		
		
		//Paneles
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("NUMBERS PUZZLE");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 0));
		frame.getContentPane().add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 128, 192));
		frame.getContentPane().add(panel_4, BorderLayout.SOUTH);
		
		//Boton de iniciar el tiempo
		JButton btnNewButton_17 = new JButton("Iniciar");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		panel_4.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("Pausa");
		panel_4.add(btnNewButton_18);
		
		btnNewButton_18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Component[] elementos = panel.getComponents();
				
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) {
						JButton btn = ((JButton) elementos[i]);
						
						btn.setEnabled(false);
					}
				}
				
			}});
		
		JButton btnNewButton_19 = new JButton("Reanudar");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Component[] elementos = panel.getComponents();
				
				for(int i=0 ; i<elementos.length ; i++) {
					if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) {
						JButton btn = ((JButton) elementos[i]);
						
						btn.setEnabled(true);
					}
				}
				
			}
		});
		panel_4.add(btnNewButton_19);
		
		
		//Boton reinciar
		
		JButton btnNewButton = new JButton("Nuevo Tablero");
		panel_4.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				random();
			}
			
		});
	}
	
	public void random() {
		Collections.shuffle(Arrays.asList(botones));
		JPanel panel = (JPanel) frame.getContentPane().getComponent(0);
        panel.removeAll();
        for (int i=0 ; i<botones.length ; i++) {
            panel.add(botones[i]);
        }
        panel.revalidate();
        panel.repaint();
		 
	}
	
	public void mover(JButton btn) {
		 int indiceClicado = -1;
		    for (int i = 0; i < botones.length; i++) {
		        if (botones[i] == btn) {
		            indiceClicado = i;
		            
		        }
		    }
		    
		    // espacio en blanco
		    int indiceEspacio = -1;
		    if (indiceClicado - 1 >= 0 && botones[indiceClicado - 1].getText().equals("")) { // Espacio izquierda
		        indiceEspacio = indiceClicado - 1;
		    } else if (indiceClicado + 1 < botones.length && botones[indiceClicado + 1].getText().equals("")) { // Espacio derecha
		        indiceEspacio = indiceClicado + 1;
		    } else if (indiceClicado - 4 >= 0 && botones[indiceClicado - 4].getText().equals("")) { // Espacio arriba
		        indiceEspacio = indiceClicado - 4;
		    } else if (indiceClicado + 4 < botones.length && botones[indiceClicado + 4].getText().equals("")) { // Espacio abajo
		        indiceEspacio = indiceClicado + 4;
		    }
		    
		    // Intercambiar botones
		    if (indiceEspacio != -1) {
		        JButton aux = botones[indiceEspacio];
		        botones[indiceEspacio] = botones[indiceClicado];
		        botones[indiceClicado] = aux;
		        
		        // actualizar panel
		        JPanel panel = (JPanel) frame.getContentPane().getComponent(0);
		        panel.removeAll();
		        for (int i=0 ; i<botones.length ;i++) {
		            panel.add(botones[i]);
		        }
		        panel.revalidate();
		        panel.repaint();
		    }
		    
		    
		    if(ganador==false) {
		    	for (int i = 0; i < botones.length - 1; i++) {
		            String valorBoton = botones[i].getText();
		            // buscar el orden
		            if (!valorBoton.equals(Integer.toString(i + 1))) {
		                ganador=false;
		            }
		        }
		        
		    }else {
		    	// cuando todos estan en orden
		        ganador = true;
		        JOptionPane.showMessageDialog(null, "Ganaste!");
		    }
	}
	
	
	
	
}
