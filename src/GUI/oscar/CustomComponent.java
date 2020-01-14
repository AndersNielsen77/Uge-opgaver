package GUI.oscar;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class CustomComponent extends JPanel implements Runnable {
	private static final long serialVersionUID = 1L;
	public Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN,Color.DARK_GRAY, Color.GRAY, Color.GREEN,Color.LIGHT_GRAY, Color.MAGENTA,Color.ORANGE, Color.PINK, Color.RED,Color.YELLOW};
	public Graphics g ;

	public void run() {

		boolean thread_active = true;
		while (thread_active) {
			while (isShowing()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Random r = new Random();

				int x = r.nextInt(1000);
				int y = r.nextInt(300);
				int z = r.nextInt(12);
				int h = r.nextInt(50);
				int b = r.nextInt(50);
				g = getGraphics();

				g.fillRect(x,y,h,b);

				g.setColor(colors[z]);
				g.fillRect(x,y,h,b);
			}
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);  
	}
}

