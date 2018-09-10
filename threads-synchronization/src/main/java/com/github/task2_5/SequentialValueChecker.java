package com.github.task2_5;

import java.util.ArrayList;

/**
 * @author Stanisław Fiuta
 * Date: 8/21/2018
 * Time: 6:29 PM
 */
public class SequentialValueChecker{

    private int[] checkedArray;

    SequentialValueChecker(int[] checkedArray){
        this.checkedArray = checkedArray;
    }

    boolean check(int value){
        for (int aCheckedArray : checkedArray) {
            if (aCheckedArray == value) return true;
        }
       return false;
    }
}
