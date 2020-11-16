package Week1.Opdracht3;

import TI.BoeBot;

public class OpdrachtC {
    public static void main(String[] args)
    {
        while (true)
        {
            //Read state of the button
            boolean state = BoeBot.digitalRead(10);

            //If button is pressed, turn light 2 off and let light 1 flash 1.3 seconds on and 0.7 off. Else turn led 1 off and led 2 on
            if (state)
            {
                BoeBot.digitalWrite(15, false);
                BoeBot.digitalWrite(2, true);
                BoeBot.wait(1300);
                BoeBot.digitalWrite(2, false);
                BoeBot.wait(700);
            }
            else
            {
                BoeBot.digitalWrite(2, false);
                BoeBot.digitalWrite(15, true);
            }
        }
    }

}
