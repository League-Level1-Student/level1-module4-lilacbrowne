import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class practiceTest implements ActionListener {

	public static void main(String[] args) {
		new practiceTest().createUI(); 
	}
	JFrame frame = new JFrame();
	JButton b1 = new JButton(); 
	JButton b2 = new JButton();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField texty = new JTextField(20); 
	private void createUI() {
		frame.setVisible(true);
		frame.setTitle("Riddles!");
		label.setText("Why is an island like the letter T?");
		panel.add(label); 
		frame.add(panel);
		panel.add(texty); 
		b1.setText("Submit");
		b2.setText("Need a hint?");
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(b1);
		panel.add(b2); 
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 
	}

