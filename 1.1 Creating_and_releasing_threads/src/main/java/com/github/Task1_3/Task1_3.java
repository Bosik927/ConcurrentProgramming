package com.github.Task1_3;

/* Zadanie 1.3.
 * Zaimplementuj funkcję zliczającą krawędzie w grafie (w wersji sekwencyjnej i współbieżnej).
 * Tworzymy n wątków - każdy z nich odpowiedzialny jest za zliczenie krawędzi, które są połączone
 * z wierzchołkiem odpowiadającym numerowi utworzonego wątku.
 *
 * Task 1.3
 * Implement the function counting edges in the graph (in sequential and concurrent version).
 * We create n threads - each of them is responsible for counting the edges that are connected
 * with the vertex corresponding to the number of the created thread.
 */

import com.github.common.Raportable;

/**
 * @author Stanisław Fiuta
 * Date: 8/15/2018
 * Time: 4:33 PM
 */
public class Task1_3 implements Raportable {

    private int[] graphsSizes;
    private double probability;

    public Task1_3(double probability ,int... graphsSize) {
        this.probability= probability;
        this.graphsSizes = graphsSize;
    }

    @Override
    public void generateReport() throws InterruptedException {
        System.out.println("Task 1.3");
        RandomGraphCreator randomGraphCreator;
        randomGraphCreator = new RandomGraphCreator();
        for (int graphSize : graphsSizes) {
            boolean[][] graph =randomGraphCreator.generateGraph(graphSize,probability);
            printGraph(graph);
            System.out.println("Sequential adding:");
            long startTime = System.nanoTime();
            System.out.println("Counter="+new SequentialEdgesCounter(graph).getCounter());
            long endTime = System.nanoTime() - startTime;
            System.out.println("Time:"+endTime+" nanoseconds");
            System.out.print("\n");

            System.out.println("Concurrent adding:");
            startTime = System.nanoTime();
            System.out.println("Counter="+new ConcurrentEdgesCounter(graph).getCounter());
            endTime = System.nanoTime() - startTime;
            System.out.println("Time:"+endTime+" nanoseconds");
            System.out.print("\n");
        }

    }

    private void printGraph(boolean[][] graph){
        for(int i=0; i<graph.length; i++){
            for (int j=0; j<graph.length;j++){
                if(graph[i][j]){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }

}
