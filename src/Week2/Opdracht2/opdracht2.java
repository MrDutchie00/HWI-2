package Week2.Opdracht2;

import TI.BoeBot;
import TI.PWM;

public class opdracht2
{
    public static void main(String[] args)
    {
        //PWM aanmaken
        PWM pwm = new PWM(15,255);
        PWM pwm2 = new PWM(4,0);

        //PWM starten
        pwm.start();
        pwm2.start();

        int led1 = 255;
        int led2 = 0;

        int i= 0;

        while (true)
        {
            //voor een getal die gelijk staat aan 0 wordt er iedere keer een getal bij opgeteld om de 20 miliseconden. Hierdoor gaat 1 lampje feller branden en 1 lampje minder.
            for (i = 0; i < 255; i++)
            {
                led1--;
                led2++;

                pwm.update(led1);
                pwm2.update(led2);
                BoeBot.wait(2000/255);
            }

            //voor een getal die gelijk staat aan 255 wordt er iedere keer een getal van af gehaald om de 20 miliseconden. Hierdoor gaat 1 lampje feller branden en 1 lampje minder.
            for (i = 255; i > 0; i--)
            {
                led1++;
                led2--;

                pwm.update(led1);
                pwm2.update(led2);
                BoeBot.wait(2000/255);
            }
        }
    }
}
