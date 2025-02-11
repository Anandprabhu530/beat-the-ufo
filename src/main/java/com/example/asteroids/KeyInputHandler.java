package com.example.asteroids;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInputHandler implements KeyListener{


	public boolean keyUp, keyDown, keyLeft, keyRight;

	@Override
	public void keyPressed(KeyEvent event) {
		int e = event.getKeyCode();
		if(e==KeyEvent.VK_UP) {
			keyUp = true;
		}else if(e==KeyEvent.VK_DOWN) {
			keyDown = true;
		}else if(e==KeyEvent.VK_LEFT) {
			keyLeft = true;
		}else if(e==KeyEvent.VK_RIGHT) {
			keyRight = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent event) {
		int e = event.getKeyCode();
		if(e==KeyEvent.VK_UP) {
			keyUp = false;
		}else if(e==KeyEvent.VK_DOWN) {
			keyDown = false;
		}else if(e==KeyEvent.VK_LEFT) {
			keyLeft = false;
		}else if(e==KeyEvent.VK_RIGHT) {
			keyRight = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e){}

}
