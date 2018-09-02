package com.github.Task1_1;

/*
 * Zadanie 1.1.
 * Sprawdzić jaki jest narzut czasowy związany z utworzeniem i zwolnieniem wątku.
 *
 * Task 1.1.
 * Check what is the time associated with creating and releasing a thread.
 */

import com.github.common.Raportable;

/**
 * @author Stanisław Fiuta
 * Date: 8/15/2018
 * Time: 4:06 PM
 */
public class Task1_1 implements Raportable {

    private int[] threadsNumbers;

    public Task1_1(int... threadsNumbers) {
        this.threadsNumbers = threadsNumbers;
    }

    @Override
    public void generateReport() {
        System.out.println("Task 1.1\nAverage time for creating threads:");
        CreationThreadsCalculator creationThreadsCalculator;
        for (int threadsNumber : threadsNumbers) {
            creationThreadsCalculator = new CreationThreadsCalculator(threadsNumber);
            System.out.format("Number threads: %d Average time: %d nanoseconds\n", threadsNumber, creationThreadsCalculator.getAverageTime());
        }
    }
}
