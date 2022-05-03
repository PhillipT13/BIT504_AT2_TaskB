package main;



import java.awt.Color;

import javax.swing.JFrame;


public class Pong extends JFrame{

	public Pong() {
    	setTitle("Pong");
    	setSize(800, 600);
    	setResizable(false);
    	add(new PongPanel());
    	//Frame jframe = null;
    	JFrame frame = new JFrame();
    	frame.setBackground(Color.BLACK);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	//New Comment to test Github Push
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       javax.swing.SwingUtilities.invokeLater(new Runnable() {
	       public void run() {
	    	   new Pong();
           }
       });
	}
}
