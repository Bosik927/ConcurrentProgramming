package com.github.Task1_3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Stanisław Fiuta
 * Date: 8/15/2018
 * Time: 4:38 PM
 */
public class RandomGraphCreator {

    private int graphSize;
    private double probability;

    public RandomGraphCreator() {    }

    public  boolean[][] generateGraph(int graphSize, double probability) {
        this.graphSize = graphSize;
        this.probability = probability;
        boolean[][] graph = new boolean[graphSize][graphSize];
        createFirstHalfGraph(graph);
        fillSecondHalfGraph(graph);
        return  graph;
    }

    private void createFirstHalfGraph(boolean[][] graph) {
        for (int i = 1; i < graphSize; i++) {
            for (int j = 0; j < i; j++) {
                if (ThreadLocalRandom.current().nextDouble(0, 1) > probability) {
                    graph[i][j] = false;
                } else {
                    graph[i][j] = true;
                }
            }
        }
    }

    private void fillSecondHalfGraph(boolean[][] graph) {
        for (int i = 0; i < graphSize; i++) {
            for (int j = graphSize-1; j > i; j--) {
                graph[i][j] = graph[j][i];
            }
        }
    }
}
