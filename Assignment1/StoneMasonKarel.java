/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		while(frontIsClear()) {
			fixAColumn();
			turnAround();
			goToWall();
			turnLeft();
			moveToNextColumn();
		}
		fixAColumn();
		turnAround();
		goToWall();
		turnLeft();
//		fixAColumn();
	//	turnAround();
	//	goToWall();
//		turnLeft();
		//moveToNextColumn();
		
		//fixAColumn();
	// */
		
	//	if (noBeepersPresent()) {
		// 	putBeeper(); 	
	//	} 
	//	move();
			
		
		
	//	walkToNextColumn();
	}
	 
	
	private void goToWall() { 
		while (frontIsClear()) {
			move();
		}	
	}
	
	private void moveToNextColumn() {
		for (int i = 0; i < 4; i++) {
			move(); 	
		}
	} 
	
	private void fixAColumn () {
		if (noBeepersPresent())	{
			putBeeper();
		}																				
		turnLeft();
		while (frontIsClear()) {
			move();
			
		
			if (noBeepersPresent()) {
				putBeeper();
			}
		}
	}
	
	public void walkToNextColumn () {
		move();
		for (int i = 0; i < 4; i++) {
			
		}
		
		
		
	}
}
