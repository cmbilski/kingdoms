package com.kingdoms.state;

public class World_State {

	// Week data
	public static final float WEEK_TIME = 2;
	public static final int MAX_WEEKS = 10;
	public float weekTimeElapsed;
	public int curWeek;
	
	public float food;
	
	public World_State() {
		// initialize
		weekTimeElapsed = 0;
		curWeek = 0;
	}
	
	public void update(float delta) {
		// Increment the week counter
		weekTimeElapsed += delta;
		
		// Check if we need to increment the week
		if (weekTimeElapsed > WEEK_TIME) {
			newWeek();
		}
	}
	
	private void newWeek() {
		// Turn the week over
		curWeek = (++curWeek) % MAX_WEEKS;
		// Generate a new year
		if (curWeek == 0) {
			newYear();
		}
		weekTimeElapsed = 0;
		
		System.out.printf("Week %d\n", curWeek);
	}
	
	private void newYear() {
		
	}
	
}
