package com.github.Task2_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanisław Fiuta
 * Date: 8/21/2018
 * Time: 6:29 PM
 */
public class SequentialValueChecker<T>{

    private ArrayList checkedArray;

    SequentialValueChecker(ArrayList checkedArray){
        this.checkedArray = checkedArray;
    }

    void check(T value){
       for(int i=0; i<checkedArray.size();i++){
           if(checkedArray.get(i) == value) break;
       }
    }
}
