import TI.BoeBot;
import TI.Timer;

public class RobotMain {
    public static void main(String[] args)
    {
        while (true)
        {
            boolean state = BoeBot.digitalRead(6);
            boolean state2 = BoeBot.digitalRead(10);
            if (state)
            {
                BoeBot.digitalWrite(15, false);
                BoeBot.digitalWrite(2, true);
                BoeBot.wait(1000);
                BoeBot.digitalWrite(2, false);
                BoeBot.wait(1000);
            }

            else if (state2)
            {
                BoeBot.digitalWrite(2, false);
                BoeBot.digitalWrite(15, true);
                BoeBot.wait(700);
                BoeBot.digitalWrite(15, false);
                BoeBot.wait(700);
            }
            else
            {
                BoeBot.digitalWrite(15, false);
                BoeBot.digitalWrite(2, true);
                BoeBot.wait(1300);
                BoeBot.digitalWrite(2, false);
                BoeBot.wait(700);
            }
        }
    }
}