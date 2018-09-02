package com.github.Task1_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanisław Fiuta
 * Date: 8/16/2018
 * Time: 6:45 PM
 */
public class ConcurrentEdgesCounter {

    private boolean[][] graph;
    private int counter = 0;

    public ConcurrentEdgesCounter(boolean[][] graph) throws InterruptedException {
        this.graph = graph;
        countEdges();
    }

    private void countEdges() throws InterruptedException {
        List<Thread> threads = new ArrayList<Thread>();
        SingleVertexEdgesCounter.counter = 0;
        for (int row = 1; row < graph.length; row++) {
            Thread thread = new Thread(new SingleVertexEdgesCounter(graph, row));
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.join();
        }
        counter = SingleVertexEdgesCounter.counter;
    }

    public int getCounter() {
        return counter;
    }
}
