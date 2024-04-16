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

public class Tablero implements KeyListener {

	private JFrame frame;
	private JPanel tableroDibujo;

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
				
                g.setColor(Color.white); // Color del rectángulo
                g.fillRect(0,0,frame.getWidth(),frame.getHeight());
			}
		};
		
		frame.getContentPane().add(tableroDibujo, BorderLayout.CENTER);
			
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setBackground(Color.green);
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
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
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
