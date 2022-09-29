package co.speedup.qa.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotDelete implements Interaction {
    @Override
    public <T extends Actor> void performAs(T t) {
        try {
            Robot robot = new Robot();
            for (int j = 0; j < 11; j++) {
                robot.keyPress(KeyEvent.VK_BACK_SPACE);
                robot.keyRelease(KeyEvent.VK_BACK_SPACE);
            }
        }catch (AWTException e) {
            e.printStackTrace();
        }
    }
    public static RobotDelete on() {
        return new RobotDelete();
    }
}
