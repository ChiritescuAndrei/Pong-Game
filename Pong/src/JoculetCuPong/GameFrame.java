package JoculetCuPong;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GamePanel panel;
	ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("Pong.png"));

	GameFrame() {

		panel = new GamePanel();
		this.setIconImage(logo.getImage());
		this.add(panel);
		this.setTitle("JoculetPong");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
