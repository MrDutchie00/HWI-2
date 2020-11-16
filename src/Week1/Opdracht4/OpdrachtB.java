package Week1.Opdracht4;

import TI.BoeBot;

public class OpdrachtB {
    public static void main(String[] args)
    {
        while (true)
        {
            //Read state of Button 1 and Button 2
            boolean state = BoeBot.digitalRead(6);
            boolean state2 = BoeBot.digitalRead(10);

            //If button 1 is pressed, let LED 1 flash one second on and one second off.
            if (state)
            {
                BoeBot.digitalWrite(2, true);
                BoeBot.wait(1000);
                BoeBot.digitalWrite(2, false);
                BoeBot.wait(1000);
            }
            else
            {
                BoeBot.digitalWrite(2, false);
                BoeBot.digitalWrite(15, false);
            }

            //If Button 2 is pressed, let LED 2 flash 0.7 seconds on and 0.7 seconds off.
            if (state2)
            {
                BoeBot.digitalWrite(15, true);
                BoeBot.wait(700);
                BoeBot.digitalWrite(15, false);
                BoeBot.wait(700);
            }
            else
            {
                BoeBot.digitalWrite(2, false);
                BoeBot.digitalWrite(15, false);
            }
        }
    }
}
