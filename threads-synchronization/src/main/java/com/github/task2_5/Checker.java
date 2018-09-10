package com.github.task2_5;

import java.util.ArrayList;

/**
 * @author Stanisław Fiuta
 * Date: 8/21/2018
 * Time: 6:44 PM
 */
public class Checker implements Runnable {

    static boolean result;
    private int value;
    private int min;
    private int max;
    private int[] list;

    Checker(int min, int max, int[] list, int value){
        this.min = min;
        this.max = max;
        this.list = list;
        this.value = value;
    }

    public void run() {
        for(int i = min ;i<=max; i++){
            if(result) break;
            if(list[i]==value) result=true;
        }
    }
}
