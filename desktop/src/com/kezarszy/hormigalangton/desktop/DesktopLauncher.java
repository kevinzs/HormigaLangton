package com.kezarszy.hormigalangton.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kezarszy.hormigalangton.HormigaLangton;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = HormigaLangton.WIDTH;
		config.height = HormigaLangton.HEIGHT;
		new LwjglApplication(new HormigaLangton(), config);
	}
}
