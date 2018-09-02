package com.github.Task2_5;

/* Zadanie 2.5.
 * Napisać program, który wielowątkowo sprawdza, czy wartość X występuje w tablicy A.
 * Wariant 1. Tablica A jest jednowymiarowa
 * Wariant 2. Tablica A jest dwuwymiarowa
 */

import com.github.common.Raportable;

/**
 * @author Stanisław Fiuta
 * Date: 8/20/2018
 * Time: 9:47 PM
 */
public class Task2_5 implements Raportable {

    @Override
    public void generateReport() {

      /*  for(int i =0; i<200; i++){
            System.out.println("Value: "+i+" average: " + i/8);
        }*/
        int length = 1;
        int j = (length/8)+1;

        System.out.println(j);
        /*for(; j<200; j++){
            System.out.println(j);
        }*/



    }
}
