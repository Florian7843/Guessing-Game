package me.florian7843.guessinggame.types;

import java.io.IOException;

import static me.florian7843.guessinggame.main.Main.*;

/**
 * Created by florian_7843 on 13.09.2017.
 */
public class TYPEDefault {

    public static void startDefault() throws IOException{
        int tryed = 0;
        int i = 0;

        int count = randomInt(min,max);

        System.out.println("Ich denke mir eine Zahl Zwischen "+min+" und "+max+". Du musst diese in "+tries+" zügen erraten.");
        System.out.print("Deine Zahl:");
        try{
            i = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Das ist keine Zahl!");
            tryed--;
        }
        while (i != count){
            if(tryed >= tries-1){
                System.out.println("Du hast deine Versuche Verbraucht! Die Zahl war " + count);
                System.exit(1);
            }
            if(i < count){
                System.out.println("Deine Zahl ist zu Klein!");
            } else if(i > count){
                System.out.println("Deine Zahl ist zu Groß!");
            }
            System.out.print("Deine Zahl:");
            try{
                i = Integer.parseInt(br.readLine());
            }catch(NumberFormatException nfe){
                System.err.println("Das ist keine Zahl!");
                tryed--;
            }
            tryed++;
        }
        if(i == count){
            System.out.println("Du hast die Zahl erraten!");
        }
    }

}
