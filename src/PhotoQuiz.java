/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String image = "http://2app.kicksonfire.com/kofapp/upload/events_master_images/ipad_e863115c028f9768d4e846b5584c4feb5a67e33c7fdc5.jpg";
		// 2. create a variable of type "Component" that will hold your image
           Component eligah ;
		// 3. use the "createImage()" method below to initialize your Component
           eligah = createImage (image);
		// 4. add the image to the quiz window
              quizWindow.add(eligah);
		// 5. call the pack() method on the quiz window
              quizWindow.pack();
		// 6. ask a question that relates to the image
      String  frog = JOptionPane.showInputDialog("Do you Now the Name of Kanye West Shoes ? ");  
		// 7. print "CORRECT" if the user gave the right answer
     if(frog.equalsIgnoreCase("Yeezys")) {
     System.out.println("your correct");
     }
		// 8. print "INCORRECT" if the answer is wrong
     else {
    	 System.out.println("incorrect");
     }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(eligah);
		// 10. find another image and create it (might take more than one line of code)
Component jakob ;
jakob = createImage ("https://images.solecollector.com/complex/image/upload/dula0xvz5mgl3d6b1fb8.jpg");
		// 11. add the second image to the quiz window
quizWindow.add(jakob);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String toad = JOptionPane.showInputDialog("What are the name of these shoes ");
		// 14+ check answer, say if correct or incorrect, etc.ther 
if(toad.equalsIgnoreCase("Jordans")) {
	System.out.println("Your correct");
}
else {
	System.out.println("incorrect");
}
	}
	
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





