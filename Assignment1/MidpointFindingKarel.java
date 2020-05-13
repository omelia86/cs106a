/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {
	public void run() {
		fillTheRowOfBeepers();
		removeBeeperFromEachSide();
		
//		moveToBeeperRowEdge();
//		pickBeeper();
//		reposition();
//		
//		moveToBeeperRowEdge();
//		pickBeeper();
//		reposition();
//		
//		moveToBeeperRowEdge();
//		pickBeeper();
//		reposition();
		
		while(frontIsClear()) {
			moveToBeeperRowEdge();
			foo();
			if(frontIsClear()) {
				reposition();				
			}
			
		}		
	}
	
	private void reposition() {
		walkToWall();
		turnAround();
	}
	
	private void fillTheRowOfBeepers() {
		putBeeper();
		while(frontIsClear()) {
			move();
			putBeeper();
		}
	}
	
    private void walkToBeepersEdge(){
		while (frontIsClear()) {
    		if(noBeepersPresent()) {
    			turnLeft();
    		}
			moveSafely();
		}
 
    }
    
    private void moveSafely() {
       if(frontIsClear())
    	   move();
    }
    private void walkToBeepersEdge1() {
    	while(frontIsClear()) {
    		if(noBeepersPresent()) {
    			turnLeft();
    		}
    		moveSafely();
    		
    	}
    	
     }
	private void removeBeeperFromEachSide() {
		turnAround();
		pickBeeper();
		walkToWall();
		turnAround();
		pickBeeper();
	}
	
	private void walkToWall() {
		while (frontIsClear()) {
			move();			
		}
	}
	private void moveToBeeperRowEdge(){
		while(noBeepersPresent()) {
			moveSafely();	
		}
	}
	private void foo() {
		
		move();
		if (beepersPresent()){
			turnAround();
			move();
			turnAround();
			pickBeeper();
		} else {
			if(facingEast()) {
				turnRight();
			}
			
			if(facingWest()) {
				turnLeft();
			}
		}
	}
}

