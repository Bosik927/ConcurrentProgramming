package com.github.Task2_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanisław Fiuta
 * Date: 8/21/2018
 * Time: 6:44 PM
 */
public class Checker implements Runnable {

    private int min;
    private int max;
    private ArrayList list;

    Checker(int min, int max, ArrayList list){
        this.min = min;
        this.max = max;
        this.list = list;
    }

    @Override
    public void run() {
        for(;min<=max; min++){
            
        }

    }
}
