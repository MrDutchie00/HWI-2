package Week1.Opdracht4;

import TI.BoeBot;

public class OpdrachtC {
    public static void main(String[] args)
    {
        while (true)
        {
            //Read state of Button 1 and 2
            boolean state = BoeBot.digitalRead(6);
            boolean state2 = BoeBot.digitalRead(10);

            //If Button 1 is pressed, turn light 2 off and let light 1 flash one second on and one second off.
            if (state)
            {
                BoeBot.digitalWrite(15, false);
                BoeBot.digitalWrite(2, true);
                BoeBot.wait(1000);
                BoeBot.digitalWrite(2, false);
                BoeBot.wait(1000);
            }

            //If Button 2 is pressed, turn Light 1 off and let light 2 flash 0.7 seconds on and 0.7 seconds off.
            else if (state2)
            {
                BoeBot.digitalWrite(2, false);
                BoeBot.digitalWrite(15, true);
                BoeBot.wait(700);
                BoeBot.digitalWrite(15, false);
                BoeBot.wait(700);
            }

            //If no button is pressed, turn Light 2 off and let light 1 flash 1.3 seconds on and 0.7 seconds off.
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
