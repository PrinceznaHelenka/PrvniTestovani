package com.helenka.havelkova;

/**
 * Created by helena on 25.6.17.
 */
public class jmena {
    public static void main(String[] args) {
            System.out.println("\nAhoj " +pozdrav(String.valueOf(args[0]),String.valueOf(args[1]))+"! \n\n");
        }

    public static String pozdrav(String jmeno, String prijmeni) {
        String pozdraveni;
        pozdraveni = jmeno + prijmeni;
        return pozdraveni;
    }


}
