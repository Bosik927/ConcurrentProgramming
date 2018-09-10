package com.github.task1_3;

/**
 * @author Stanisław Fiuta
 * Date: 8/16/2018
 * Time: 5:56 PM
 */
public class SequentialEdgesCounter {

    private boolean[][] graph;
    private int counter;

    SequentialEdgesCounter(boolean[][] graph){
        this.graph = graph;
        countEdges();
    }

    private void countEdges() {
        counter = 0;
        for (int i = 1; i < graph.length; i++) {
            for (int j = 0; j < i; j++) {
               if(graph[i][j]){
                   counter++;
               }
            }
        }
    }

    public int getCounter(){
        return counter;
    }

}
