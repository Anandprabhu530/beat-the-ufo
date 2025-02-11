package com.example.asteroids;


import javax.swing.JFrame;

public class App {
    public static void main( String[] args ){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.setResizable(true);
        window.setTitle("Beat the UFO");
        
        Gameclass gamePanel = new Gameclass();
        
        window.add(gamePanel);
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        gamePanel.startGame();
    }
}
