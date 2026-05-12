package src.main.java;

import javax.swing.*;

public class SortVisualizer {
    public static final int WIN_HEIGHT = 720;
    public static final int WIN_WIDTH = 1280;
    private JFrame window;


    public SortVisualizer(){
        window = new JFrame("Sort visualizer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WIN_WIDTH, WIN_HEIGHT);

        window.add(new SortingPanel());
        window.setVisible(true);
    }


    public static void main(String[] args){
        SortVisualizer sv = new SortVisualizer();
    }

}
