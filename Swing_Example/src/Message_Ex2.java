import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;


public class Message_Ex2 extends JFrame{
	
    public Message_Ex2() {
		// TODO Auto-generated constructor stub
	this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	});
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Message_Ex2 m=new Message_Ex2();
    m.setTitle("New Message");
    m.setSize(500, 600);
    m.setVisible(true);
	}
	public void paint(Graphics g){
		this.setBackground(Color.YELLOW);
		g.setColor(Color.RED);
		Font f=new Font("Times New Roman",Font.BOLD,20);
		g.setFont(f);
		g.drawString("Inheritx", 50, 80);
	}

}
