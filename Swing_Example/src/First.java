import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class First extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     First f=new First();
	f.setSize(250, 300);
    f.setTitle("Hello World");
	f.setVisible(true);
	
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
 public void paint(Graphics g){
	 
	 this.setBackground(Color.BLUE);
	
	 g.setColor(Color.BLUE);
 }
}
