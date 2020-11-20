package Week2.Opdracht1;

import TI.BoeBot;
import TI.PWM;

public class OpdrachtC
{
    public static void main(String[] args)
    {
        PWM pwm = new PWM(15, 100); //PWM aanmaken
        pwm.start();//PWM starten

        int dutyCycle = 0; //int aanmaken voor de opdracht die op 0 staat

        while (true)
        {
            //Als dutyCycle op 0(%) staat, en kleiner is dan 100(%), voeg dan 1(%) toe en update de PWM iedere 0.02 seconden
            for (dutyCycle = 0; dutyCycle < 100; dutyCycle++){
                pwm.update(dutyCycle);
                BoeBot.wait(20);
            }
        }
    }
}
