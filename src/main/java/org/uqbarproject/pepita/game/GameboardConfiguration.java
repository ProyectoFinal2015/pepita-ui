package org.uqbarproject.pepita.game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class GameboardConfiguration extends LwjglApplicationConfiguration {

	public GameboardConfiguration(Gameboard gameboard) {
		this.useGL30 = false;
		this.title = gameboard.getTittle();
		this.width = gameboard.width();
		this.height = gameboard.height();
	}

}
