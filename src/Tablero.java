import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;

public class Tablero  implements KeyListener {

	private JFrame frame;
	private JPanel tableroDibujo;
	
	private int x=300 , y=200;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero window = new Tablero();
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
	public Tablero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 643, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tableroDibujo = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
                g.setColor(Color.red); // Color del rectángulo
                g.fillRect(x,y,50,50);
			}
		};
		
		frame.getContentPane().add(tableroDibujo, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.green);		
		frame.getContentPane().add(panel_1 , BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		panel_1.add(btnNewButton);
		
		frame.addKeyListener(this);
		frame.setFocusable(true);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println(e.getKeyCode());
		
		switch(e.getKeyCode()) {
		
			case 38: //Flecha Arriba
				y-=10;
				break;
			case 40: //Flecha Abajo
				y+=10;
				break;
			case 37: //Flecha Izquierda
				x-=10;
				break;
			case 39: //Flecha Derecha
				x+=10;
				break;
				
			
			
		}
	
		//bleroDibujo.paintComponents(null);
		//ame.repaint();
		tableroDibujo.repaint();
		//bleroDibujo.update(null);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
