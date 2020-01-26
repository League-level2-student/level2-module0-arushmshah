package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	boolean top = false;

	//2. create an array of 5 robots.
	Robot[] robots = new Robot [5];
	//3. use a for loop to initialize the robots.
for(int i = 0; i<robots.length; i++) {
	robots[i] = new Robot();

		//4. make each robot start at the bottom of the screen, side by side, facing up
robots[i].setY(490);
robots[i].setX((i+1)*140);
robots[i].setSpeed(150);
}
	//5. Use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
while(top==false) {
for(int o = 0; o<robots.length; o++) {
Random randy = new Random();	
int x = randy.nextInt(50);
robots[o].move(x);

if(robots[o].getY()<=0) {
	 top = true;
	 System.out.println(o);
}
}
}	

	//7. declare that robot the winner and throw it a party!

	//8. optional: try different races with different amounts of robots.

	//9. make the robots race around a circular track.

}
}
