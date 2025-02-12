package com.example.asteroids;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Gameclass extends JPanel implements Runnable{
	
	int XOffset = 100;
	int YOffset = 100;
	int dif = 4;
	int FPS = 60;
	KeyInputHandler keyHandler = new KeyInputHandler();
	Gameclass(){
		this.setPreferredSize(new Dimension(500,320));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyHandler);
		this.setFocusable(true);
	}
	
	Thread gameThread;
	
	public void startGame(){
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
//		double currTime = 1000000000/FPS;
//		double timeDiff = System.nanoTime()+currTime;
		while(gameThread!=null) {
			// Update game
			update();
			// Render to screen
			repaint();
//			try {
//				double remTime = timeDiff - System.nanoTime();
//				remTime = remTime/1000000;
//				
//				if(remTime<0) {  
//					remTime = 0;
//				}
//				
//				Thread.sleep((long)remTime);
//				
//				timeDiff += currTime;
//			}catch(Exception e){
//				System.out.println("Error" + e);
//			}
		}
	}
	
	public void update() {
//		if(keyHandler.keyUp) {
//			YOffset -= dif;
//		}else if(keyHandler.keyDown) {
//			YOffset += dif;
//		}else if(keyHandler.keyLeft) {	
//			XOffset -= dif;
//		}else if(keyHandler.keyRight) {
//			XOffset += dif;
//		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D graphics = (Graphics2D)g;
		graphics.setColor(Color.white);
		graphics.drawPolygon(new int[] {10, 20, 30}, new int[] {10, 30, 10}, 3);
		
	
		// 10, 10
		// 20, 30
		// 30, 10
		 	
		// (10,10)*------*(30,10)
//		           \    /
//		            \  /
//		             \/
//		              *(20,30)
		
//		graphics.rotate(30, XOffset, YOffset);;
		graphics.dispose();
	}
}
