package com.github.task2_5;

/* Zadanie 2.5.
 * Napisać program, który wielowątkowo sprawdza, czy wartość X występuje w tablicy A.
 * Wariant 1. Tablica A jest jednowymiarowa
 * Wariant 2. Tablica A jest dwuwymiarowa
 */


/**
 * @author Stanisław Fiuta
 * Date: 8/20/2018
 * Time: 9:47 PM
 */
public class Task2_5{

    public void generateReport(int size) throws InterruptedException {
        RandomIntArrayGenerator randomIntArrayGenerator = new RandomIntArrayGenerator(size);
        int randomArray[] = randomIntArrayGenerator.generateArray();

        long startTime = System.nanoTime();
        boolean result;

        SequentialValueChecker sequentialValueChecker = new SequentialValueChecker(randomArray);
        result = sequentialValueChecker.check(1000);

        System.out.println("Sequential checker time: "+ (System.nanoTime() - startTime) + " result " + result);

        long startTime2 = System.nanoTime();

        ConcurrentValueChecker concurrentValueChecker = new ConcurrentValueChecker(randomArray);
        result = concurrentValueChecker.check(1000);

        System.out.println("Concurrent checker time: "+ (System.nanoTime() - startTime2) + " result " + result);
    }
}
