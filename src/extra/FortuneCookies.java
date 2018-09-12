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
	     JButton taco = new JButton ("Click here for fortune !!!!");
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
		  int Doggie = new Random().nextInt(5);
		     if(Doggie==0) {	     
		     JOptionPane.showMessageDialog(null, "Your hair will turn pink");
		     }
		     else if (Doggie==1) {
		    	 JOptionPane.showMessageDialog(null, "Your butt will despair ");
		     }
		     else if (Doggie==2) {
		    	 JOptionPane.showMessageDialog(null," You will get on your next test");
		    	 
		     }
		     else if (Doggie==3) {
		    	 JOptionPane.showMessageDialog(null,"Your haur will fall off ");
		    	 
		     }
		     else if (Doggie==4) {
		    	 JOptionPane.showMessageDialog(null," I will be in your dreams");
		    	 
		     }
		     else if (Doggie==5) {
		    	 JOptionPane.showMessageDialog(null, "You will turn super sayin ");
		     }
		// TODO Auto-generated method stub
		
	}

}
