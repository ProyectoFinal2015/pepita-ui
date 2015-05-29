package org.uqbarproject.pepita.game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Gameboard {
	
	private static final int CELLZISE = 50;
	private String tittle;
	private int cantCellX;
	private int cantCellY;

	public Gameboard(String tittle, int cantCellX, int cantCellY) {
		this.tittle = tittle;
		this.cantCellX = cantCellX;
		this.cantCellY = cantCellY;
	}

	public void render() {
		new LwjglApplication(new GameboardListener(this), new GameboardConfiguration(this));
	}

	public int height() {
		return cantCellY * CELLZISE;
	}

	public int width() {
		return cantCellX * CELLZISE;
	}

	// Getters & Setters
	public String getTittle() {
		return tittle;
	}

}
