package Tomato_Bite;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot adibot = new Robot();
		adibot.setSpeed(20);
		adibot.setPenColor(255, 0, 0);
		adibot.penDown();
		adibot.move(150);
		adibot.turn(90);
		adibot.move(100);
		adibot.turn(90);
		adibot.move(150);
		adibot.turn(180);
		adibot.move(75);
		adibot.turn(270);
		adibot.move(100);
		adibot.penUp();
		adibot.move(-200);
		

	}
}
