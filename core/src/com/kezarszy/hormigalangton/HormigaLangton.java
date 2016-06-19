package com.kezarszy.hormigalangton;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HormigaLangton extends ApplicationAdapter {

	public static final int WIDTH = 16*60; //960
	public static final int HEIGHT = 9*60; //540

	public SpriteBatch batch;
	public Tablero tablero;

	@Override
	public void create () {
		batch = new SpriteBatch();
		tablero = new Tablero();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		tablero.draw(batch);
		tablero.update();
		batch.end();
	}
}
