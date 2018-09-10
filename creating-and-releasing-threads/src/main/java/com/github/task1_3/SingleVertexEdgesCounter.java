package com.github.task1_3;

/**
 * @author Stanisław Fiuta
 * Date: 8/16/2018
 * Time: 6:52 PM
 */
public class SingleVertexEdgesCounter implements Runnable{
    private boolean[][] graph;
    private int row;
    public static int counter;

    SingleVertexEdgesCounter(boolean[][] graph, int row){
        this.row = row;
        this.graph=graph;
    }
    public void run() {
        for (int column = 0; column < row; column++) {
            if(graph[row][column]){
                incrementCounter();
            }
        }
    }
    synchronized void incrementCounter(){
        counter++;
    }
}
