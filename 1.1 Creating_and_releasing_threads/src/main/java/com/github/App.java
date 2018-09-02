package com.github;

import com.github.Task1_1.Task1_1;
import com.github.Task1_3.Task1_3;
import com.github.Task2_5.Task2_5;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Stanisław Fiuta
 * Date: 8/15/2018
 * Time: 2:37 PM
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        /*Task1_1 task1_1 = new Task1_1(1, 100, 1000, 10000, 100000);
        task1_1.generateReport();*/

        /*Task1_3 task1_3 = new Task1_3(0.3,4,8,5,6);
        task1_3.generateReport();*/

        Task2_5 task2_5 = new Task2_5();
        task2_5.generateReport();
    }
}
