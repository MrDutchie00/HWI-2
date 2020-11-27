package Week3.Opdracht1;

import TI.BoeBot;

public class OpdrachtA {
    public static void main(String[] args) {
        System.out.println("luisteren");
        while (true) {
            int pulseLength = BoeBot.pulseIn(6, false, 6000);
            if (pulseLength > 2000)
            {
                int lengtes[] = new int[12];
                for (int i = 0; i <12; i++)
                {
                    lengtes[i] = BoeBot.pulseIn(6, false, 20000);
                }

                for (int i = 0; i<12; i++)
                {
                    System.out.println(lengtes[i] + ", ");
                }
                System.out.println("");
            }
        }
    }
}
