package javaprograms225f8;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Frames extends Frame {
	Frames()
	{
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
				});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("My first Frame");
		f.setSize(400,500);
		f.setBounds(100, 200, 500, 600);
		f.setVisible(true);
		f.add(new Mycomponent());
	}
	static class Mycomponent extends Component
{
	public void paint(Graphics g)
	{
		//g.setColor(Color.PINK);
		g.drawRect(100, 200, 100, 200);//draws rectangle
		g.fillRect(100, 200, 100,200);//fill the rectangle
		g.drawOval(500, 200, 100, 200);//draws circle
		g.drawLine(100,200,30,40);
		g.draw3DRect(ALLBITS, ABORT, WIDTH, HEIGHT, getFocusTraversalKeysEnabled());
	}
}
}


