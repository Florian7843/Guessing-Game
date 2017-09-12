package me.florian7843.guessingame.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by florian_7843 on 11.09.2017.
 * Server: DocsMc.tk
 * Ts: ts.docsmc.tk
 */
public class Main {

    static int tries = 5;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = randomInt(1,100);
        int tryed = 0;
        int i = 0;
        System.out.println("Ich denke mir eine Zahl Zwischen 1 und 100. Du musst diese in "+tries+" zügen erraten.");
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

    private static int randomInt(int min, int max){
        Random r = new Random();
        int i = r.nextInt((max-min) +1 ) +min;
        return i;
    }


}
