package com.github.Task3_1;

/**
 * @author Stanisław Fiuta
 * Date: 9/2/2018
 * Time: 2:18 PM
 */
public class PasswordChacker implements Runnable {

    private static volatile boolean isPasswordFound;

    private int from;
    private int to;

    PasswordChacker(int from, int to){
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
      /*  for(int i=from; i<to; i++)

            for (int i = from; i < to ; i++){

            }
        if(!isPasswordFound){

        }*/

    }
}
