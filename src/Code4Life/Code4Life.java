package Code4Life;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;

public class Code4Life {
	public static void main(String[] args) {
		PlayBatmanTheme();
	}
	// 1. Ask the user how many hours they spent coding this week.

	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.

	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja

	// 4. If it is more than 5, call the method below to play the Batman theme song.

	private static void PlayBatmanTheme() {
		try {
			AudioClip Sound = JApplet.newAudioClip(Code4Life.class.getResource("Batman.wav"));
			Sound.play();
			Thread.sleep(60002);
		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
	}

}