package Code4Life;
import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
public class Code4Life {
	public static void main(String[] args) {
		int Answer = Integer.parseInt(JOptionPane.showInputDialog("How Many Hours Did You Code This Week?"));
		if (Answer <= 2) {
			JOptionPane.showMessageDialog(null, "Stop Watching Youtube And Code More");
		} else if (Answer >= 3 && Answer <= 5) {
			JOptionPane.showMessageDialog(null, "You're A Code Ninja");
		} else if (Answer > 5) {
			PlayBatmanTheme();
		}
	}
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