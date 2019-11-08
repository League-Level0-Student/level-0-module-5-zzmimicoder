package Snowflake;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class Snowflake {
	public static void main(String[] args) {
		Robot Hi = new Robot();
		Hi.hide();
		Hi.setX(300);
		Hi.setY(300);
		Hi.penDown();
		Hi.setSpeed(100);
		for (int I = 0; I < 6; I++) {
			Hi.setPenColor(0, 0, 0);
			Hi.move(50);
			Hi.turn(60);
			if (I % 2 == 0) {
				Hi.setPenColor(0, 0, 255);
			} else {
				Hi.setPenColor(255, 0, 0);
			}
			for (int J = 0; J < 6; J++) {
				Hi.turn(-60);
				Hi.move(50);
			}
			Hi.setPenColor(0, 0, 0);
		}
	}
}
