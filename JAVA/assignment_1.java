/* Name = Soham Patel
 * Program name = assignment_1
 * Date = May 26, 2023
 * Description = This program will calculate the maximum distance
 */
import java.util.Scanner;
import java.lang.Math;
public class assignment_1 {

	public static void main(String[] args) {
		Scanner myinput = new Scanner (System.in);
	    System.out.println("Please enter the angle in degrees:");
	    double angleDegrees = Math.abs(myinput.nextDouble());
	    
	    System.out.println("Please enter the velocity:");
	    double velocity = Math.abs(myinput.nextDouble());
	    
	    double gravitational_force = 9.8;
	    
	    double angleRadians = Math.toRadians(angleDegrees);
	    double maximum_distance = (Math.pow(velocity, 2) * Math.sin(2 * angleRadians)) / gravitational_force;
	    
	    System.out.println("The maximum distance covered by the projectile is: " + String.format("%.3f", maximum_distance));
	}

}
