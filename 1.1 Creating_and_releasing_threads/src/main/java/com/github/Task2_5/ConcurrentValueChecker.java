package com.github.Task2_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanisław Fiuta
 * Date: 8/21/2018
 * Time: 6:54 PM
 */
public class ConcurrentValueChecker<T> {
    private ArrayList checkedArray;
    static boolean result;

    ConcurrentValueChecker(ArrayList checkedArray){
        this.checkedArray = checkedArray;
        result = false;
    }
    boolean check(T value){
        if(checkedArray.size()<8){
            for(int i=0; i<checkedArray.size();i++){
                if(checkedArray.get(i) == value) return true;
            }
            return false;
        }
        int averge = checkedArray.size()/8;

        List<Thread> threads = new ArrayList<>();

        for(int i=0; i <8; i++){
            Thread thread1 = new Thread(new Checker(0,averge,checkedArray));
            thread1.start();
            threads.add(thread1);
        }



        Thread thread2 = new Thread(new Checker(0,averge,checkedArray));
        Thread thread3 = new Thread(new Checker(0,averge,checkedArray));
        Thread thread4 = new Thread(new Checker(0,averge,checkedArray));
        Thread thread5 = new Thread(new Checker(0,averge,checkedArray));
        Thread thread6 = new Thread(new Checker(0,averge,checkedArray));
        Thread thread7 = new Thread(new Checker(0,averge,checkedArray));
        Thread thread8 = new Thread(new Checker(0,averge,checkedArray));




        return true;
    }
}
