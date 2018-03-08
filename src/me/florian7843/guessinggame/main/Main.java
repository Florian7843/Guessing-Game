package me.florian7843.guessinggame.main;

import me.florian7843.guessinggame.types.TYPECustom;
import me.florian7843.guessinggame.types.TYPEDefault;
import me.florian7843.guessinggame.types.TYPEHard;
import me.florian7843.guessinggame.types.Types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by florian_7843 on 11.09.2017.
 */
public class Main {

    public static int min = 1;
    public static int max = 100;
    public static int tries = 5;

    private static HashMap<String, Types> types = new HashMap<>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        addTypes();

        String variants = "";
        for(Map.Entry entry : types.entrySet()){
            if(variants.equalsIgnoreCase("")){
                variants += entry.getKey();
            } else {
                variants += ", " +entry.getKey();
            }

        }

        Types type = Types.DEFAULT;

        System.out.println("Dies ist ein Rate Spiel. Welche variante willst du Spielen?");
        System.out.println("Mögliche Varianten: " + variants);

        String t = br.readLine();

        if (types.containsKey(t)) {
            type = types.get(t);
        } else {
            System.err.println("Variante " + type + " nicht gefunden!");
            System.exit(2);
        }

        if (type.equals(Types.CUSTOM)) {
            TYPECustom.useCustom();
        }
        if (type.equals(Types.HARD)) {
            TYPEHard.useHard();
        }

        TYPEDefault.startDefault();


    }

    public static int randomInt(int min, int max) {
        Random r = new Random();
        int i = r.nextInt((max - min) + 1) + min;
        return i;
    }

    public static void addTypes() {
        types.clear();
        types.put("DEFAULT", Types.DEFAULT);
        types.put("CUSTOM", Types.CUSTOM);
        types.put("HARD", Types.HARD);
    }
}
