package com.kingdoms.screens;

import com.kingdoms.KingdomsGame;
import com.kingdoms.state.World_State;

public class Screen_Gameplay extends Cad_Screen {

	private KingdomsGame game;
	private World_State state;
	
	public Screen_Gameplay(KingdomsGame game) {
		this.game = game;
		this.state = new World_State();
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(float delta) {
		state.update(delta);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
