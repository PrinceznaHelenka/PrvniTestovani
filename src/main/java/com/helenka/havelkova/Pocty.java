package com.helenka.havelkova;

/**
 * Created by helena on 21.6.17.
 */
public class Pocty {

    public static void main (String[] args) {
        System.out.println(" Vysledek po souctu je " +scitani(Integer.valueOf(args[2]),Integer.valueOf(args[3])) +
                           ",\n vysledek po odecteni je "+odecitani(Integer.valueOf(args[2]),Integer.valueOf(args[3])) +
                           ",\n vysledek po nasobeni je "+nasobeni(Integer.valueOf(args[2]),Integer.valueOf(args[3])) +
                           ",\n vysledek po deleni je "+deleni(Integer.valueOf(args[2]),Integer.valueOf(args[3])) +
                           "." );

    }

    public static int scitani (int cislo1, int cislo2){
        int soucet;
        soucet = cislo1 + cislo2;
        return soucet;
    }
    public static int odecitani (int cislo1, int cislo2){
        int rozdil;
        rozdil = cislo1 - cislo2;
        return rozdil;
    }
    public static int nasobeni (int cislo1, int cislo2){
        int soucin;
        soucin = cislo1 * cislo2;
        return soucin;
    }
    public static int deleni (int cislo1, int cislo2){
        int podil;
        podil = cislo1 / cislo2;
        return podil;
    }
}
