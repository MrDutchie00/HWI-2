package Week2.Opdracht7;

import TI.BoeBot;

public class OpdrachtB {
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
