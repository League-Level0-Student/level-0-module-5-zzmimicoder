package SkillPractice;
import javax.swing.JOptionPane;
import java.util.Random;
public class SkillPractice {
	public static void main(String[] args) {
		Skill1();
		Skill2();
		Skill3();
	}
	static void Skill1() {
		int Dimes = 0;
		Dimes = Integer.parseInt(JOptionPane.showInputDialog("How Many Dimes?"));
		JOptionPane.showMessageDialog(null, "You Have " + Dimes * 10 + "¢");
		int Feet = 0;
		Feet = Integer.parseInt(JOptionPane.showInputDialog("How Tall Are You In Feet?"));
		if (Feet * 12 < 36) {
			JOptionPane.showMessageDialog(null, "Eat Your Wheaties");
		}
	}
	static void Skill2() {
		for (int X = 0; X < 31; X++) {
			if (X % 3 == 0) {
				System.out.print(X + " ");
			}
		}
	}
	static void Skill3() {
		Random Rand = new Random();
		System.out.println("");
		int Num1 = Rand.nextInt(21);
		int Num2 = Rand.nextInt(10);
		System.out.println(Num1);
		System.out.println(Num2);
		System.out.println("The Difference Is " + Integer.toString(Num1 - Num2));
	}
	static void Skill4() {
		
	}
}