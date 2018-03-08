package me.florian7843.guessinggame.types;

import me.florian7843.guessinggame.main.Main;

import java.io.IOException;

/**
 * Created by florian_7843 on 13.09.2017.
 */
public class TYPECustom {

    public static void useCustom(){
        try {
            System.out.println("Was ist die Kleinstmögliche Zahl? DEFAULT: 1");
            try {
                Main.min = Integer.parseInt(Main.br.readLine());
            }catch (NumberFormatException nfe){
                System.err.println("Das ist keine Zahl!");
            }

            System.out.println("Was ist die Größtmögliche Zahl? DEFAULT: 100");
            try {
                Main.max = Integer.parseInt(Main.br.readLine());
            }catch (NumberFormatException nfe){
                System.err.println("Das ist keine Zahl!");
            }

            System.out.println("Wie viele Versuche brauchst du? DEFAULT: 5");
            try {
                Main.tries = Integer.parseInt(Main.br.readLine());
            }catch (NumberFormatException nfe){
                System.err.println("Das ist keine Zahl!");
            }
        }catch (IOException ex){

        }
    }

}
