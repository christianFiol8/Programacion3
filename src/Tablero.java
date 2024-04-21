import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;

public class Tablero  implements KeyListener {

	private JFrame frame;
	private JPanel tableroDibujo;
	
	private int x=50 , y=50;
	public int dir=0;
	private Timer timer;
	
	Player p1 = new Player(x,y,15,15,"#AC7EB9");
	
	Player meta = new Player(490,460,25,70,"#9328A0");
	
	
	Player obstaculos[]= {  new Player(20,20,20,520,"#1B4622"),
				            new Player(20,20,650,20,"#1B4622"),
				            new Player(20,525,650,20,"#1B4622"),
				            new Player(650,20,20,520,"#1B4622"),
				            new Player(20,110,80,10,"#1B4622"),
				            new Player(20,250,80,10,"#1B4622"),
				            new Player(20,350,160,10,"#1B4622"),
				            new Player(100,70,40,10,"#1B4622"),
				            new Player(100,20,10,50,"#1B4622"),
				            new Player(130,70,10,80,"#1B4622"),
				            new Player(100,140,40,10,"#1B4622"),
				            new Player(100,150,10,60,"#1B4622"),
				            new Player(100,200,40,10,"#1B4622"),
				            new Player(130,200,10,80,"#1B4622"),
				            new Player(60,140,40,10,"#1B4622"),
				            new Player(20,180,60,10,"#1B4622"),
				            new Player(100,280,40,10,"#1B4622"),
				            new Player(100,280,10,50,"#1B4622"),
				            new Player(100,320,100,10,"#1B4622"),
				            new Player(70,380,10,80,"#1B4622"),
				            new Player(20,350,160,10,"#1B4622"),
				            new Player(170,350,10,60,"#1B4622"),
				            new Player(400,350,10,100,"#1B4622"),
				            new Player(250,20,10,90,"#1B4622"),
				            new Player(80,220,60,10,"#1B4622"),
				            new Player(40,300,40,10,"#1B4622"),
				            new Player(400,20,10,100,"#1B4622"),
				            new Player(600,20,10,100,"#1B4622"),
				            new Player(200,100,50,10,"#1B4622"),
				            new Player(200,70,10,30,"#1B4622"),
				            new Player(170,60,40,10,"#1B4622"),
				            new Player(350,120,60,10,"#1B4622"),
				            new Player(350,80,10,40,"#1B4622"),
				            new Player(320,70,40,10,"#1B4622"),
				            new Player(500,80,100,10,"#1B4622"),
				            new Player(100,170,60,10,"#1B4622"),
				            new Player(200,130,10,130,"#1B4622"),
				            new Player(590,210,10,250,"#1B4622"),
				            new Player(500,450,90,10,"#1B4622"),
				            new Player(250,450,90,10,"#1B4622"),
				            new Player(250,220,150,10,"#1B4622"),
				            new Player(550,150,10,150,"#1B4622"),
				            new Player(510,200,10,120,"#1B4622"),
				            new Player(350,400,120,10,"#1B4622"),
				            new Player(80,380,30,10,"#1B4622"),
				            new Player(100,380,10,30,"#1B4622"),
				            new Player(100,400,40,10,"#1B4622"),
				            new Player(130,400,10,30,"#1B4622"),
				            new Player(100,430,40,10,"#1B4622"),
				            new Player(100,480,10,60,"#1B4622"),
				            new Player(40,480,80,10,"#1B4622"),
				            new Player(80,450,80,10,"#1B4622"),
				            new Player(180,400,40,10,"#1B4622"),
				            new Player(350,120,10,40,"#1B4622"),
				            new Player(310,150,40,10,"#1B4622"),
				            new Player(310,160,10,30,"#1B4622"),
				            new Player(280,180,30,10,"#1B4622"),
				            new Player(280,90,10,50,"#1B4622"),
				            new Player(280,110,50,10,"#1B4622"),
				            new Player(210,130,70,10,"#1B4622"),
				            new Player(160,170,90,10,"#1B4622"),
				            new Player(250,230,10,250,"#1B4622"),
				            new Player(440,230,10,250,"#1B4622"),
				            new Player(200,430,50,10,"#1B4622"),
				            new Player(200,430,10,70,"#1B4622"),
				            new Player(200,490,90,10,"#1B4622"),
				            new Player(165,200,10,100,"#1B4622"),
				            new Player(200,280,100,10,"#1B4622"),
				            new Player(350,300,100,10,"#1B4622"),
				            new Player(460,70,10,100,"#1B4622"),
				            new Player(500,55,80,10,"#1B4622"),
				            new Player(400,220,10,50,"#1B4622"),
				            new Player(370,260,40,10,"#1B4622"),
				            new Player(300,240,10,50,"#1B4622"),
				            new Player(350,250,10,50,"#1B4622"),
				            new Player(325,250,10,150,"#1B4622"),
				            new Player(330,425,80,10,"#1B4622"),
				            new Player(290,400,45,10,"#1B4622"),
				            new Player(270,360,45,10,"#1B4622"),
				            new Player(370,475,10,50,"#1B4622"),
				            new Player(480,475,10,60,"#1B4622"),
				            new Player(340,450,10,50,"#1B4622"),
				            new Player(590,400,40,10,"#1B4622"),
				            new Player(590,200,40,10,"#1B4622"),
				            new Player(620,250,40,10,"#1B4622"),
				            new Player(590,300,40,10,"#1B4622"),
				            new Player(620,350,40,10,"#1B4622"),
				            new Player(600,490,10,40,"#1B4622"),
				            new Player(550,450,10,40,"#1B4622"),
				            new Player(550,200,50,10,"#1B4622"),
				            new Player(600,150,50,10,"#1B4622"),
				            new Player(460,120,90,10,"#1B4622"),
				            new Player(450,350,90,10,"#1B4622"),
				            new Player(500,400,90,10,"#1B4622"),
				            new Player(500,200,90,10,"#1B4622"),
				            new Player(480,310,30,10,"#1B4622"),
				            new Player(450,260,30,10,"#1B4622"),
				            new Player(380,160,90,10,"#1B4622"),
				            new Player(350,160,10,60,"#1B4622"),
				            new Player(440,170,10,60,"#1B4622"),
				            new Player(210,350,40,10,"#1B4622")};
	
	
	
	//"#1B4622"
	//"#9328A0"

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
		frame.setBounds(100, 100, 710, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		tableroDibujo = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
                g.setColor(Color.decode("#A7C8AC")); // Color del rectángulo
				
				g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
				g.setColor(Color.decode(p1.getC()));
                g.fillRect(p1.getX(),p1.getY(),p1.getAncho(),p1.getAlto());
                g.setColor(Color.decode(meta.getC()));  
                g.fillRect(meta.getX(),meta.getY(),meta.getAncho(),meta.getAlto());
                for (Player obstaculo : obstaculos) {
                	g.setColor(Color.decode(obstaculo.getC()));
                    g.fillRect(obstaculo.getX(),obstaculo.getY(),obstaculo.getAncho(),obstaculo.getAlto());
				}
                
                
			}
		};
		
		frame.getContentPane().add(tableroDibujo, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#1B4622"));		
		frame.getContentPane().add(panel_1 , BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					p1.setX(50);
					p1.setY(50);
					dir=0;
					frame.requestFocus();
					
			}});
		;
		
		frame.addKeyListener(this);
		frame.setFocusable(true);
		
		timer = new Timer(50, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				update();
				
			}});
			timer.start();
	}
	
	

	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
		switch(e.getKeyCode()) {
			case 38: //Flecha Arriba
				dir=1;
				break;
			case 40: //Flecha Abajo
				dir=2;
				break;
			case 37: //Flecha Izquierda
				dir=3;
				break;
			case 39: //Flecha Derecha
				dir=4;
				break;
		}

	}
	
	public void update() {
		
		switch(dir) {
		case 1: //Flecha Arriba
			p1.setY(p1.getY()-10);
			
			break;
		case 2: //Flecha Abajo
			p1.setY(p1.getY()+10);
			
			break;
		case 3: //Flecha Izquierda
			p1.setX(p1.getX()-10);
			
			break;
		case 4: //Flecha Derecha
			p1.setX(p1.getX()+10);
			
			break;
	}
	
	tableroDibujo.repaint();
	for (Player obstaculo : obstaculos) {
		if(p1.colision(obstaculo)) {
			switch(dir) {
			case 1:
				p1.setY(p1.getY()+10);
				break;
			case 2:
				p1.setY(p1.getY()-10);
				break;
			case 3:
				p1.setX(p1.getX()+10);
				break;
			case 4:
				p1.setX(p1.getX()-10);
				break;
				
			}
		}
	}
	
	if(p1.llegoMetea(p1, meta)) {
		timer.stop();
		
		JOptionPane.showMessageDialog(frame, "Felicidades, Ganaste");
	}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
