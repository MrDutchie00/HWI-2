import TI.BoeBot;
import TI.PWM;
import TI.Servo;

import java.awt.*;
import java.util.BitSet;

public class RobotMain {

    public static void main(String[] args) {
        while (true) {
            slowwhoop();
        }
    }

    public static void slowwhoop(){
        for(int i = 1000; i< 2000; i++) {
            BoeBot.freqOut(0, i, 1);
        }
    }

}