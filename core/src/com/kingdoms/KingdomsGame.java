package com.kingdoms;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kingdoms.screens.Cad_Screen;
import com.kingdoms.screens.Screen_Gameplay;

public class KingdomsGame extends ApplicationAdapter {

	private Cad_Screen screen;
	
	@Override
	public void create () {
		this.screen = new Screen_Gameplay(this);
	}

	@Override
	public void render () {
		float delta = Gdx.graphics.getDeltaTime();
		// Update the screen
		screen.update(delta);
		// Render the screen
		screen.render(delta);
	}
}
