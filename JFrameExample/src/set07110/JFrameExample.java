package set07110;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class JFrameExample {

	public static void main(String[] args) {

		JFrame frame = new JFrame("JFrame Example");
		
		@SuppressWarnings("serial")
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g = (Graphics2D)g;
				
				g.setColor(Color.GREEN);
				g.fillRect(0, 0, 300, 400);
				g.setColor(Color.RED);
				g.drawOval(100, 100, 50, 50);
				g.setColor(new Color(0,128,0)); 
				g.fillRect(0,0,150,100);
			}
		};
		panel.setLayout(null);
		frame.add(panel);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
