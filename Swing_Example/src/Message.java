import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class Message extends JFrame {
	Message(){
		//code to close frame 
		this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we){
		System.exit(0);	
		}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Message m=new Message();
    m.setTitle("String Swing");
    m.setSize(500,600);
    m.setVisible(true);
	}
	public void paint(Graphics g){
	this.setBackground(Color.green);
	g.setColor(Color.RED);
	Font f=new Font("Times New Roman",Font.BOLD+Font.ITALIC,40);
	g.setFont(f);
	g.drawString("Hello World...", 60, 60);
	}

}
