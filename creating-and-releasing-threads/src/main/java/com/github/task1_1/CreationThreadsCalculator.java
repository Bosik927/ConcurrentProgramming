package com.github.task1_1;

/**
 * @author Stanisław Fiuta
 * Date: 8/15/2018
 * Time: 2:38 PM
 */
public class CreationThreadsCalculator {

    private int threadsNumber;
    private long averageTime;

    public CreationThreadsCalculator(int threadsNumber) {
        this.threadsNumber = threadsNumber;
        calculateAverageTime();
    }

    public long getAverageTime() {
        return averageTime;
    }

    private void calculateAverageTime() {
        long startTime = System.nanoTime();

        for (int i = 0; i < threadsNumber; i++) {
            new Thread(new MyRunnable());
        }

        averageTime = System.nanoTime() - startTime;
    }
}
