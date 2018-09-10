package com.github.task2_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanisław Fiuta
 * Date: 8/21/2018
 * Time: 6:54 PM
 */
public class ConcurrentValueChecker<T> {
    private int[] checkedArray;
    static boolean result;

    ConcurrentValueChecker(int[] checkedArray){
        this.checkedArray = checkedArray;
        result = false;
    }
    public boolean check(int value) throws InterruptedException {
        if(checkedArray.length<4){
            for (int aCheckedArray : checkedArray) {
                if (aCheckedArray == value) return true;
            }
            return false;
        }

        List<Thread> threads = new ArrayList<>(4);
        int average = checkedArray.length/4;

        Checker.result = false;
        for(int i=0; i <3; i++){
            Thread thread = new Thread(new Checker(i*average,(i*average+average)-1,checkedArray,value));
            thread.start();
            threads.add(thread);
        }
        Thread thread = new Thread(new Checker(3*average,checkedArray.length-1,checkedArray,value));
        thread.start();
        threads.add(thread);

        for (Thread thre : threads) {
            thre.join();
        }

        return Checker.result;
    }





}
