package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookies implements ActionListener {
	public void showButton() {
	     System.out.println("Button clicked");
	     JFrame cat = new JFrame ();
	     cat.setVisible(true);
	     cat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     JButton taco = new JButton ();
	     cat.add(taco);
	     taco.addActionListener(this);
	     int Doggie = new Random().nextInt(5);
	     if(Doggie==0) {	     
	     JOptionPane.showMessageDialog(null, "Your hair will turn pink");
	     }
	     
	     
	     
	     
	     
	     
	     
	     cat.pack();
	}
	public static void main(String[] args) {
	FortuneCookies eligah = new FortuneCookies ();
	eligah.showButton();	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		 JOptionPane.showMessageDialog(null, "WooHoo");
		// TODO Auto-generated method stub
		
	}

}
