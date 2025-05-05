
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Gurnoor Gill Date: April 19th, 2023
 *
 */
public class RaceTrackNew extends JFrame {
	
	// Declare Variables
	
	String name;
	String speedShow;
	int ySpeed = 0;
	int x = 233, y = 380;
	int delay = 5; // variable to slow down animation.
	ImageIcon CarF, CarL, CarR, CarD, Track, Go, R1, R2 , R3, load, GCarD; // variables for pictures
	String answer = "Y";
	int counter = 1;
	
	public RaceTrackNew() {
		// This builds our window
		 super("RaceTrack"); // Display title for our window
		 
		
		
		setSize(774, 517); // Sets size of window by (x,y) pixels
		Track = new ImageIcon("RaceTrack.PNG");

		IO.display("Hello, Ladies and Gentlemen to the annual DSSS Racing Competition");
		
		setVisible(true); // displays window
		setDefaultCloseOperation(EXIT_ON_CLOSE); // clean up program
			
	}
	

	public void paint(Graphics g) {
		
		// Show track and prompt user for name
		Track.paintIcon(this, g, 0, 0);
		name = IO.readString(" Could we get the racer's name today?");
		
		// Repeat loop when answer is "Y"
		 while (answer.equals("Y")) {
		
		
		
		/* ask user to enter the speed at which the car will move
		* The array called speed creates the options Slow, Medium, Fast, and Very Fast as Strings and stored in variable Speed. 
		* Used to display in the dialog box
		*/
		String[] speed = { "Slow", "Medium", "Fast", "Very Fast" };
		
		
		/*
		 * Here we use JOptionPane.showOptionDialog to prompt the user to pick from one of strings stored in "speed" 
		 * We change the usual prompt when asking for an input using JOptionPane to the 4 speeds
		 */
		
		int xSpeed = JOptionPane.showOptionDialog(null, "Select one:", "Pick a Speed!", 0 ,1 , null, speed, speed[0]);
		

		// To increase the overall speed we are raising the speed by a little for each speed as well as making vertical speed equal to horinzontal.
		if (xSpeed == 0) {
			xSpeed++;
			speedShow = "Slow";
			ySpeed = xSpeed;
		}

		else if (xSpeed == 1) {
			xSpeed++;
			speedShow = "Medium";
			ySpeed = xSpeed;
		}

		else if (xSpeed == 2) {
			xSpeed++;
			speedShow = "Fast";
			ySpeed = xSpeed;
		}

		else if (xSpeed == 3) {
			xSpeed++;
			speedShow = "Very Fast";
			ySpeed = xSpeed;
		}
		
		
		// Ask user colour preference of their car
		String[] colour = { "Green", "Red", "Blue","Purple"};
		
		int car = JOptionPane.showOptionDialog(null, "Select one:", "Pick your car colour!", 0 ,1 , null, colour, colour[0]);

		// Assign chosen colour to car
		if (car == 0) {
			CarL = new ImageIcon("GCarLeft.png");
			CarR = new ImageIcon("GCarRight.png");
			CarF = new ImageIcon("GCarFront.png");
			CarD = new ImageIcon("GCarDown.png");
		}
		
		if (car == 1) {
			CarL = new ImageIcon("RCarLeft.png");
			CarR = new ImageIcon("RCarRight.png");
			CarF = new ImageIcon("RCarFront.png");
			CarD = new ImageIcon("RCarDown.png");
		}
		
		if (car == 2) {
			CarL = new ImageIcon("CarLeft.png");
			CarR = new ImageIcon("CarRight.png");
			CarF = new ImageIcon("CarFront.png");
			CarD = new ImageIcon("CarDown.png");
		}
		
		if (car == 3) {
			CarL = new ImageIcon("PCarLeft.png");
			CarR = new ImageIcon("PCarRight.png");
			CarF = new ImageIcon("PCarFront.png");
			CarD = new ImageIcon("PCarDown.png");
		}

		// Display message to get ready for the race
		IO.display("Okay " + name + "\nGet Ready to Race.");
		
	
		
		
		for (int i = 0; x < 585; i++) {
			Track.paintIcon(this, g, 0, 0);
			
			
			x = x + xSpeed; // This causes the x value to increase by 1 until the coordinate (585, y) is less than (x, y)
			CarR.paintIcon(this, g, x, 380); // Car will move right until the coordinate (585, y) is less than (x, y)
			
			// Display name, speed, and lap
			g.drawString("User Name: " + name, 500, 300);
			g.drawString("Speed: " + speedShow, 500, 330);
			g.drawString("Lap: " + counter, 500, 360);

			//use a try/catch structure o put program to sleep for ms
			try {
				Thread.sleep(delay);
				; // delay program
			} catch (Exception Error) {
				// leave blank
			}
			

		}

		for (int i = 0; y > -15; i++) {
			Track.paintIcon(this, g, 0, 0);
			y = y - ySpeed;
			CarD.paintIcon(this, g, 582, y);
			
			// Display name, speed, and lap
			g.drawString("User Name: " + name, 500, 300);
			g.drawString("Speed: " + speedShow, 500, 330);
			g.drawString("Lap: " + counter, 500, 360);
			
			//use a try/catch structure o put program to sleep for ms
			try {
				Thread.sleep(delay);
				; // delay program
			} catch (Exception Error) {
				// leave blank
			}
			
		}

		
		for (int i = 0; x > -15; i++) {
			Track.paintIcon(this, g, 0, 0);
			x = x - xSpeed;
			CarL.paintIcon(this, g, x, -15);
			
			// Display name, speed, and lap
			g.drawString("User Name: " + name, 500, 300);
			g.drawString("Speed: " + speedShow, 500, 330);
			g.drawString("Lap: " + counter, 500, 360);
			
			//use a try/catch structure o put program to sleep for ms
			try {
				Thread.sleep(delay);
				; // delay program
			} catch (Exception Error) {
				// leave blank
			}
			

		}

		for (int i = 0; y < 110; i++) {
			Track.paintIcon(this, g, 0, 0);
			y = y + ySpeed;
			CarF.paintIcon(this, g, -15, y);
			
			// Display name, speed, and lap
			g.drawString("User Name: " + name, 500, 300);
			g.drawString("Speed: " + speedShow, 500, 330);
			g.drawString("Lap: " + counter, 500, 360);

			//use a try/catch structure o put program to sleep for ms
			try {
				Thread.sleep(delay);
				; // delay program
			} catch (Exception Error) {
				// leave blank
			}
			
		}

		
		for (int i = 0; x < 260; i++) {
			Track.paintIcon(this, g, 0, 0);
			x = x + xSpeed;
			CarR.paintIcon(this, g, x, 110);
			
			// Display name, speed, and lap
			g.drawString("User Name: " + name, 500, 300);
			g.drawString("Speed: " + speedShow, 500, 330);
			g.drawString("Lap: " + counter, 500, 360);
			
			//use a try/catch structure o put program to sleep for ms
			try {
				Thread.sleep(delay);
				; // delay program
			} catch (Exception Error) {
				// leave blank
			}
			
		}

		for (int i = 0; y < 230; i++) {
			Track.paintIcon(this, g, 0, 0);
			y = y + ySpeed;
			CarF.paintIcon(this, g, 260, y);
			
			// Display name, speed, and lap
			g.drawString("User Name: " + name, 500, 300);
			g.drawString("Speed: " + speedShow, 500, 330);
			g.drawString("Lap: " + counter, 500, 360);

			//use a try/catch structure o put program to sleep for ms
			try {
				Thread.sleep(delay);
				; // delay program
			} catch (Exception Error) {
				// leave blank
			}
			
		}

		
		for (int i = 0; x > -15; i++) {
			Track.paintIcon(this, g, 0, 0);
			x = x - xSpeed;
			CarL.paintIcon(this, g, x, 230);
			
			// Display name, speed, and lap
			g.drawString("User Name: " + name, 500, 300);
			g.drawString("Speed: " + speedShow, 500, 330);
			g.drawString("Lap: " + counter, 500, 360);

			//use a try/catch structure o put program to sleep for ms
			try {
				Thread.sleep(delay);
				; // delay program
			} catch (Exception Error) {
				// leave blank
			}
			
		}

		for (int j = 0; y < 375; j++) {
			Track.paintIcon(this, g, 0, 0);
			y = y + ySpeed;
			CarF.paintIcon(this, g, -15, y);
			
			// Display name, speed, and lap
			g.drawString("User Name: " + name, 500, 300);
			g.drawString("Speed: " + speedShow, 500, 330);
			g.drawString("Lap: " + counter, 500, 360);

			//use a try/catch structure o put program to sleep for ms
			try {
				Thread.sleep(delay);
				; // delay program
			} catch (Exception Error) {
				// leave blank
			}
			
		}

		for (int i = 0; x < 233; i++) {
			Track.paintIcon(this, g, 0, 0);
			x = x + xSpeed;
			CarR.paintIcon(this, g, x, 375);
			
			// Display name, speed, and lap
			g.drawString("User Name: " + name, 500, 300);
			g.drawString("Speed: " + speedShow, 500, 330);
			g.drawString("Lap: " + counter, 500, 360);

			//use a try/catch structure o put program to sleep for ms
			try {
				Thread.sleep(delay);
				; // delay program
			} catch (Exception Error) {
				// leave blank
				
			}
			
		}
		// if answer is Y it will repeat the code
		answer = JOptionPane.showInputDialog(null, "Want to go a bit faster or maybe slower? Let's try again! \nType \"Y\" to proceed");
		counter++; // Increase counter by 1 to show lap has been completed
	}
	
	}
	public static void main(String[] args) {
		new RaceTrackNew();
		

	}

}