package com.github.task2_5;

import java.util.Random;

/**
 * @author Stanisław Fiuta
 * Date: 9/10/2018
 * Time: 7:35 PM
 */
public class RandomIntArrayGenerator {

    private int size;
    private int generatedArray [];


    public RandomIntArrayGenerator(int size){
        this.size = size;
        generatedArray = new int[size];
    }

    public int[] generateArray(){
        for (int i = 0; i <size ; i++){
            generatedArray[i]= generateInt();
        }
        return generatedArray;
    }

    private int generateInt(){
        return (new Random().nextInt(10000) + 1);
    }

}
