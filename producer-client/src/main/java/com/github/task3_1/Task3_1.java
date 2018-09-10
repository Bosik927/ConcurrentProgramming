package com.github.task3_1;

/**
 * @author Stanisław Fiuta
 * Date: 9/2/2018
 * Time: 2:09 PM
 */
public class Task3_1 {

    static public void main(String[] a){

        PasswordGenerator passwordGenerator = new PasswordGenerator(new PasswordGeneratorEntity.Builder()
                .useDigits(true)
                .useLower(true)
                .useUpper(true)
                .build());

    }

}
