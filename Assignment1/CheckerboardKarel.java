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
	public void run() {
		if(frontIsBlocked()) {
			turnLeft();
			putBeeper();
			while(frontIsClear()) {
				putBeeper2();
				moveSafely();
			}
				
		} else {
			putBeeper();
			while(frontIsClear()) {
				putBeeper2();
				moveSafely();
				if(frontIsBlocked()) {
					if(facingEast()) {
						if(leftIsBlocked()) {
							putBeeper2();
							moveSafely();
						} else {
							putBeeper2();
							turnLeft();
							moveSafely();
							putBeeper2();
							turnLeft();
					    }
					}
				}	
				if(frontIsBlocked()) {
					if(facingWest()) {
						if(rightIsBlocked()) {
							moveSafely();
						} else {
							putBeeper2();
							turnRight();
							moveSafely();
							putBeeper2();
							turnRight();
						}
					}
				}
			}
		}
	}
			
	
		
		
		
		
		/*
		while (frontIsClear()) {
			//moveSafely(); 
			while (frontIsBlocked()) {
				checkEast();
				checkWest();
				
			} */
	//	}	
		
		
    

	
	private void putBeeper2() {
		turnAround();
		moveSafely();
		if(noBeepersPresent()) {
			turnAround();
			moveSafely();
			putBeeper();
		} else 
		{
			turnAround();
			moveSafely();
		}
			
	
		
	}	
			
		
	private void moveSafely() {
		if(frontIsClear())
			move();
	}
	
	private void putBeeper1() {
		/*while (frontIsClear()) {
		putBeeper();
		moveSafely();
		turnAround();
		moveSafely();
		if 	(noBeepersPresent())
		{ 
			putBeeper();
			turnAround();
			moveSafely();
			moveSafely();
			
		}
		else { 
			turnAround();
			moveSafely();
		    moveSafely();}
		    }
	}*/
		
	/*putBeeper();
	moveSafely();
	moveSafely();
	moveSafely();
	turnAround();
	moveSafely();
	if (noBeepersPresent()) {
		putBeeper();
	}*/
		/*while(frontIsClear()) {
		putBeeper();
		moveSafely();
		moveSafely();}*/
		turnAround();
		moveSafely();
		if(noBeepersPresent()) {
			moveSafely();
			putBeeper();
			moveSafely();
			moveSafely();
			turnAround();
			moveSafely();
			moveSafely();
		}
		
	}
		
 		
	
	
	private void checkEast() {
		if(frontIsBlocked()) {
			if(facingEast()) {
				turnLeft();
				moveSafely();
				turnLeft();				
			}
		}
	}
	
    private void checkWest() {
	    if(frontIsBlocked()) {
			 if(facingWest())
				 turnRight();
			     moveSafely();
			     turnRight();
			 }}
			}
