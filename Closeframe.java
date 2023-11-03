package javaprograms225f8;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Closeframe extends Frame
{
	Closeframe()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
}
