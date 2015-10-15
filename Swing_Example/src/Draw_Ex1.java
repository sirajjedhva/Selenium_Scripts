import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class Draw_Ex1 extends JFrame {
	public Draw_Ex1() {
		// TODO Auto-generated constructor stub
	
	this.addWindowListener(new WindowAdapter() {
		public void windowAdapter(WindowEvent we){
			System.exit(0);
		}
	});
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw_Ex1 dr=new Draw_Ex1();
		dr.setTitle("Boxes");
		dr.setSize(500, 500);
        dr.setVisible(true);	
	}
    public void paint(Graphics g){
    	g.setColor(Color.blue);
    	g.drawLine(100, 100, 100, 200);
    	//g.drawRect(25, 30, 150, 200);
    	g.fillRect(50, 50, 100, 100);
    	g.fillRoundRect(300, 200, 100, 80, 10, 10);
    	g.fillOval(170, 150, 60, 40);
    	
    }
}
