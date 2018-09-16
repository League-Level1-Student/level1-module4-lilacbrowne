/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

MediaPalace palace = new MediaPalace(); 	
	/*
	 * Work together as a TEAM of 2 or 3 to make this project. We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.

	 * 2. When the mouse is clicked, use the Media Palace (bit.ly/media-palace) to play sounds, show images or speak.
	 * 
	 * 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the color of the current pixel.
	 */

	BufferedImage backgroundImage;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new MagicBox());
		new MagicBox().createUI();
		
		
	}

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}
	JFrame frame = new JFrame("The Magic Box contains many secrets...");
	private void createUI() {

		frame.add(this);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	int color =	backgroundImage.getRGB(e.getX(), e.getY()); 
	Color c = new Color(backgroundImage.getRGB(e.getX(), e.getY()));
	System.out.println(c);
		System.out.println(color);
	//palace.speak("Welcome to the media palace");
	if (color == -4088729) {
		JLabel labell = palace.loadImageFromWithinProject("pink.png");
		this.add(labell);
		palace.playMusicOnComputer("pony.mp3");
		frame.pack();
	} else if (color == -2388480) {
JLabel label4 = palace.loadImageFromWithinProject("flutter.jpg");
this.add(label4); 
		frame.pack();
	} else if (color == -2113411) {
		JLabel label = palace.loadImageFromWithinProject("rainbow.png");
		this.add(label); 
		palace.playMusicOnComputer("pony.mp3");
		frame.pack();
	} else if (color == -3232657) {
		JLabel label3 = palace.loadImageFromWithinProject("sweetie.jpg"); 
		this.add(label3);
		palace.playMusicOnComputer("pony.mp3");
		frame.pack();
	}

frame.pack();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


