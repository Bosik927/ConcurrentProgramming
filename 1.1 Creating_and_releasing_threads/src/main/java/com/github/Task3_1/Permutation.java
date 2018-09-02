package com.github.Task3_1;

import java.util.ArrayList;
import java.util.List;

import static com.github.Task3_1.PasswordGeneratorEntity.*;

/**
 * @author Stanisław Fiuta
 * Date: 9/2/2018
 * Time: 2:50 PM
 */


class Permutation {

    static void combinationUtil(List<String> arr, int data[], int start, int end, int index, int r)
    {
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }

        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
          /*  data[index] = arr[i];*/
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }


    static void printCombination(List<String> arr, int n, int r)
    {
        int data[]=new int[r];
        combinationUtil(arr, data, 0, n-1, 0, r);
    }

    public static void main (String[] args) {
        PasswordGeneratorEntity entity = new PasswordGeneratorEntity.Builder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .build();

        ArrayList<String> charCategories = new ArrayList<>(4);

        if (entity.isUseLower()) {
            charCategories.add(LOWER_LETTERS);
        }
        if (entity.isUseUpper()) {
            charCategories.add(UPPER_LETTERS);
        }
        if (entity.isUseDigits()) {
            charCategories.add(DIGITS);
        }
        if (entity.isUsePunctuation()) {
            charCategories.add(PUNCTUATION);
        }

        int r = 3;
        int n = charCategories.size();

       /* printCombination(arr, n, 5);*/
    }
}
