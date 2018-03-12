package com.company;

public class Main {

    public static void main(String[] args) {

        double lengte = 5.3;
        double breedte = 8.6;

        double oppervlakte = lengte * breedte;
        double omtrek = 2 * ( lengte + breedte );

        System.out.println("oppervlakte = " + oppervlakte);
        System.out.println("omtrek = " + omtrek );

    }
}
