package GUI.oscar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class MainHead extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	public JTextArea txtarea;
	public JPanel p1;
	public JButton b1;

	public MainHead() {
		getContentPane().setLayout(new BorderLayout());
		p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));

		txtarea = new JTextArea();
		JScrollPane scrollpane = new JScrollPane(txtarea);
		txtarea.setLineWrap(true);
		
		b1 = new JButton("Quit");
		b1.addActionListener(this);
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		getContentPane().add(b1, BorderLayout.SOUTH);
		
		CustomComponent t2 = new CustomComponent();
		p1.add(t2);
		p1.add(scrollpane);
		getContentPane().add(p1, BorderLayout.CENTER);
		
		ThreadClass t1 = new ThreadClass(txtarea);
		Thread T1 = new Thread(t1);
		Thread T2 = new Thread(t2);
		
		T1.start();
		T2.start();
	}

	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == b1) {
			 System.exit(0);
	        }
	}

	public static void main(String[] args) {
		MainHead simplegui = new MainHead();
		simplegui.setTitle("Firkanter og cirkler");
		simplegui.setSize(800, 800);
		simplegui.setResizable(true);
		simplegui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		simplegui.setVisible(true);
	}
}
