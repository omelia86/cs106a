/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() 
	{   
		putABeeperRow();
		repositiontToWest();
		
	  
	  
		
	}
	private void putABeeperRow() {
		putBeeper();
		while(frontIsClear()) {
			moveSafely();
			if(frontIsClear()) {
				moveSafely(); 
				putBeeper(); 				
			}
		}
	}
	private void moveSafely() {
		if (frontIsClear()) {
			move();
		}
	}
	private void repositiontToWest() {
		turnLeft();
		moveSafely();
		turnLeft();
		
	}
}

