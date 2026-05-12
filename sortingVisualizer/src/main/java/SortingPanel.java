package src.main.java;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SortingPanel extends JPanel {
    private static final int RECT_WIDTH = 8;
    private static final int NUM_BARS = SortVisualizer.WIN_WIDTH / RECT_WIDTH;
    private  int[] array;

    private void shuffleArray(){
        Random rng = new Random();
        for (int i = 0; i < NUM_BARS; i++){
            int swap = rng.nextInt(NUM_BARS - 1 );
            int temp = array[i];
            array[i] = array[swap];
            array[swap] = temp;
        }
    }

    // numero officina bombolone 3289365476

    public SortingPanel(){
        array = new int[NUM_BARS];
        for (int i = 0; i < NUM_BARS; i++){
            array[i] = i;
        }
        shuffleArray();
        setBackground(Color.darkGray);
        new Thread(() -> new BubbleSort(this).runSort(array)).start();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        for (int i = 0; i < NUM_BARS; i++){
            int heigth = getValue(i) * 2;
            int x = i + (RECT_WIDTH - 1) * i;
            int y = SortVisualizer.WIN_HEIGHT - heigth;
            g.fillRect(x,y, RECT_WIDTH, heigth);
        }
    }
    public static void sleepFor(long milliSecDelay){
        try {
            Thread.sleep(milliSecDelay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void swap(int firstIndex, int secondIndex, long milliSecDelay){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

        repaint();
        sleepFor(milliSecDelay);
    }

    public int arraySize(){
        return array.length;
    }

    public int getValue(int i){
        return array[i];
    }




}
