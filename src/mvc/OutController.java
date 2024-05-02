package mvc;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class OutController {

	private JFrame frame;
	private OutView view;

	
	public OutController() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame ();
		frame.setVisible(false);
		frame.setBounds(100, 100, 564, 713);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,1,0,1));
		
		view = new OutView();
		
	}
	
	public void login() {
		
		frame.add(view.login());
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
		
	}
	

}
